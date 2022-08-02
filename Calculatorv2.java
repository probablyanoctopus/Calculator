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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculatorv2 extends JFrame {

	private JPanel contentPane;
	private JTextField display;
	private boolean resultVisible;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatorv2 frame = new Calculatorv2();
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
	public Calculatorv2() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.PLAIN, 24));
		display.setColumns(10);
		
		JPanel buttonPanel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(buttonPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
						.addComponent(display, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(display, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(buttonPanel, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
		);
		buttonPanel.setLayout(new GridLayout(0, 5, 0, 0));
		
	/**
	 *  MEMORY FUNCTIONS
	 */
		
		JButton btnMSave = new JButton("MS");					// SAVE TO MEMORY
		buttonPanel.add(btnMSave);
		
		JButton btnMGrab = new JButton("MG");					// GRAB TO MEMORY
		buttonPanel.add(btnMGrab);
		
		JButton btnMClear = new JButton("MC");					// CLEAR MEMORY
		buttonPanel.add(btnMClear);
		
		JButton btnDel = new JButton("DEL");					// DELETE FROM DISPLAY
		buttonPanel.add(btnDel);
		
		JButton btnClear = new JButton("C");					// CLEAR DISPLAY
		buttonPanel.add(btnClear);
		
		
	/**
	 *  NUMBER BUTTONS 7 8 9 
	 */
		JButton btn7 = new JButton("7");						// NR 7
		buttonPanel.add(btn7);
		
		JButton btn8 = new JButton("8");						// NR 8
		buttonPanel.add(btn8);
		
		JButton btn9 = new JButton("9");						// NR 9
		buttonPanel.add(btn9);
		
	/**
	 *  PLUS & MINUS
		*/
		
		JButton btnPlus = new JButton("+");						// PLUS
		buttonPanel.add(btnPlus);
		
		JButton btnMinus = new JButton("-");					// MINUS
		buttonPanel.add(btnMinus);
			
	
		
	/**
	 *  NUMBER BUTTONS 4 5 6 
	 */
		JButton btn4 = new JButton("4");						// NR 4
		buttonPanel.add(btn4);
		
		JButton btn5 = new JButton("5");						// NR 5
		buttonPanel.add(btn5);
		
		JButton btn6 = new JButton("6");						// NR 6
		buttonPanel.add(btn6);
		
	/**
	 *  MULTIPLY & DIVIDE
	*/		
		JButton btnMultiply = new JButton("*");					// MULTIPLY
		buttonPanel.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");					// DIVIDE
		buttonPanel.add(btnDivide);	
		
		
	/**
	*  NUMBER BUTTONS 1 2 3 
	*/
		JButton btn1 = new JButton("1");						// NR 1
		buttonPanel.add(btn1);
		
		JButton btn2 = new JButton("2");						// NR 2
		buttonPanel.add(btn2);
		
		JButton btn3 = new JButton("3");						// NR 3
		buttonPanel.add(btn3);
		

	/**
	 *  MODULO & FLOOR
	 */

		JButton btnModulo = new JButton("%");					// MODULO
		buttonPanel.add(btnModulo);
		
		JButton btnFloor = new JButton("//");					// FLOOR
		buttonPanel.add(btnFloor);
		
		
	/**
	 *  PLUS/MINUS & 0 & DOT
	 */
		JButton btnPlusMinus = new JButton("+/-");				// PLUS/MINUS
		buttonPanel.add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");						// NR 0
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				processDigit(e.getActionCommand() );
			}
		});
		buttonPanel.add(btn0);
		
		JButton btnDot = new JButton(".");						// DOT
		buttonPanel.add(btnDot);
		
		JButton btnNewButton_5 = new JButton("");				// FREE SPACE
		buttonPanel.add(btnNewButton_5);

		
	/**
	 *  EQUALS
	 */
		JButton btnEquals = new JButton("=");					// EQUALS
		buttonPanel.add(btnEquals);
		
		
		contentPane.setLayout(gl_contentPane);
	}
	
	protected void processDigit(String actionCommand) {
		if (resultVisible == true) { 
			String display1 = display.getText(); 
			display.setText(""+display1);
			resultVisible = false;
	}
		display.setText(display.getText() + actionCommand );
	}

}
