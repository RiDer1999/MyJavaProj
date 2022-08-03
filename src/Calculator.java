import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnPlusMinus;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnPercentage;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnNewButton_20;
	private JButton btnNewButton_21;
	private JButton btnNewButton_22;
	private JButton btnBackspce;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnDot;
	private JButton btnNewButton_28;
	private JButton btnNewButton_29;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMultiplication;
	private JButton btnDivide;
	private JButton btnEqual;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnOff;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 403, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(0, 0, 284, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(10, 28, 356, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(0, 91, 77, 63);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(0, 154, 77, 63);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(0, 216, 77, 63);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(0, 279, 77, 63);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(0, 342, 77, 63);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while (a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(0, 405, 77, 63);
		frame.getContentPane().add(btnNewButton_5);
		
		btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlusMinus.setBounds(0, 471, 77, 63);
		frame.getContentPane().add(btnPlusMinus);
		
		btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(78, 91, 77, 63);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("log");
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBounds(78, 154, 77, 63);
		frame.getContentPane().add(btnNewButton_8);
		
		btnPercentage = new JButton("%");
		btnPercentage.setEnabled(false);
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPercentage.setBounds(78, 216, 77, 63);
		frame.getContentPane().add(btnPercentage);
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn7.setBounds(78, 279, 77, 63);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn4.setBounds(78, 342, 77, 63);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn1.setBounds(78, 405, 77, 63);
		frame.getContentPane().add(btn1);
		
		btnNewButton_14 = new JButton("Sin");
		btnNewButton_14.setEnabled(false);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_14.setBounds(155, 91, 77, 63);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("Sinh");
		btnNewButton_15.setEnabled(false);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.setBounds(155, 154, 77, 63);
		frame.getContentPane().add(btnNewButton_15);
		
		btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnClear.setBounds(155, 216, 77, 63);
		frame.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn8.setBounds(155, 279, 77, 63);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn5.setBounds(155, 342, 77, 63);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn2.setBounds(155, 405, 77, 63);
		frame.getContentPane().add(btn2);
		
		btnNewButton_20 = new JButton("0");
		btnNewButton_20.setEnabled(false);
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_20.getText();
				textField.setText(number);
			}
			
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_20.setBounds(78, 471, 154, 63);
		frame.getContentPane().add(btnNewButton_20);
		
		btnNewButton_21 = new JButton("Cos");
		btnNewButton_21.setEnabled(false);
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_21.setBounds(231, 91, 77, 63);
		frame.getContentPane().add(btnNewButton_21);
		
		btnNewButton_22 = new JButton("Cosh");
		btnNewButton_22.setEnabled(false);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_22.setBounds(231, 154, 77, 63);
		frame.getContentPane().add(btnNewButton_22);
		
		btnBackspce = new JButton("\uF0E7");
		btnBackspce.setEnabled(false);
		btnBackspce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace=str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBackspce.setFont(new Font("Wingdings", Font.PLAIN, 23));
		btnBackspce.setBounds(231, 216, 77, 63);
		frame.getContentPane().add(btnBackspce);
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn9.setBounds(231, 279, 77, 63);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn6.setBounds(231, 342, 77, 63);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn3.setBounds(231, 405, 77, 63);
		frame.getContentPane().add(btn3);
		
		btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnDot.setBounds(231, 471, 77, 63);
		frame.getContentPane().add(btnDot);
		
		btnNewButton_28 = new JButton("Tan");
		btnNewButton_28.setEnabled(false);
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_28.setBounds(310, 91, 77, 63);
		frame.getContentPane().add(btnNewButton_28);
		
		btnNewButton_29 = new JButton("Tanh");
		btnNewButton_29.setEnabled(false);
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_29.setBounds(310, 154, 77, 63);
		frame.getContentPane().add(btnNewButton_29);
		
		btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnAdd.setBounds(310, 216, 77, 63);
		frame.getContentPane().add(btnAdd);
		
		btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSub.setBounds(310, 279, 77, 63);
		frame.getContentPane().add(btnSub);
		
		btnMultiplication = new JButton("*");
		btnMultiplication.setEnabled(false);
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnMultiplication.setBounds(310, 342, 77, 63);
		frame.getContentPane().add(btnMultiplication);
		
		btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnDivide.setBounds(310, 405, 77, 63);
		frame.getContentPane().add(btnDivide);
		
		btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
					
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnEqual.setBounds(310, 471, 77, 63);
		frame.getContentPane().add(btnEqual);
		
		rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMultiplication.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnNewButton_20.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnEqual.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnPercentage.setEnabled(true);
				btnNewButton_7.setEnabled(true);
				btnNewButton_8.setEnabled(true);
				btnClear.setEnabled(true);
				btnNewButton_14.setEnabled(true);
				btnNewButton_15.setEnabled(true);
				btnBackspce.setEnabled(true);
				btnNewButton_21.setEnabled(true);
				btnNewButton_22.setEnabled(true);
				btnNewButton_28.setEnabled(true);
				btnNewButton_29.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(0, 71, 59, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnOff = new JRadioButton("Off");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMultiplication.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnNewButton_20.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnEqual.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnPercentage.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnClear.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnBackspce.setEnabled(false);
				btnNewButton_21.setEnabled(false);
				btnNewButton_22.setEnabled(false);
				btnNewButton_28.setEnabled(false);
				btnNewButton_29.setEnabled(false);
				textField.setEnabled(false);
				
				
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnOff.setBounds(63, 71, 59, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
