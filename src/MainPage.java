import javax.swing.*;

import java.awt.*; 
import java.awt.event.*;

public class MainPage {

	private JButton editButton;
	
	private JButton searchjobButton;
	
	private JButton searchpeopleButton;
	
	private JButton disconnectButton;
	
	public MainPage() {
		
		JFrame frame = new JFrame("Main Page");
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		
		frame.setSize(800,500);
		
		
		JPanel panel = new JPanel();
		
		
		editButton = new JButton("Edit Profile");
		
		
		editButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(false);
						
							EditProfilePage p1 = new EditProfilePage();
					
						
						
						}
						
					
				}
		);
		
		searchjobButton = new JButton("Search For Job");
		
		searchjobButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(false);
						
							BrowsePage p1 = new BrowsePage();
					
						
						
						}
						
					
				}
		);
		
		disconnectButton = new JButton("Logout");
		disconnectButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JOptionPane.showMessageDialog(panel, "You have been successfully logged out.");
						frame.setVisible(false);
						
							WelcomePage p1 = new WelcomePage();
					
						
						
						}
						
					
				}
		);
		
		searchpeopleButton = new JButton("Search For People");
		
		searchpeopleButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(false);
						
							SearchPeople p1 = new SearchPeople();
					
						
						
						}
						
					
				}
		);
		
		panel.add(editButton);
		
		panel.add(searchjobButton);
		
		panel.add(searchpeopleButton);
		
		panel.add(disconnectButton);
		
		
		
		frame.add(panel);
		
		
		
		
		
	}
	
	
	
	
}
