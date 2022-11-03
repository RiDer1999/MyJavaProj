package Billing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import DoctorDetails.Adminpanel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BillingSection {

	 public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSection window = new BillingSection();
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
	public BillingSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Arogya Pandhari Hospital");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(178, 11, 437, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Invoice");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(348, 78, 73, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Search Patient ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(132, 117, 153, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(295, 122, 103, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(477, 125, 67, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Second Name");
		lblNewLabel_3_1.setForeground(Color.BLUE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(477, 154, 76, 18);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(573, 122, 113, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(573, 153, 113, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone No.");
		lblNewLabel_3_1_1.setForeground(Color.BLUE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1_1.setBounds(477, 183, 76, 18);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(573, 184, 113, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("Surgery Fees");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(132, 174, 96, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(275, 178, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nurse Charges");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(132, 249, 96, 27);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Medical Charges");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2.setBounds(132, 287, 119, 27);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(275, 253, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(275, 291, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Bed Charges");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(132, 212, 96, 27);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(275, 216, 86, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Laboratory Charges");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_2_1.setBounds(132, 325, 133, 27);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(275, 329, 86, 20);
		frame.getContentPane().add(textField_8);
		
		JButton btnNewButton = new JButton("Generate Invoice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Invoice window = new Invoice();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(196, 379, 133, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3_2 = new JLabel("Gender");
		lblNewLabel_3_2.setForeground(Color.BLUE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(477, 212, 101, 19);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox.setBounds(573, 215, 101, 18);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Adminpanel window = new Adminpanel();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\PNG\\back (2).png"));
		btnNewButton_1.setBounds(10, 11, 54, 52);
		frame.getContentPane().add(btnNewButton_1);
	}
}
