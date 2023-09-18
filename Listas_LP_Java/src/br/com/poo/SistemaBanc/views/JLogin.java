package br.com.poo.SistemaBanc.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCpf;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setTitle("Banco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(209, 26, 159, 31);
		contentPane.add(lblNewLabel);
		
		textCpf = new JTextField();
		textCpf.setBounds(209, 79, 139, 19);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(207, 122, 141, 19);
		contentPane.add(textSenha);
		
		JLabel lblNewLabel_1 = new JLabel("cpf");
		lblNewLabel_1.setBounds(209, 67, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setBounds(209, 108, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JButton buttonEntrar = new JButton("Entrar");
		buttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = textCpf.getText();
				String senha = new String(textSenha.getPassword());
				if(cpf!= null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(buttonEntrar, "Bem-vindo(a), " + cpf);
				}
				else {
					JOptionPane.showMessageDialog(buttonEntrar, "Há campos inválidos","Aviso!", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		buttonEntrar.setBounds(236, 198, 85, 21);
		contentPane.add(buttonEntrar);
	}
}
