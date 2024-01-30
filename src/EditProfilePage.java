import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

import java.io.File;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class EditProfilePage {

	
	private JButton okButton;
	
	private JButton gobackButton;
	
	private JLabel nameLabel;
	
	private JLabel titleLabel;
	
	private JTextField titleField;
	
	private JLabel universityLabel;
	
	private JLabel mailLabel;
	
	private JLabel passwordLabel;
	
	private JTextField nameField;
	
	private JTextField mailField;
	
	private JTextField passwordField;
	
	private JRadioButton maleButton;
	
	private JRadioButton femaleButton;
	
	private JLabel genderLabel;
	
	private JButton changePhoto;
	
	private JLabel picLabel;
	
	private ImageIcon imageIcon;
	
	private JLabel photoLabel;
	
	public EditProfilePage() {
		
		JFrame frame = new JFrame("Edit Profile");
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setSize(800,500);
		
		JPanel panel = new JPanel();
		
		okButton = new JButton("Apply Changes");
		
		okButton.addActionListener(     
				new ActionListener() { // exception önlemek için boş olup olmadığının kontrolü 
					public void actionPerformed(ActionEvent e) {
						if(String.valueOf(nameField.getText()).isEmpty()  || String.valueOf(nameField.getText()).isEmpty() || String.valueOf(mailField.getText()).isEmpty() || String.valueOf(passwordField.getText()).isEmpty() || String.valueOf(titleField.getText()).isEmpty()) {
							
							JOptionPane.showMessageDialog(panel, "Please enter all informations!");
						} else {
							
							JOptionPane.showMessageDialog(panel, "Informations are changed successfully!");
						}
						
						
						}
						
					
				}
		);
		

		
		
		
		gobackButton = new JButton("Go Back");
		
		gobackButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(false);
						
							MainPage p1 = new MainPage();
					
						
						
						}
						
					
				}
		);
		
		
		
		mailLabel = new JLabel("Mail:     ");
		
		
		passwordLabel = new JLabel("Password: ");
		
		changePhoto = new JButton("Change Photo");
		
		 picLabel = new JLabel();
		
		changePhoto.addActionListener(      // fotoğraf eklenmesi ve dosyanın seçilmesi kısmı
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						  JFileChooser fileChooser = new JFileChooser();
						 
					        int result = fileChooser.showOpenDialog(fileChooser); // this ifadesi burada zaten bir Component'tir

					        if (result == JFileChooser.APPROVE_OPTION) {
					            File selectedFile = fileChooser.getSelectedFile();
					           imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
					           
					           Image scaledImage = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					            ImageIcon scaledIcon = new ImageIcon(scaledImage);
					            
					            picLabel.setIcon(scaledIcon);
					        }
						
						
						}
						
					
				}
		);
		
		titleLabel = new JLabel("Title:    "); // componentlerin eklenmesi 
		
		
		universityLabel = new JLabel("Graduated University:");
		
		
		
		nameLabel = new JLabel("Name:     ");
		
		
		maleButton = new JRadioButton("Male     ");
		
		femaleButton = new JRadioButton("Female    ");
		
		genderLabel = new JLabel("Gender:   ");
		
		nameField = new JTextField(20);
		
		mailField = new JTextField(20);
		
		passwordField = new JTextField(20);
		
		titleField = new JTextField(20);
		
		photoLabel = new JLabel("Profile Photo:");
		
		panel.add(nameLabel);
		
		panel.add(nameField);
		
panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(mailLabel);
		
		panel.add(mailField);
		
panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		
		panel.add(passwordLabel);
		
		panel.add(passwordField);
		
panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(titleLabel);
		
		panel.add(titleField);
		
panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(genderLabel);
		
		panel.add(maleButton);
		
		panel.add(femaleButton);
		
panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(photoLabel);
		
		panel.add(picLabel)	;	
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		panel.add(okButton);
		
		panel.add(changePhoto);
		
		panel.add(gobackButton);
		
		
		
		
		
		frame.add(panel);
		
		
	}
}
				
