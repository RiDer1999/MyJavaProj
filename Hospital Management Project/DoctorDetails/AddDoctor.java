package DoctorDetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;


public class AddDoctor {

	 JFrame frame;
	private JTextField textField_DrID;
	private JTextField textField_FirstName;
	private JTextField textField_Age;
	private JTextField textField_AadharNo;
	private JTextField textField_VisitTime;
	private JTextField textField_Address;
	private JTextField textField_SecondName;
	private JTextField textField_PhoneNo;
	private JTextField textField_Days;
	private JTextField textField_LDate;
	private JTextField textField_JDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDoctor window = new AddDoctor();
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
	public AddDoctor() {
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
		
		JButton btnAddDr = new JButton("Add Doctors");
		btnAddDr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddDr.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddDr.setIcon(new ImageIcon("D:\\PNG\\add (5).png"));
		btnAddDr.setBounds(10, 11, 181, 52);
		frame.getContentPane().add(btnAddDr);
		
		JButton btnDeleteDr = new JButton("Delete Doctors");
		btnDeleteDr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Deletedoctor window = new Deletedoctor();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnDeleteDr.setIcon(new ImageIcon("D:\\PNG\\removeuser.png"));
		btnDeleteDr.setHorizontalAlignment(SwingConstants.LEFT);
		btnDeleteDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteDr.setBounds(191, 11, 201, 52);
		frame.getContentPane().add(btnDeleteDr);
		
		JButton btnSearchDr = new JButton("Search Doctors");
		btnSearchDr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Searchdoctor window = new Searchdoctor();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnSearchDr.setIcon(new ImageIcon("D:\\PNG\\searchuser.png"));
		btnSearchDr.setHorizontalAlignment(SwingConstants.LEFT);
		btnSearchDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearchDr.setBounds(391, 11, 201, 52);
		frame.getContentPane().add(btnSearchDr);
		
		JButton btnUpdateDr = new JButton("Update Doctors");
		btnUpdateDr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Updatedoctor window = new Updatedoctor();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnUpdateDr.setIcon(new ImageIcon("D:\\PNG\\updateuser (2).png"));
		btnUpdateDr.setHorizontalAlignment(SwingConstants.LEFT);
		btnUpdateDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdateDr.setBounds(592, 11, 201, 52);
		frame.getContentPane().add(btnUpdateDr);
		
		JButton btnViewDr = new JButton("View Doctors");
		btnViewDr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Viewdoctor window = new Viewdoctor();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnViewDr.setIcon(new ImageIcon("D:\\PNG\\viewuser.png"));
		btnViewDr.setHorizontalAlignment(SwingConstants.LEFT);
		btnViewDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewDr.setBounds(793, 11, 193, 52);
		frame.getContentPane().add(btnViewDr);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\DOCTORDETAILS (2).png"));
		lblNewLabel.setBounds(10, 120, 148, 169);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Doctor");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(new Color(0, 51, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(194, 93, 255, 93);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Doctor ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(194, 197, 118, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_DrID = new JTextField();
		textField_DrID.setBounds(349, 197, 159, 28);
		frame.getContentPane().add(textField_DrID);
		textField_DrID.setColumns(10);
		
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
		
		JLabel lblNewLabel_3_5 = new JLabel("Joining Date");
		lblNewLabel_3_5.setForeground(Color.BLUE);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(191, 560, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Visit Timing");
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
		
		textField_VisitTime = new JTextField();
		textField_VisitTime.setColumns(10);
		textField_VisitTime.setBounds(306, 622, 228, 20);
		frame.getContentPane().add(textField_VisitTime);
		
		JComboBox comboBox_Gender = new JComboBox();
		comboBox_Gender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox_Gender.setBounds(306, 387, 86, 22);
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
		
		JLabel lblNewLabel_3_9 = new JLabel("Department");
		lblNewLabel_3_9.setForeground(Color.BLUE);
		lblNewLabel_3_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(592, 391, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Blood Group");
		lblNewLabel_3_10.setForeground(Color.BLUE);
		lblNewLabel_3_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_10.setBounds(592, 502, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Leaving Date");
		lblNewLabel_3_11.setForeground(Color.BLUE);
		lblNewLabel_3_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_11.setBounds(592, 564, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_3_12 = new JLabel("Days");
		lblNewLabel_3_12.setForeground(Color.BLUE);
		lblNewLabel_3_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_12.setBounds(592, 625, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_12);
		
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
		
		textField_Days = new JTextField();
		textField_Days.setColumns(10);
		textField_Days.setBounds(729, 622, 228, 20);
		frame.getContentPane().add(textField_Days);
		
		JComboBox comboBox_Department = new JComboBox();
		comboBox_Department.setModel(new DefaultComboBoxModel(new String[] {"Select Department", "CARDIOLOGY", "NEUROLOGY", "ORTHOPEDICS", "OPTHALMOLOGY", "RADIOLOGY", "PEDIATRICS", "GASTROENTEROLOGY"}));
		comboBox_Department.setBounds(729, 387, 120, 22);
		frame.getContentPane().add(comboBox_Department);
		
		JButton btnNewButton_5 = new JButton("ADD DOCTOR");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
				PreparedStatement pst = con.prepareStatement("insert into tbdoctor"+"(DrID,First_Name,Second_Name,Age,PhoneNo,AadharNo,Days,Gender,Department,Address,BloodGroup,JoiningDate,LeavingDate,VisitTiming)"+" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
				pst.setInt(1, Integer.parseInt(textField_DrID.getText()));
				pst.setString(2, textField_FirstName.getText());
				pst.setString(3, textField_SecondName.getText());
				pst.setInt(4, Integer.parseInt(textField_Age.getText()));
				pst.setString(5, textField_PhoneNo.getText());
				pst.setString(6, textField_AadharNo.getText());
				pst.setString(7, textField_Days.getText());
				pst.setString(8, (String) comboBox_Gender.getSelectedItem());
				pst.setString(9, (String) comboBox_Department.getSelectedItem());
				pst.setString(10, textField_Address.getText());
				pst.setString(11, (String) comboBox_BloodGroup.getSelectedItem());
				pst.setString(12, textField_JDate.getText());
				pst.setString(13, textField_LDate.getText());
				pst.setString(14, textField_VisitTime.getText());
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(btnNewButton_5, "Record Inserted Successfully....");
				pst.close();
				con.close();
				
				textField_DrID.setText(null);
				textField_FirstName.setText(null);
				textField_SecondName.setText(null);
				textField_Age.setText(null);
				textField_PhoneNo.setText(null);
				textField_AadharNo.setText(null);
				textField_Days.setText(null);
				comboBox_Gender.setSelectedIndex(0);
				comboBox_Department.setSelectedIndex(0);
				textField_Address.setText(null);
				comboBox_BloodGroup.setSelectedIndex(0);
				textField_JDate.setText(null);
				textField_LDate.setText(null);
				textField_VisitTime.setText(null);
				
				
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
				
				textField_DrID.setText(null);
				textField_FirstName.setText(null);
				textField_SecondName.setText(null);
				textField_Age.setText(null);
				textField_PhoneNo.setText(null);
				textField_AadharNo.setText(null);
				textField_Days.setText(null);
				comboBox_Gender.setSelectedIndex(0);
				comboBox_Department.setSelectedIndex(0);
				textField_Address.setText(null);
				comboBox_BloodGroup.setSelectedIndex(0);
				textField_JDate.setText(null);
				textField_LDate.setText(null);
				textField_VisitTime.setText(null);
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
		
		textField_LDate = new JTextField();
		textField_LDate.setColumns(10);
		textField_LDate.setBounds(729, 561, 228, 20);
		frame.getContentPane().add(textField_LDate);
		
		textField_JDate = new JTextField();
		textField_JDate.setColumns(10);
		textField_JDate.setBounds(306, 561, 228, 20);
		frame.getContentPane().add(textField_JDate);
	}
}
