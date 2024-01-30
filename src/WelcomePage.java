import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class WelcomePage extends JFrame{

	private JLabel mailLabel,passwordLabel;
	
	private JPasswordField passwordField;
	
	private JTextField mailField;
	
	private JButton loginButton,signupButton;
	
	
	public WelcomePage() {
		
		User u1 = new User();
		
		Box mainBox = Box.createVerticalBox();
		
		
		JFrame frame = new JFrame("Welcome");
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame.setSize(800,500);
		
		mailLabel = new JLabel("Mail:        ");
		
		passwordLabel = new JLabel("Password:  ");
		
		
		passwordField = new JPasswordField(20);
		
		loginButton = new JButton("Login");
		
		
		
		

		signupButton = new JButton("Sign Up");
		
		
		signupButton.addActionListener(      // signup butonu listeneri ve kullanıcı oluşturma yeri
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String mail=mailField.getText();
						
						
						String password = String.valueOf(passwordField.getPassword()); 
						
						
					
					
						if(mail.isEmpty()  || password.isEmpty()) {
							
							
							JOptionPane.showMessageDialog(frame, "Please enter username and password!");
						}
						else {
							
						u1.setMail(mail);
						
						u1.setPassword(password);
						
						mailField.setText("");
						
						passwordField.setText("");
						
						
						JOptionPane.showMessageDialog(frame, "User created succesfully!");
						
						}
						
						
					}
				}
		);
		
	
		
		loginButton.addActionListener(     // login button action listener kullanıcı bilgileri kontrolu 
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						String mail=mailField.getText();
						
						
						String password = String.valueOf(passwordField.getPassword()); 
						
					
					
						if(mail.isEmpty()  || password.isEmpty()) {
							
							
							JOptionPane.showMessageDialog(frame, "Please enter username and password!");
							
						}
					
						else if(mail.equals(u1.getMail()) && password.equals(u1.getPassword())) {
								
							 
								JOptionPane.showMessageDialog(frame, "Welcome back!");
								
								frame.setVisible(false);
								
								MainPage p1 = new MainPage();
							}
						
						else {
							JOptionPane.showMessageDialog(frame, "User not found!");
						}
						
						
						
						
						}
						
					
				}
		);
		
		mailField = new JTextField(20);
		
		
		JPanel p1 = new JPanel(); // componentlerin eklenmesi
	
	
		
		p1.add(Box.createRigidArea(new Dimension(2000, 10))); // boşluk bırakma 
		p1.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		
		
		p1.add(mailLabel);
		
		p1.add(mailField);
		
		p1.add(Box.createRigidArea(new Dimension(2000, 10)));
		p1.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		p1.add(passwordLabel);
		

		
		p1.add(passwordField);
		
		
		p1.add(Box.createRigidArea(new Dimension(2000, 10)));
		p1.add(Box.createRigidArea(new Dimension(2000, 10)));
		
		p1.add(loginButton);
		
		p1.add(signupButton);
		
		frame.add(p1);
		
		
		
	}
	
	
	
	
	
	
	
}
