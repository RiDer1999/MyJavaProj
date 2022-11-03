package Bedavailability;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import DoctorDetails.Adminpanel;


public class Bedavailability {

	 public JFrame frame;
	private JTextField textField_bed;
	private JTextField textField_room;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bedavailability window = new Bedavailability();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bedavailability() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1154, 722);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Adminpanel window = new Adminpanel();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("D:\\PNG\\back (2).png"));
		btnNewButton_7.setBounds(10, 11, 51, 52);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("Bed Details");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(new Color(0, 51, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(306, 37, 423, 93);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\BEDDETAILS.png"));
		lblNewLabel.setBounds(126, 11, 148, 169);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox_Category = new JComboBox();
		comboBox_Category.setModel(new DefaultComboBoxModel(new String[] {"Select ", "ICU", "General", "Special"}));
		comboBox_Category.setBounds(805, 143, 83, 22);
		frame.getContentPane().add(comboBox_Category);
		
		JButton btnAddBed = new JButton("ADD BED");
		btnAddBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					PreparedStatement pst = con.prepareStatement("insert into tbbed"+"(Bed_No,Category,Room_No)"+"values(?,?,?)");
					
					pst.setInt(1, Integer.parseInt(textField_bed.getText()));
					 pst.setString(2, (String) comboBox_Category.getSelectedItem());
					 pst.setInt(3, Integer.parseInt(textField_room.getText()));
					 
					 pst.executeUpdate();
						JOptionPane.showMessageDialog(btnAddBed, "Record Inserted Successfully....");
						pst.close();
						con.close();
						
						textField_bed.setText(null);
						comboBox_Category.setSelectedIndex(0);
						textField_room.setText(null);
					
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnAddBed, e1); 
				}
				
				
				
				
			}
		});
		btnAddBed.setForeground(Color.GRAY);
		btnAddBed.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddBed.setBounds(82, 213, 119, 23);
		frame.getContentPane().add(btnAddBed);
		
		JButton btnRemoveBed = new JButton("REMOVE BED");
		btnRemoveBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					 PreparedStatement pst = con.prepareStatement("delete from tbbed where Bed_No=?");
					 pst.setInt(1, Integer.parseInt(textField_bed.getText()));
					 
					 pst.executeUpdate();
					 JOptionPane.showMessageDialog(null,"Record Deleted Successfully...");
					 
					 textField_bed.setText(null);
			 		comboBox_Category.setSelectedIndex(0);
					textField_room.setText(null);
					
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnRemoveBed, e1); 
				}
				
				
			}
		});
		btnRemoveBed.setForeground(Color.GRAY);
		btnRemoveBed.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRemoveBed.setBounds(240, 213, 135, 23);
		frame.getContentPane().add(btnRemoveBed);
		
		JButton btnUpdateBed = new JButton("UPDATE BED");
		btnUpdateBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					 PreparedStatement pst = con.prepareStatement("UPDATE tbbed SET Category=?,Room_No=? WHERE Bed_No=?");
					 
					 pst.setString(1,comboBox_Category.getSelectedItem().toString());
					 pst.setString(2,textField_room.getText());
					 pst.setInt(3, Integer.parseInt(textField_bed.getText()));
					 
					 pst.executeUpdate();
					 JOptionPane.showMessageDialog(null,"Record updated Successfully...");
					 
					 textField_bed.setText(null);
			 		comboBox_Category.setSelectedIndex(0);
					textField_room.setText(null);
					
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnUpdateBed, e1); 
				}
				
				
			}
		});
		btnUpdateBed.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdateBed.setForeground(Color.GRAY);
		btnUpdateBed.setBounds(404, 213, 140, 23);
		frame.getContentPane().add(btnUpdateBed);
		
		JLabel lblNewLabel_2 = new JLabel("Bed No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(715, 88, 83, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_bed = new JTextField();
		textField_bed.setBounds(801, 88, 86, 23);
		frame.getContentPane().add(textField_bed);
		textField_bed.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Category");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(715, 141, 83, 23);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Room");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(715, 190, 83, 23);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textField_room = new JTextField();
		textField_room.setColumns(10);
		textField_room.setBounds(801, 190, 86, 23);
		frame.getContentPane().add(textField_room);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setBounds(163, 274, 304, 174);
		frame.getContentPane().add(table);
		
	
	}
}
