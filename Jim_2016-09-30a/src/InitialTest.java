
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class InitialTest {

	public JFrame frame;
	public JTextField textField;
	public JTextPane txtpnF;
	String move; int Sum;
	String[] ary1 = new String[1];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialTest window = new InitialTest();
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
	public InitialTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 196, 191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 160, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//String var1 = textField.getText();
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				move = textField.getText();
				txtpnF.setText(move); 
				final int Sum=5;
				System.out.println("1 -- Test: "+move+" another test: "+textField.getText());
				ary1[0] = move;
			}
		});
		btnOkay.setBounds(47, 42, 89, 23);
		
		frame.getContentPane().add(btnOkay);
		
		txtpnF = new JTextPane();
		txtpnF.setBounds(10, 72, 160, 70);
		frame.getContentPane().add(txtpnF);
		
		//String simplify = textField.getText();
		System.out.println("2 -- Test: "+move+" another test: "+textField.getText()+" test "+ary1[0]+" test "+Sum);
	}
}
