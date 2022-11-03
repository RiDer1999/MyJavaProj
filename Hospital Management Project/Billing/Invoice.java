package Billing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Invoice {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice window = new Invoice();
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
	public Invoice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\PNG\\Arogya_Pandhari_logo-removebg-short.png"));
		frame.setBounds(100, 100, 570, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\Arogya_Pandhari_logo-removebg-short.png"));
		lblNewLabel.setBounds(0, 0, 209, 159);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Arogya Pandhari");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(233, 11, 300, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hospital");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(243, 52, 300, 48);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address:- ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(233, 105, 75, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Gopal Nagar Tuljapur 413601");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(323, 106, 231, 19);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("--------------------------------------------------------------------------------------------");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 160, 554, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("Phone No. 8788339649");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(279, 135, 209, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("First Name:-");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(11, 199, 98, 19);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Last Name:-");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(270, 199, 98, 19);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Date:-");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(378, 172, 47, 19);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(106, 200, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(370, 200, 129, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Phone No:-");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3_1.setBounds(11, 241, 98, 19);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(106, 242, 231, 20);
		frame.getContentPane().add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox.setBounds(416, 243, 83, 18);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Gender:-");
		lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_4_1.setBounds(347, 241, 75, 19);
		frame.getContentPane().add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("--------------------------------------------------------------------------------------------");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(0, 273, 554, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Types");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(53, 290, 75, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Surgery Fees");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(34, 323, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Bed");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_1.setBounds(34, 357, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Nurse");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_2.setBounds(34, 390, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Medical");
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_3.setBounds(34, 418, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Laboratory");
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1_4.setBounds(34, 448, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_2 = new JLabel("Charges");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_2.setBounds(378, 293, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("--------------------------------------------------------------------------------------------");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(0, 311, 554, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("--------------------------------------------------------------------------------------------");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_2.setBounds(0, 472, 554, 14);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Total");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_3.setBounds(34, 486, 75, 19);
		frame.getContentPane().add(lblNewLabel_4_3);
	}
}
