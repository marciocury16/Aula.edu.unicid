package Aula03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela01 extends JFrame {

	private JPanel contentPane;
	private JLabel btnNome;
	private JLabel btnendeco;
	private JLabel btnGenero;
	private JLabel btnEstadoCivil;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JComboBox cmbGenero;
	private JComboBox cmbEstadoCivil;
	private JButton btnMostrar;
	private JButton btnLimpar;
	private TextArea txtAreaMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
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
	public Tela01() {
		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNome = new JLabel("Nome:");
		btnNome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNome.setBounds(10, 11, 49, 21);
		contentPane.add(btnNome);
		
		btnendeco = new JLabel("Endere\u00E7o:");
		btnendeco.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnendeco.setBounds(10, 32, 75, 21);
		contentPane.add(btnendeco);
		
		btnGenero = new JLabel("G\u00EAnero:");
		btnGenero.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGenero.setBounds(10, 55, 59, 21);
		contentPane.add(btnGenero);
		
		btnEstadoCivil = new JLabel("Estado Civil:");
		btnEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEstadoCivil.setBounds(10, 77, 92, 21);
		contentPane.add(btnEstadoCivil);
		
		txtNome = new JTextField();
		txtNome.setBounds(119, 14, 320, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(119, 35, 320, 20);
		contentPane.add(txtEndereco);
		
		cmbGenero = new JComboBox();
		cmbGenero.setModel(new DefaultComboBoxModel(new String[] {"Selecionar uma op\u00E7\u00E3o:", "Masculino Cis", "Feminino Cis", "Masculino Trans", "Femino Trans", "N\u00E3o Bin\u00E1rio"}));
		cmbGenero.setBounds(237, 58, 202, 20);
		contentPane.add(cmbGenero);
		
		cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o:", "Casado (a)", "Solteiro (a)", "Divorciado (a)", "Vi\u00FAvo (a)"}));
		cmbEstadoCivil.setBounds(237, 80, 202, 20);
		contentPane.add(cmbEstadoCivil);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//==============================================
				
				txtAreaMostrar.append("nome........" + txtNome.getText()+ "\n");
				txtAreaMostrar.append("Endereco......" + txtEndereco.getText()+ "\n");
				txtAreaMostrar.append("Gênero........" + cmbGenero.getSelectedIndex() + "\n");
				
				
				//==============================================
				
				
				
			}
		});
		btnMostrar.setBounds(237, 111, 89, 23);
		contentPane.add(btnMostrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//========================================================
				txtNome.setText(null);
				txtEndereco.setText(null);
				cmbGenero.setSelectedIndex(0);
				cmbEstadoCivil.setSelectedIndex(0);
				txtAreaMostrar.setText(" ");			
				
				
			//========================================================	
				
			}
			
		});btnLimpar.setBounds(347,111,89,23);contentPane.add(btnLimpar);

	txtAreaMostrar=new TextArea();txtAreaMostrar.setBounds(10,154,429,151);contentPane.add(txtAreaMostrar);
}
}

