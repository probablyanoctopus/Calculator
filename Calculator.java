package userinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Calculator extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField display;
	private String operand1;
	private String operator;
	private String operand2;
	private double result;
	boolean resultVisible = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		display = new JTextField();
		display.setForeground(new Color(51, 0, 0));
		display.setBackground(new Color(204, 153, 102));
		display.setFont(new Font("Elephant", Font.PLAIN, 17));
		display.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setLayout(new GridLayout(0, 5, 2, 2));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
						.addComponent(display, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(display, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		// BUTTON 7
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(160, 82, 45));
		btn7.setForeground(new Color(51, 0, 0));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn7.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn7);
		
		// BUTTON 8
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(160, 82, 45));
		btn8.setForeground(new Color(51, 0, 0));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn8.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn8);
		
		// BUTTON 9
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(160, 82, 45));
		btn9.setForeground(new Color(51, 0, 0));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn9.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn9);
		
		// BUTTON ERASER
		JButton btnErase = new JButton("DEL");
		btnErase.setBackground(new Color(204, 102, 51));
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = display.getText();
				if (tmp.length()>1) 
				    display.setText( tmp.substring(0, tmp.length()-1) );
				else 
				    display.setText("");
			}
		});
		btnErase.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnErase);
		
		// BUTTON CLEAR
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(204, 102, 51));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand1 = "";
				operand2 = "";
				operator = ""; 
				display.setText("");
			}
		});
		btnClear.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnClear);
		

		// BUTTON 4
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(160, 82, 45));
		btn4.setForeground(new Color(51, 0, 0));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn4.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn4);
		
		// BUTTON 5
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(160, 82, 45));
		btn5.setForeground(new Color(51, 0, 0));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn5.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn5);
		
		// BUTTON 6
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(160, 82, 45));
		btn6.setForeground(new Color(51, 0, 0));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn6.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn6);
		
		// BUTTON PLUS
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(204, 153, 102));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setOperator(e.getActionCommand() );
			}
		});
		btnPlus.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnPlus);

		// BUTTON MINUS
		JButton btnMin = new JButton("-");
		btnMin.setBackground(new Color(204, 153, 102));
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setOperator(e.getActionCommand() );
			}
		});
		btnMin.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnMin);

		
		// BUTTON 1
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(160, 82, 45));
		btn1.setForeground(new Color(51, 0, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn1.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn1);

		// BUTTON 2
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(160, 82, 45));
		btn2.setForeground(new Color(51, 0, 0));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn2.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn2);
		
		// BUTTON 3
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(160, 82, 45));
		btn3.setForeground(new Color(51, 0, 0));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn3.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn3);
		
		// BUTTON MULTIPLIER
		JButton btnMul = new JButton("*");
		btnMul.setBackground(new Color(204, 153, 102));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setOperator(e.getActionCommand() );
			}
		});
		btnMul.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnMul);
		
		// BUTTON DIVIDER
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(204, 153, 102));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setOperator(e.getActionCommand() );
			}
		});
		btnDiv.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnDiv);
		

		// BUTTON 0
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(160, 82, 45));
		btn0.setForeground(new Color(51, 0, 0));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		btn0.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btn0);
		
		// BUTTON DOT
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(210, 180, 140));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = display.getText();
				if (n.contains(".")) return;
					processDigit(e.getActionCommand() );
			}		
		});
		btnDot.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnDot);
		
		// BUTTON PLUSMINUS
		JButton btnPlusMin = new JButton("+/-");
		btnPlusMin.setBackground(new Color(210, 180, 140));
		btnPlusMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = display.getText();
				char first = tmp.charAt(0);
				if (first == '-') {
					display.setText(tmp.substring(1, tmp.length()));		
				} else {
					display.setText("-"+tmp);
				}
			}
		});
		btnPlusMin.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnPlusMin);
		
		// BUTTON MODULO
		JButton btnModu = new JButton("%");
		btnModu.setBackground(new Color(204, 153, 102));
		btnModu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setOperator(e.getActionCommand() );
			}
		});
		btnModu.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnModu);
		
		//BUTTON FLOOR
		JButton btnFloor = new JButton("//");
		btnFloor.setBackground(new Color(204, 153, 102));
		btnFloor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOperator(e.getActionCommand() );
				}
		});
		btnFloor.setFont(new Font("Elephant", Font.BOLD, 14));
		panel.add(btnFloor);

		
		// BUTTON EQUALS
		JButton btnEq = new JButton("=");
		btnEq.setForeground(new Color(204, 153, 102));
		btnEq.setBackground(new Color(153, 51, 0));
		btnEq.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			operand2 = display.getText();
			double o1 = Double.parseDouble(operand1);
			double o2 = Double.parseDouble(operand2);
			
			// EXECUTING EQUALS
			String x = operator;
				switch (x) {
				case "+":
					result = o1 + o2;
					display.setText(""+result);
					break;
				case "-":
					result = o1 - o2;
					display.setText(""+result);
					break;
				case "*":
					result = o1 * o2;
					display.setText(""+result);
					break;
				case "/":
					result = o1 / o2;
					display.setText(""+result);
					break;
				case "%":
					result = o1 % o2;
					display.setText(""+result);
					break;
				case "//":
					result = (int)(o1 / o2);
					display.setText(""+result);
					break;
				}
				operand1 = ""; operand2 = ""; operator = "";
				resultVisible = true;
			}
		
		});
		btnEq.setFont(new Font("Elephant", Font.BOLD, 41));
		panel.add(btnEq);
		
	}

	protected void setOperator(String actionCommand) {
		operand1 = display.getText();
		operator = actionCommand;
		display.setText("");
	}

	protected void processDigit(String actionCommand) {
		if (resultVisible == true) { 
			display.setText("");
			resultVisible = false;
		}
		display.setText(display.getText() + actionCommand );
	}
		
}
