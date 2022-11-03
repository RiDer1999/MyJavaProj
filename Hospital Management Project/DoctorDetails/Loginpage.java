package DoctorDetails;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginpage {

	 JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
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
	public Loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 647, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\LOGIN.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(262, 121, 141, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.RED);
		lblPassword.setIcon(new ImageIcon("D:\\PNG\\PASSWORD.png"));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(262, 183, 131, 61);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(440, 137, 158, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(440, 201, 158, 29);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
					Statement stmt;
					stmt=con.createStatement();
					String Username=textField.getText();
					String Password=textField_1.getText();
					
					
					ResultSet rs =stmt.executeQuery("SELECT * from tblogin WHERE Username='"+Username+"' && Password='"+Password+"'");
		
					if(rs.next())
					{
						if(Username.equals("admin") && Password.equals("admin123"))
						{
							
							JOptionPane.showMessageDialog(btnNewButton, "Login Successfully...");
							
						}
						else
						{
							JOptionPane.showMessageDialog(btnNewButton, "Incorrect username or Password...");
						}
						
				  		Adminpanel window = new Adminpanel();
						window.frame.setVisible(true);
						frame.dispose();
					} 
					  rs.close();
					  con.close();
					  stmt.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
					

			}
		}); 
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(354, 255, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\PNG\\ADMINLOGIN (1) 3.png"));
		lblNewLabel_1.setBounds(0, 0, 631, 358);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
