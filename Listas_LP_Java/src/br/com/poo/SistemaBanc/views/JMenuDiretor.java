package br.com.poo.SistemaBanc.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JMenuDiretor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuDiretor frame = new JMenuDiretor();
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
	public JMenuDiretor() {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JMenuDiretor.class.getResource("/br/com/poo/imagens/50x50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.GRAY, 5, true));
		panel.setBounds(20, 142, 406, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(JMenuDiretor.class.getResource("/br/com/poo/imagens/cliente100.png")));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(54, 50, 100, 100);
		panel.add(btnNewButton);
		
		JButton btnCadastrarGerente = new JButton("");
		btnCadastrarGerente.setIcon(new ImageIcon(JMenuDiretor.class.getResource("/br/com/poo/imagens/GERENTE100.png")));
		btnCadastrarGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrarGerente.setBackground(Color.GRAY);
		btnCadastrarGerente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrarGerente.setBounds(260, 39, 100, 100);
		panel.add(btnCadastrarGerente);
		
		JButton btnGerarRelatrio = new JButton("");
		btnGerarRelatrio.setIcon(new ImageIcon(JMenuDiretor.class.getResource("/br/com/poo/imagens/Relatorio200x100.jpg")));
		btnGerarRelatrio.setBackground(Color.GRAY);
		btnGerarRelatrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarRelatrio.setBounds(150, 167, 200, 61);
		panel.add(btnGerarRelatrio);
		
		JButton btnContinuar = new JButton("");
		btnContinuar.setIcon(new ImageIcon(JMenuDiretor.class.getResource("/br/com/poo/imagens/Design sem nome.png")));
		btnContinuar.setBackground(Color.GRAY);
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContinuar.setBounds(346, 247, 50, 50);
		panel.add(btnContinuar);
		
		JButton btnVoltarAoMenu = new JButton("");
		btnVoltarAoMenu.setIcon(new ImageIcon(JMenuDiretor.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnVoltarAoMenu.setBackground(Color.GRAY);
		btnVoltarAoMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltarAoMenu.setBounds(10, 247, 50, 50);
		panel.add(btnVoltarAoMenu);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastrar");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(150, 20, 100, 21);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Gerar");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(70, 185, 100, 21);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JMenuDiretor.class.getResource("/br/com/poo/imagens/200x200.png")));
		lblNewLabel.setBounds(-27, 0, 150, 112);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 122, 416, 13);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Bem-vindo(a) ao menu Diretor!");
		lblNewLabel_1.setBounds(128, 35, 259, 38);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
	}
}
