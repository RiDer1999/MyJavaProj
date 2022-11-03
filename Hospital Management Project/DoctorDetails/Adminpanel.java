package DoctorDetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Bedavailability.Bedavailability;
import Billing.BillingSection;
import Lowerstaffdetails.Lowerstaff;
import PatientsDetails.Addpatients;
import java.awt.Toolkit;

public class Adminpanel {

	 public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminpanel window = new Adminpanel();
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
	public Adminpanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\PNG\\Arogya Pandhari logo.jpg"));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 1007, 674);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arogya Pandhri Hospital");
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(290, 11, 577, 84);
		frame.getContentPane().add(lblNewLabel);
		
		JButton LogoutAD = new JButton("Logout");
		LogoutAD.setHorizontalAlignment(SwingConstants.LEADING);
		LogoutAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Loginpage window = new Loginpage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		LogoutAD.setIcon(new ImageIcon("D:\\PNG\\LOGOUT (2).png"));
		LogoutAD.setForeground(Color.RED);
		LogoutAD.setFont(new Font("Tahoma", Font.BOLD, 15));
		LogoutAD.setBounds(359, 106, 126, 35);
		frame.getContentPane().add(LogoutAD);
		
		JLabel DoctorDeteils = new JLabel("New label");
		DoctorDeteils.setIcon(new ImageIcon("D:\\PNG\\DOCTORDETAILS (2).png"));
		DoctorDeteils.setBounds(410, 197, 145, 166);
		frame.getContentPane().add(DoctorDeteils);
		
		JLabel StafDeteils = new JLabel("New label");
		StafDeteils.setIcon(new ImageIcon("D:\\PNG\\EMPLOYEESDETAILS.png"));
		StafDeteils.setBounds(792, 197, 145, 166);
		frame.getContentPane().add(StafDeteils);
		
		JLabel DepartmentDeteils = new JLabel("New label");
		DepartmentDeteils.setIcon(new ImageIcon("D:\\PNG\\bill-removebg-preview.png"));
		DepartmentDeteils.setBounds(603, 197, 145, 166);
		frame.getContentPane().add(DepartmentDeteils);
		
		JLabel BedDetails = new JLabel("New label");
		BedDetails.setIcon(new ImageIcon("D:\\PNG\\patientdetals.png"));
		BedDetails.setBounds(502, 397, 145, 166);
		frame.getContentPane().add(BedDetails);
		
		JLabel BedAvailablity = new JLabel("");
		BedAvailablity.setIcon(new ImageIcon("D:\\PNG\\BEDDETAILS.png"));
		BedAvailablity.setBounds(707, 397, 145, 166);
		frame.getContentPane().add(BedAvailablity);
		
		JButton btnNewButton = new JButton("Doctor Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddDoctor window = new AddDoctor();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(410, 363, 145, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("Lower Staff Details");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Lowerstaff window = new Lowerstaff();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(789, 363, 148, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Invoice Receipt");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BillingSection window = new BillingSection();
				window.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setBounds(603, 363, 145, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Patient Details");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Addpatients window = new Addpatients();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setBounds(515, 586, 135, 23);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("BED Availability");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bedavailability window = new Bedavailability();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setBounds(715, 586, 137, 23);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Panel");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(613, 106, 154, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PNG\\Arogya_Pandhari_logo-removebg-short.png"));
		lblNewLabel_2.setBounds(10, 0, 218, 158);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(null);
		lblNewLabel_3.setBounds(0, 0, 991, 635);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
