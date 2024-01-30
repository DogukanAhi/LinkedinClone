import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class SearchPeople {

	
private JLabel l1;
	
	private JTable table;
	
	
	
	private JButton filterButton;
	
	private JTextField filterField;
	
	private ImageIcon browseIcon;
	
	private JLabel iconLabel;
	
	private JButton backButton;
	
	private JButton contactButton;
	
	public SearchPeople() {
JFrame frame = new JFrame("Search for People");
		
		l1 = new JLabel("test!");
		
		DefaultTableModel model = new DefaultTableModel() {
			
			 public boolean isCellEditable(int row, int column) {
			       //all cells false
			       return false;
			    }
		};
		
		 

        // Sütun başlıklarını ekle
        model.addColumn("Name"); // colonların ve verilenrin eklenmesi 
        model.addColumn("Title");
        model.addColumn("Experience(Year)");
        model.addColumn("Graduated University");
        model.addColumn("Company");
        
        // Verileri ekle
        model.addRow(new Object[]{"Alper Şahin", "Electrical and Electronic Engineering", "+2","Baskent University","Kartonsan Karton Sanayi"});
        
        model.addRow(new Object[]{"Doğukan Ahi", ".NET Developer", "+5","Baskent University","Marti Technologies"});
        
        model.addRow(new Object[]{"Doğan Eyikoçak", "DevOps Engineer", "+10","Baskent University","Marti Technologies"});
        
        model.addRow(new Object[]{"Oğulcan Ahi", "DevOps Engineer", "+7","Ozyegin University","Akınsoft"});
        
        model.addRow(new Object[]{"Emir Kervancıoğlu", "Kotlin Developer", "+6","Okan University","Garanti BBVA"});
        
        model.addRow(new Object[]{"Cengizhan Köse", "System Engineer", "+2","Hasan Kalyoncu University","KangerTech"});
        
        model.addRow(new Object[]{"Emirhan Özer", "DevOps Engineer", "+6","Cankaya University","Aerocool"});
        
        model.addRow(new Object[]{"Mert Şahin", "Civil Engineer", "+8","Bartin University","Sahin Insaat LTD. ŞTİ."});
        
        model.addRow(new Object[]{"Batuhan Ahi", "Civil Engineer", "+2","Yildiz Teknik University","Enka İnşaat"});
        
        model.addRow(new Object[]{"Emre Hüröğlu", "Purchasing Specialist", "+1","Avrasya University","Ortadoğu Makina LTD. ŞTİ."});

        model.addRow(new Object[]{"Mustafa Kasaka", "Mechanical Engineer", "+1","Karadeniz Technical University","Çepaş"});
        
        
        model.addRow(new Object[]{"Batuhan Genç", "Lawyer", "+1","Istanbul Kültür University","Genç Hukuk Bürosu"});
        
        model.addRow(new Object[]{"Emre Hüröğlu", "Purchasing Specialist", "+1","Avrasya University","Ortadoğu Makina LTD. ŞTİ."});
        
        
        model.addRow(new Object[]{"Ömer Hacialioğlu", "Industrial Enginner", "0","İstinye University","-"});
        
        model.addRow(new Object[]{"Ege Avcı", "Economist", "+8","Ankara Haci Bayram Veli University","Borsa Istanbul A.Ş"});
        
        model.addRow(new Object[]{"Burak Karadeniz", "Politics", "+3","Haliç University","61 Saat Habercilik"});
        
        model.addRow(new Object[]{"Efe  Turan ", "Physical Education Teacher", "0","Dicle University","Selçuksports"});
        
       
        
        model.addRow(new Object[]{"Edip Pirselimoğlu", "Physiotherapist", "+9","Karabük University","Trabzonspor A.Ş"});
        
        
        table = new JTable(model);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
	
       
       filterField = new JTextField(20);
       
       backButton = new JButton("Go Back");
       
       
       backButton.addActionListener(      // backbutton ile önceki saayfaya dönüş
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(false);
						
						
							MainPage m1 = new MainPage();
					
						
						
						}
						
					
				}
		);
       
       contactButton = new JButton("Contact");
       contactButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JOptionPane.showMessageDialog(frame, "Contact success with person.");
					
						
						
						}
						
					
				}
		);
     
       
       filterButton = new JButton("Filter"); // filtreleme kısmı 
        
       filterButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String text = filterField.getText();
			            if (text.trim().length() == 0) {
			                sorter.setRowFilter(null); // Filtre boşsa, tüm satırları göster
			            } else {
			                try {
			                    // Filtreleme kriterini belirle
			                    RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter("(?i)" + text); // boş olunca tüm elemanların gelmesi
			                    sorter.setRowFilter(filter);
			                } catch (Exception e1) {
			                    System.err.println("Hatalı regex pattern: " + e1.getMessage());
			                }
			            }
					
					
						
						
						
						
						
						}
						
					
				}
		);
       
       
       
        JScrollPane scrollPane = new JScrollPane(table);
        
        
		frame.setVisible(true); // frame ayarları ve componentlerin eklenmesi 
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setSize(800,500);
		
		JPanel panel = new JPanel();
		
		
		panel.add(scrollPane);
		

	
		panel.add(filterField);
		
		
		panel.add(filterButton);
		
	
		
		
		panel.add(contactButton);
		panel.add(backButton);		
		frame.add(panel);
	
		
	}
}
