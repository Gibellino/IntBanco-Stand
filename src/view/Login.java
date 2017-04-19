package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import bd.Database;
import controller.GestaoConta;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	JFrame login;
	private JTextField logUser;
	private JTextField logPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Database bd;
	GestaoConta gC;
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		bd = new Database();
		gC = new GestaoConta();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login = new JFrame();
		login.setBounds(100, 100, 347, 227);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNome = new JLabel("Nome:");
		
		JLabel lblPassword = new JLabel("Password:");
		
		logUser = new JTextField();
		logUser.setColumns(10);
		
		logPass = new JTextField();
		logPass.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.dispose();
			}
		});
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!logUser.getText().isEmpty() && !logPass.getText().isEmpty()){
					if(new GestaoConta().login(logUser.getText(), logPass.getText()) == true){
						JOptionPane.showMessageDialog(null, "Bem-Vindo " + logUser.getText() + " !");
						login.dispose();
						new Atm().atm.dispose();
						new TDL().tdl.setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Credênciais erradas!");
						login.dispose();
					}
				}
				else{
					
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(login.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPassword)
								.addComponent(lblNome))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(logUser, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(logPass, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(lblLogin)))
					.addContainerGap(176, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(btnLogin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSair)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(lblLogin)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(logUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(logPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSair)
						.addComponent(btnLogin))
					.addContainerGap())
		);
		login.getContentPane().setLayout(groupLayout);
	}

}
