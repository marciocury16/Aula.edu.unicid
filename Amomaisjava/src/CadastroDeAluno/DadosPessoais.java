package CadastroDeAluno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DadosPessoais extends JFrame {

	private JPanel contentPane;
	private JTextField txtRGM;
	private JTextField txtNome;
	private JTextField txtNascimento;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTextField textField;
	private JLabel btnMunicipio;
	private JTextField txtMunicipio;
	private JLabel lblUf;
	private JTextField txtCelular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosPessoais frame = new DadosPessoais();
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
	public DadosPessoais() {
		setTitle("Dados Pessoais");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnRGM = new JLabel("RGM:");
		btnRGM.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM.setBounds(10, 11, 46, 14);
		contentPane.add(btnRGM);
		
		JLabel btnNome = new JLabel("Nome:");
		btnNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNome.setBounds(164, 9, 48, 19);
		contentPane.add(btnNome);
		
		txtRGM = new JTextField();
		txtRGM.setBounds(63, 10, 91, 20);
		contentPane.add(txtRGM);
		txtRGM.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(222, 10, 230, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel btnNascimento = new JLabel("Data de Nascimento:");
		btnNascimento.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNascimento.setBounds(10, 39, 154, 19);
		contentPane.add(btnNascimento);
		
		txtNascimento = new JTextField();
		txtNascimento.setBounds(148, 39, 86, 20);
		contentPane.add(txtNascimento);
		txtNascimento.setColumns(10);
		
		JLabel btnCPF = new JLabel("CPF:");
		btnCPF.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCPF.setBounds(244, 41, 33, 14);
		contentPane.add(btnCPF);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(287, 41, 165, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel btnEmail = new JLabel("E-mail:");
		btnEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEmail.setBounds(10, 79, 46, 14);
		contentPane.add(btnEmail);
		
		JLabel btnEndereco = new JLabel("Endere\u00E7o:");
		btnEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEndereco.setBounds(10, 104, 65, 16);
		contentPane.add(btnEndereco);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(85, 77, 367, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(85, 103, 367, 20);
		contentPane.add(textField);
		
		btnMunicipio = new JLabel("Munic\u00EDpio:");
		btnMunicipio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMunicipio.setBounds(10, 142, 65, 16);
		contentPane.add(btnMunicipio);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setBounds(85, 141, 127, 20);
		contentPane.add(txtMunicipio);
		txtMunicipio.setColumns(10);
		
		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUf.setBounds(222, 142, 14, 16);
		contentPane.add(lblUf);
		
		JComboBox cbEstado = new JComboBox();
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", " BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cbEstado.setBounds(244, 140, 42, 22);
		contentPane.add(cbEstado);
		
		JLabel btnCelular = new JLabel("Celular:");
		btnCelular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCelular.setBounds(290, 142, 65, 16);
		contentPane.add(btnCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(343, 141, 109, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
	}
}
