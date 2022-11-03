package PatientsDetails;

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
import javax.swing.SwingConstants;

import DoctorDetails.Adminpanel;

import javax.swing.JCheckBox;

public class Addpatients {

	 public JFrame frame;
	private JTextField textField_ID;
	private JTextField textField_FirstName;
	private JTextField textField_Age;
	private JTextField textField_AadharNo;
	private JTextField textField_BedNo;
	private JTextField textField_Address;
	private JTextField textField_SecondName;
	private JTextField textField_PhoneNo;
	private JTextField textField_Date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addpatients window = new Addpatients();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create By Ashraf.
	 */
	public Addpatients() {
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
		
		JButton btnNewButton = new JButton("Add Patients");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setIcon(new ImageIcon("D:\\PNG\\add (5).png"));
		btnNewButton.setBounds(10, 11, 181, 52);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Patients");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Deletepatients window = new Deletepatients();
				window.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\PNG\\removeuser.png"));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(191, 11, 204, 52);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search Patients");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Searchpatients window = new Searchpatients();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\PNG\\searchuser.png"));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(394, 11, 210, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Patients");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Updatepatients window = new Updatepatients();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("D:\\PNG\\updateuser (2).png"));
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(603, 11, 210, 52);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View Patients");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Viewpatients window = new Viewpatients();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("D:\\PNG\\viewuser.png"));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(812, 11, 193, 52);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\patientdetals.png"));
		lblNewLabel.setBounds(10, 120, 148, 169);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Patient");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(new Color(0, 51, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(194, 93, 255, 93);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patient ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(194, 197, 118, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(349, 197, 159, 28);
		frame.getContentPane().add(textField_ID);
		textField_ID.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(191, 270, 101, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setBounds(306, 270, 228, 20);
		frame.getContentPane().add(textField_FirstName);
		textField_FirstName.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Age");
		lblNewLabel_3_1.setForeground(Color.BLUE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(191, 330, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender");
		lblNewLabel_3_2.setForeground(Color.BLUE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(191, 387, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Address");
		lblNewLabel_3_3.setForeground(Color.BLUE);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(191, 446, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Aadhar No.");
		lblNewLabel_3_4.setForeground(Color.BLUE);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(191, 498, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel(" Date");
		lblNewLabel_3_5.setForeground(Color.BLUE);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(191, 560, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Bed No.");
		lblNewLabel_3_6.setForeground(Color.BLUE);
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_6.setBounds(191, 621, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_6);
		
		textField_Age = new JTextField();
		textField_Age.setColumns(10);
		textField_Age.setBounds(306, 331, 228, 20);
		frame.getContentPane().add(textField_Age);
		
		textField_AadharNo = new JTextField();
		textField_AadharNo.setColumns(10);
		textField_AadharNo.setBounds(306, 499, 228, 20);
		frame.getContentPane().add(textField_AadharNo);
		
		textField_BedNo = new JTextField();
		textField_BedNo.setColumns(10);
		textField_BedNo.setBounds(306, 622, 228, 20);
		frame.getContentPane().add(textField_BedNo);
		
		JComboBox comboBox_Gender = new JComboBox();
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox_Gender.setBounds(306, 387, 101, 22);
		frame.getContentPane().add(comboBox_Gender);
		
		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		textField_Address.setBounds(306, 447, 543, 20);
		frame.getContentPane().add(textField_Address);
		
		JLabel lblNewLabel_3_7 = new JLabel("Second Name");
		lblNewLabel_3_7.setForeground(Color.BLUE);
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_7.setBounds(592, 274, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Phone NO.");
		lblNewLabel_3_8.setForeground(Color.BLUE);
		lblNewLabel_3_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_8.setBounds(592, 330, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Patient Type");
		lblNewLabel_3_9.setForeground(Color.BLUE);
		lblNewLabel_3_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(592, 391, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Blood Group");
		lblNewLabel_3_10.setForeground(Color.BLUE);
		lblNewLabel_3_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_10.setBounds(592, 502, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Marital Status");
		lblNewLabel_3_11.setForeground(Color.BLUE);
		lblNewLabel_3_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_11.setBounds(592, 564, 118, 19);
		frame.getContentPane().add(lblNewLabel_3_11);
		
		textField_SecondName = new JTextField();
		textField_SecondName.setColumns(10);
		textField_SecondName.setBounds(729, 271, 228, 20);
		frame.getContentPane().add(textField_SecondName);
		
		textField_PhoneNo = new JTextField();
		textField_PhoneNo.setColumns(10);
		textField_PhoneNo.setBounds(729, 331, 228, 20);
		frame.getContentPane().add(textField_PhoneNo);
		
		JComboBox comboBox_BloodGroup = new JComboBox();
		comboBox_BloodGroup.setModel(new DefaultComboBoxModel(new String[] {"Select Blood Group", "O-", "O+", "A+", "A-", "B+", "B-", "AB+", "AB-"}));
		comboBox_BloodGroup.setBounds(729, 502, 120, 22);
		frame.getContentPane().add(comboBox_BloodGroup);
		
		JComboBox comboBox_PatientType = new JComboBox();
		comboBox_PatientType.setModel(new DefaultComboBoxModel(new String[] {"Select Patient Type", "CARDIOLOGY", "NEUROLOGY", "ORTHOPEDICS", "OPTHALMOLOGY", "RADIOLOGY", "PEDIATRICS", "GASTROENTEROLOGY"}));
		comboBox_PatientType.setBounds(729, 387, 120, 22);
		frame.getContentPane().add(comboBox_PatientType);
		
		JComboBox comboBox_MaritalStatus = new JComboBox();
		comboBox_MaritalStatus.setModel(new DefaultComboBoxModel(new String[] {"Select Marital Status", "Single", "Married"}));
		comboBox_MaritalStatus.setBounds(729, 560, 120, 22);
		frame.getContentPane().add(comboBox_MaritalStatus);
		
		JButton btnNewButton_5 = new JButton("ADD PATIENT");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					PreparedStatement pst = con.prepareStatement("insert into tbpatient"+"(Patient_ID,First_Name,Second_Name,Age,PhoneNo,Gender,Patient_Type,Address,AadharNo,BloodGroup,Date,MaritalStatus,Bed_No)"+" values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

					pst.setInt(1, Integer.parseInt(textField_ID.getText()));
					pst.setString(2, textField_FirstName.getText());
					pst.setString(3, textField_SecondName.getText());
					pst.setInt(4, Integer.parseInt(textField_Age.getText()));
					pst.setString(5, textField_PhoneNo.getText());
					pst.setString(6, (String) comboBox_Gender.getSelectedItem());
					pst.setString(7, (String) comboBox_PatientType.getSelectedItem());
					pst.setString(8, textField_Address.getText());
					pst.setString(9, textField_AadharNo.getText());
					pst.setString(10, (String) comboBox_BloodGroup.getSelectedItem());
					pst.setString(11, textField_Date.getText());
					pst.setString(12, (String) comboBox_MaritalStatus.getSelectedItem());
					pst.setString(13, textField_BedNo.getText());
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton_5, "Record Inserted Successfully....");
					pst.close();
					con.close();
					
					textField_ID.setText(null);
					textField_FirstName.setText(null);
					textField_SecondName.setText(null);
					textField_Age.setText(null);
					textField_PhoneNo.setText(null);
					comboBox_Gender.setSelectedIndex(0);
					comboBox_PatientType.setSelectedIndex(0);
					textField_Address.setText(null);
					textField_AadharNo.setText(null);
					comboBox_BloodGroup.setSelectedIndex(0);
					textField_Date.setText(null);
					comboBox_MaritalStatus.setSelectedIndex(0);
					textField_BedNo.setText(null);
					
					
				}catch(Exception e1) {
					e1.printStackTrace();
					 JOptionPane.showMessageDialog(btnNewButton_5, e1);
				
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(538, 88, 140, 28);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("CLEAR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textField_ID.setText(null);
				textField_FirstName.setText(null);
				textField_SecondName.setText(null);
				textField_Age.setText(null);
				textField_PhoneNo.setText(null);
				comboBox_Gender.setSelectedIndex(0);
				comboBox_PatientType.setSelectedIndex(0);
				textField_Address.setText(null);
				textField_AadharNo.setText(null);
				comboBox_BloodGroup.setSelectedIndex(0);
				textField_Date.setText(null);
				comboBox_MaritalStatus.setSelectedIndex(0);
				textField_BedNo.setText(null);
			}
		});
		btnNewButton_6.setForeground(Color.RED);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.setBounds(563, 147, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Adminpanel window = new Adminpanel();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("D:\\PNG\\back (2).png"));
		btnNewButton_7.setBounds(10, 74, 51, 52);
		frame.getContentPane().add(btnNewButton_7);
		
		textField_Date = new JTextField();
		textField_Date.setColumns(10);
		textField_Date.setBounds(306, 561, 228, 20);
		frame.getContentPane().add(textField_Date);
		
	
	}
}

