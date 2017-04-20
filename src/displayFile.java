import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class displayFile {
	
	private JFrame frame = new JFrame();
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayFile window = new displayFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public displayFile() {
		initialize();
	}
	
	public void initialize () {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JTextArea textArea = new JTextArea();

		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setForeground(Color.RED);
		textArea.setBounds(82, 34, 275, 107);
		frame.getContentPane().add(textArea);
		
		JButton button = new JButton("Get File");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				readFile of = new readFile();
				
				try {
					of.PickMe();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				textArea.setText(of.sb.toString());
			}
			
		});
		button.setBounds(160, 182, 121, 43);
		frame.getContentPane().add(button);
	}
}
