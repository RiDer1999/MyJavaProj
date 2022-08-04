import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarkList {

	private JFrame frame;
	private JTextField java;
	private JTextField Eng;
	private JTextField cpp;
	private JTextField math;
	private JTextField dbms;
	private JTextField totalmarks;
	private JTextField percentage;
	private JTextField Grade;
	private JTextField Status;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarkList window = new MarkList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MarkList() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 459, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(Color.CYAN);
		panel.setBounds(224, 0, 219, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResult.setBounds(41, 11, 122, 31);
		panel.add(lblResult);
		
		JLabel lblNewLabel_1_5 = new JLabel("Total Marks");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(10, 71, 94, 17);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Percentage");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(10, 109, 84, 25);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Grade");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_7.setBounds(10, 149, 46, 14);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Status");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_8.setBounds(10, 192, 46, 14);
		panel.add(lblNewLabel_1_8);
		
		totalmarks = new JTextField();
		totalmarks.setHorizontalAlignment(SwingConstants.CENTER);
		totalmarks.setForeground(Color.BLACK);
		totalmarks.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalmarks.setColumns(10);
		totalmarks.setBounds(121, 71, 64, 20);
		panel.add(totalmarks);
		
		percentage = new JTextField();
		percentage.setHorizontalAlignment(SwingConstants.CENTER);
		percentage.setForeground(Color.BLACK);
		percentage.setFont(new Font("Tahoma", Font.BOLD, 14));
		percentage.setColumns(10);
		percentage.setBounds(121, 113, 64, 20);
		panel.add(percentage);
		
		Grade = new JTextField();
		Grade.setHorizontalAlignment(SwingConstants.CENTER);
		Grade.setForeground(Color.BLACK);
		Grade.setFont(new Font("Tahoma", Font.BOLD, 14));
		Grade.setColumns(10);
		Grade.setBounds(121, 148, 64, 20);
		panel.add(Grade);
		
		Status = new JTextField();
		Status.setHorizontalAlignment(SwingConstants.CENTER);
		Status.setForeground(Color.BLACK);
		Status.setFont(new Font("Tahoma", Font.BOLD, 14));
		Status.setColumns(10);
		Status.setBounds(121, 191, 64, 20);
		panel.add(Status);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(0, 0, 219, 309);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Input");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(41, 11, 148, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblJava = new JLabel("Java");
		lblJava.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJava.setBounds(10, 59, 46, 14);
		panel_1.add(lblJava);
		
		JLabel lblC = new JLabel("C++");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblC.setBounds(10, 94, 75, 14);
		panel_1.add(lblC);
		
		JLabel lblEng = new JLabel("English");
		lblEng.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEng.setBounds(10, 119, 64, 29);
		panel_1.add(lblEng);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMath.setBounds(10, 171, 46, 14);
		panel_1.add(lblMath);
		
		JLabel lblDBMS = new JLabel("DBMS");
		lblDBMS.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDBMS.setBounds(10, 210, 46, 14);
		panel_1.add(lblDBMS);
		
		java = new JTextField();
		java.setFont(new Font("Tahoma", Font.BOLD, 14));
		java.setForeground(Color.BLACK);
		java.setHorizontalAlignment(SwingConstants.CENTER);
		java.setBounds(95, 56, 86, 20);
		panel_1.add(java);
		java.setColumns(10);
		
		Eng = new JTextField();
		Eng.setFont(new Font("Tahoma", Font.BOLD, 14));
		Eng.setForeground(Color.BLACK);
		Eng.setHorizontalAlignment(SwingConstants.CENTER);
		Eng.setColumns(10);
		Eng.setBounds(95, 125, 86, 20);
		panel_1.add(Eng);
		
		cpp = new JTextField();
		cpp.setFont(new Font("Tahoma", Font.BOLD, 14));
		cpp.setForeground(Color.BLACK);
		cpp.setHorizontalAlignment(SwingConstants.CENTER);
		cpp.setColumns(10);
		cpp.setBounds(95, 91, 86, 20);
		panel_1.add(cpp);
		
		math = new JTextField();
		math.setFont(new Font("Tahoma", Font.BOLD, 14));
		math.setForeground(Color.BLACK);
		math.setHorizontalAlignment(SwingConstants.CENTER);
		math.setColumns(10);
		math.setBounds(95, 168, 86, 20);
		panel_1.add(math);
		
		dbms = new JTextField();
		dbms.setFont(new Font("Tahoma", Font.BOLD, 14));
		dbms.setForeground(Color.BLACK);
		dbms.setHorizontalAlignment(SwingConstants.CENTER);
		dbms.setColumns(10);
		dbms.setBounds(95, 207, 86, 20);
		panel_1.add(dbms);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a,b,c,d,f,total,per;
				String grade;
				a=Double.parseDouble(java.getText());  // for java marks
				b=Double.parseDouble(cpp.getText());  // for c++ marks
				c=Double.parseDouble(Eng.getText());  //  for English marks
				d=Double.parseDouble(math.getText());  // for math marks
				f=Double.parseDouble(dbms.getText());   // for dbms marks
				
				total=a+b+c+d+f;
				
				per=(total/500)*100;
				
				// Now for Grade.......
				
				if(per<40)
				{
					grade="F";
					Status.setText("Fail");
				}
				else if(per>40 && per<50)
				{
					grade="C";
					Status.setText("Pass");
				}
				else if(per>50 && per<60)
				{
					grade="B";
					Status.setText("Pass");
				}
				else if(per>60 && per<80)
				{
					grade="A";
					Status.setText("Pass");
				}
				else if(per>=80 &&  per<100)
				{
					grade="A+";
					Status.setText("Pass");
				}
				else
				{
					grade="Null";
					Status.setText("Pass");
				}
				
				totalmarks.setText(Double.toString(total));
				Grade.setText(grade);
				percentage.setText(Double.toString(per));
				
				if(a<40||b<40||c<40||d<40||f<40)
				{
					grade="F";
					Status.setText("Fail");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(56, 251, 98, 23);
		panel_1.add(btnNewButton);
	}
}
