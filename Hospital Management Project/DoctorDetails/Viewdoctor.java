package DoctorDetails;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Viewdoctor {

	 JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewdoctor window = new Viewdoctor();
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
	public Viewdoctor() {
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
				
				AddDoctor window = new AddDoctor();
				window.frame.setVisible(true);
				frame.dispose();
				
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
		btnViewDr.setIcon(new ImageIcon("D:\\PNG\\viewuser.png"));
		btnViewDr.setHorizontalAlignment(SwingConstants.LEFT);
		btnViewDr.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewDr.setBounds(793, 11, 193, 52);
		frame.getContentPane().add(btnViewDr);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\PNG\\DOCTORDETAILS (2).png"));
		lblNewLabel.setBounds(10, 120, 148, 169);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("View Doctor");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setBackground(new Color(0, 51, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 40));
		lblNewLabel_1.setBounds(191, 102, 272, 93);
		frame.getContentPane().add(lblNewLabel_1);
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
		
		JLabel lblNewLabel_2 = new JLabel("Search");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(203, 219, 118, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(331, 219, 286, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setBounds(46, 321, 1024, 331);
		frame.getContentPane().add(table);
	}
}
