package Lowerstaffdetails;

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

public class Lowerstaff {

	 public JFrame frame;
	private JTextField textField_StaffID;
	private JTextField textField_FirstName;
	private JTextField textField_Age;
	private JTextField textField_AadharNo;
	private JTextField textField_Address;
	private JTextField textField_SecondName;
	private JTextField textField_PhoneNo;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lowerstaff window = new Lowerstaff();
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
	public Lowerstaff() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\EMPLOYEESDETAILS.png"));
		lblNewLabel.setBounds(10, 67, 148, 169);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lower Staff Details");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(new Color(0, 51, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(179, -14, 423, 93);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Staff ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(189, 67, 118, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_StaffID = new JTextField();
		textField_StaffID.setBounds(317, 67, 159, 28);
		frame.getContentPane().add(textField_StaffID);
		textField_StaffID.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(189, 124, 101, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setBounds(317, 125, 228, 20);
		frame.getContentPane().add(textField_FirstName);
		textField_FirstName.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Age");
		lblNewLabel_3_1.setForeground(Color.BLUE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(189, 169, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender");
		lblNewLabel_3_2.setForeground(Color.BLUE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(189, 217, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Address");
		lblNewLabel_3_3.setForeground(Color.BLUE);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(189, 274, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Aadhar No.");
		lblNewLabel_3_4.setForeground(Color.BLUE);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(189, 322, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		textField_Age = new JTextField();
		textField_Age.setColumns(10);
		textField_Age.setBounds(317, 170, 228, 20);
		frame.getContentPane().add(textField_Age);
		
		textField_AadharNo = new JTextField();
		textField_AadharNo.setColumns(10);
		textField_AadharNo.setBounds(317, 323, 228, 20);
		frame.getContentPane().add(textField_AadharNo);
		
		JComboBox comboBox_Gender = new JComboBox();
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox_Gender.setBounds(317, 217, 101, 22);
		frame.getContentPane().add(comboBox_Gender);
		
		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		textField_Address.setBounds(317, 275, 543, 20);
		frame.getContentPane().add(textField_Address);
		
		JLabel lblNewLabel_3_7 = new JLabel("Second Name");
		lblNewLabel_3_7.setForeground(Color.BLUE);
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_7.setBounds(581, 124, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Phone NO.");
		lblNewLabel_3_8.setForeground(Color.BLUE);
		lblNewLabel_3_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_8.setBounds(581, 169, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Staff Type");
		lblNewLabel_3_9.setForeground(Color.BLUE);
		lblNewLabel_3_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(581, 217, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_9);
		
		textField_SecondName = new JTextField();
		textField_SecondName.setColumns(10);
		textField_SecondName.setBounds(713, 125, 228, 20);
		frame.getContentPane().add(textField_SecondName);
		
		textField_PhoneNo = new JTextField();
		textField_PhoneNo.setColumns(10);
		textField_PhoneNo.setBounds(713, 170, 228, 20);
		frame.getContentPane().add(textField_PhoneNo);
		
		JComboBox comboBox_StaffType = new JComboBox();
		comboBox_StaffType.setModel(new DefaultComboBoxModel(new String[] {"Select Staff Type", "BAMS Dr", "Pharmacist", "Pathologist", "Nurses", "Word Boy", "Cleaners", "Security Guard"}));
		comboBox_StaffType.setBounds(713, 214, 120, 22);
		frame.getContentPane().add(comboBox_StaffType);
		
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
		
		JLabel lblNewLabel_2_1 = new JLabel("SEARCH");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1.setBounds(581, 313, 118, 28);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(713, 313, 228, 28);
		frame.getContentPane().add(textField_6);
		
		JButton btnAdd = new JButton("Add Employee");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					PreparedStatement pst = con.prepareStatement("insert into tbstaff"+"(Staff_ID,First_Name,Second_Name,Age,PhoneNo,Gender,Staff_Type,Address,AadharNo)"+"values(?,?,?,?,?,?,?,?,?)");
					
					pst.setInt(1, Integer.parseInt(textField_StaffID.getText()));
					pst.setString(2, textField_FirstName.getText());
					pst.setString(3, textField_SecondName.getText());
					pst.setInt(4, Integer.parseInt(textField_Age.getText()));
					pst.setString(5, textField_PhoneNo.getText());
					pst.setString(6, (String) comboBox_Gender.getSelectedItem());
					pst.setString(7, (String) comboBox_StaffType.getSelectedItem());
					pst.setString(8, textField_Address.getText());
					pst.setString(9, textField_AadharNo.getText());
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(btnAdd, "Record Inserted Successfully....");
					pst.close();
					con.close();
					
					textField_StaffID.setText(null);
					textField_FirstName.setText(null);
					textField_SecondName.setText(null);
					textField_Age.setText(null);
					textField_PhoneNo.setText(null);
					comboBox_Gender.setSelectedIndex(0);
					comboBox_StaffType.setSelectedIndex(0);
					textField_Address.setText(null);
					textField_AadharNo.setText(null);

					
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnAdd, e1); 
				}
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setIcon(new ImageIcon("D:\\PNG\\adduser.png"));
		btnAdd.setBounds(10, 382, 183, 52);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					 PreparedStatement pst = con.prepareStatement("delete from tbstaff where Staff_ID=?");
					 pst.setInt(1, Integer.parseInt(textField_StaffID.getText()));
					 
					 pst.executeUpdate();
					 JOptionPane.showMessageDialog(null,"Record Deleted Successfully...");
					 pst.close();
					 con.close();
					 
					 textField_StaffID.setText(null);
						textField_FirstName.setText(null);
						textField_SecondName.setText(null);
						textField_Age.setText(null);
						textField_PhoneNo.setText(null);
						comboBox_Gender.setSelectedIndex(0);
						comboBox_StaffType.setSelectedIndex(0);
						textField_Address.setText(null);
						textField_AadharNo.setText(null);
					 
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnDeleteEmployee, e1); 
				
				}
				
				
			}
		});
		btnDeleteEmployee.setIcon(new ImageIcon("D:\\PNG\\DELETESMALL.png"));
		btnDeleteEmployee.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteEmployee.setBounds(10, 445, 183, 52);
		frame.getContentPane().add(btnDeleteEmployee);
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					 PreparedStatement pst = con.prepareStatement("UPDATE tbstaff SET First_Name=?,Second_Name=?,Age=?,PhoneNo=?,Gender=?,Staff_Type=?,Address=?,AadharNo=? WHERE Staff_ID=?");
					 
					 pst.setString(1, textField_FirstName.getText());
						pst.setString(2, textField_SecondName.getText());
						pst.setInt(3, Integer.parseInt(textField_Age.getText()));
						pst.setString(4, textField_PhoneNo.getText());
						pst.setString(5, (String) comboBox_Gender.getSelectedItem());
						pst.setString(6, (String) comboBox_StaffType.getSelectedItem());
						pst.setString(7, textField_Address.getText());
						pst.setString(8, textField_AadharNo.getText());
						pst.setInt(9, Integer.parseInt(textField_StaffID.getText()));
						
						 pst.executeUpdate();
						 JOptionPane.showMessageDialog(null,"Record updated Successfully...");
						 
						
							textField_FirstName.setText(null);
							textField_SecondName.setText(null);
							textField_Age.setText(null);
							textField_PhoneNo.setText(null);
							comboBox_Gender.setSelectedIndex(0);
							comboBox_StaffType.setSelectedIndex(0);
							textField_Address.setText(null);
							textField_AadharNo.setText(null);
							 textField_StaffID.setText(null);
						 
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnUpdateEmployee, e1); 
				
				}
			}
		});
		btnUpdateEmployee.setIcon(new ImageIcon("D:\\PNG\\UPDATESMALL.png"));
		btnUpdateEmployee.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdateEmployee.setBounds(10, 508, 183, 52);
		frame.getContentPane().add(btnUpdateEmployee);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(254, 371, 853, 301);
		frame.getContentPane().add(table);
	}
}
