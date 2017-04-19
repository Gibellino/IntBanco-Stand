package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TDL {

	JFrame tdl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TDL window = new TDL();
					window.tdl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TDL() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tdl = new JFrame();
		tdl.setBounds(100, 100, 450, 300);
		tdl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
