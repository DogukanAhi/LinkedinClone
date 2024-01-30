import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class BrowsePage extends WelcomePage {
	
	private JLabel l1;
	
	private JTable table;
	
	private JButton applyButton;
	
	private JButton filterButton;
	
	private JTextField filterField;
	
	private ImageIcon browseIcon;
	
	private JLabel iconLabel;
	
	private JButton backButton;
	
	public BrowsePage(){
		
		JFrame frame = new JFrame("Job Advertisement");
		
		l1 = new JLabel("test!");
		
		DefaultTableModel model = new DefaultTableModel() {
			
			 public boolean isCellEditable(int row, int column) {
			       //all cells false
			       return false;
			    }
		};
		
		 

        // Sütun başlıklarını ekle
        model.addColumn("Company");
        model.addColumn("Job Description");
        model.addColumn("Experience");

        // Verileri ekle
        model.addRow(new Object[]{"Marti Technologies", "Backend Dev", "+3"});
        model.addRow(new Object[]{"Getir", "DevOps Engineer", "+10"});
        model.addRow(new Object[]{"HepsiBurada", "IOS Developer", "+1"});
        
        model.addRow(new Object[]{"Trendyol", "Android Developer", "+5"});
        
        model.addRow(new Object[]{"Vestel", ".NET Developer", "+8"});
        
        model.addRow(new Object[]{"Baykar Technology ", "C/C++ Developer", "+12"});
        
        model.addRow(new Object[]{"Turkish Technology", "Full Stack Developer", "+6"});
        
        model.addRow(new Object[]{"Aselsan", "Firmware Developer", "+10"});
        
        model.addRow(new Object[]{"Havelsan", "Communication  Engineer", "+4"});
        
        model.addRow(new Object[]{"Limak Holding", "Junior Civil Engineer", "+1"});
        
        model.addRow(new Object[]{"Cengiz Holding", "AutoCAD and StarCCM+ Expert ", "+3"});
        table = new JTable(model);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
		
       applyButton = new JButton("Apply");
       
       filterField = new JTextField(20);
       
       backButton = new JButton("Go Back");
       
       backButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						frame.setVisible(false);
						
						
							MainPage m1 = new MainPage();
					
						
						
						}
						
					
				}
		);
       
       
       applyButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
					
					JOptionPane.showMessageDialog(frame, "Your CV has been forwarded to the relevant department of the company.");
					
					
						
						
						
						
						
						}
						
					
				}
		);
       
       filterButton = new JButton("Filter");
        
       filterButton.addActionListener(     
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String text = filterField.getText();
			            if (text.trim().length() == 0) {
			                sorter.setRowFilter(null); // Filtre boşsa, tüm satırları göster
			            } else {
			                try {
			                    // Filtreleme kriterini belirle
			                    RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter("(?i)" + text);
			                    sorter.setRowFilter(filter);
			                } catch (Exception e1) {
			                    System.err.println("Hatalı regex pattern: " + e1.getMessage());
			                }
			            }
					
					
						
						
						
						
						
						}
						
					
				}
		);
       
       
       
        JScrollPane scrollPane = new JScrollPane(table);
        
        
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame.setSize(800,500);
		
		JPanel panel = new JPanel();
		
		
		panel.add(scrollPane);
		

	
		panel.add(filterField);
		
		
		panel.add(filterButton);
		
		panel.add(applyButton);
		
		
		
		panel.add(backButton);		
		frame.add(panel);
	
		
		
	}
	
	

}
