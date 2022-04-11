package CadastroDeAluno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 264, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salvar");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("excluir");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 33, 575, 307);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 462, 198);
		panel.add(contentPane_1);
		
		JLabel btnRGM = new JLabel("RGM:");
		btnRGM.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM.setBounds(10, 11, 46, 14);
		contentPane_1.add(btnRGM);
		
		JLabel btnNome = new JLabel("Nome:");
		btnNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNome.setBounds(164, 9, 48, 19);
		contentPane_1.add(btnNome);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(63, 10, 91, 20);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(222, 10, 230, 20);
		contentPane_1.add(textField_1);
		
		JLabel btnNascimento = new JLabel("Data de Nascimento:");
		btnNascimento.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNascimento.setBounds(10, 39, 154, 19);
		contentPane_1.add(btnNascimento);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 39, 86, 20);
		contentPane_1.add(textField_2);
		
		JLabel btnCPF = new JLabel("CPF:");
		btnCPF.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCPF.setBounds(244, 41, 33, 14);
		contentPane_1.add(btnCPF);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(287, 41, 165, 20);
		contentPane_1.add(textField_3);
		
		JLabel btnEmail = new JLabel("E-mail:");
		btnEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEmail.setBounds(10, 79, 46, 14);
		contentPane_1.add(btnEmail);
		
		JLabel btnEndereco = new JLabel("Endere\u00E7o:");
		btnEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEndereco.setBounds(10, 104, 65, 16);
		contentPane_1.add(btnEndereco);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(85, 77, 367, 20);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(85, 103, 367, 20);
		contentPane_1.add(textField_5);
		
		JLabel btnMunicipio = new JLabel("Munic\u00EDpio:");
		btnMunicipio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMunicipio.setBounds(10, 142, 65, 16);
		contentPane_1.add(btnMunicipio);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(85, 141, 127, 20);
		contentPane_1.add(textField_6);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUf.setBounds(222, 142, 14, 16);
		contentPane_1.add(lblUf);
		
		JComboBox cbEstado = new JComboBox();
		cbEstado.setBounds(244, 140, 42, 22);
		contentPane_1.add(cbEstado);
		
		JLabel btnCelular = new JLabel("Celular:");
		btnCelular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCelular.setBounds(290, 142, 65, 16);
		contentPane_1.add(btnCelular);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(343, 141, 109, 20);
		contentPane_1.add(textField_7);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBounds(0, 0, 446, 226);
		panel_1.add(contentPane_2);
		
		JLabel btnCurso = new JLabel("Curso:");
		btnCurso.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCurso.setBounds(21, 23, 46, 14);
		contentPane_2.add(btnCurso);
		
		JLabel btnCampus = new JLabel("Campus:");
		btnCampus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCampus.setBounds(21, 48, 69, 16);
		contentPane_2.add(btnCampus);
		
		JLabel btnperiodo = new JLabel("Per\u00EDodo");
		btnperiodo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnperiodo.setBounds(21, 87, 49, 16);
		contentPane_2.add(btnperiodo);
		
		JComboBox cbCurso = new JComboBox();
		cbCurso.setBounds(132, 20, 252, 22);
		contentPane_2.add(cbCurso);
		
		JComboBox cbCampus = new JComboBox();
		cbCampus.setBounds(132, 46, 252, 22);
		contentPane_2.add(cbCampus);
		
		JRadioButton rbdMatutino = new JRadioButton("Matutino");
		buttonGroup.add(rbdMatutino);
		rbdMatutino.setBounds(102, 85, 74, 23);
		contentPane_2.add(rbdMatutino);
		
		JRadioButton rbdVespertino = new JRadioButton("Vespertino");
		buttonGroup.add(rbdVespertino);
		rbdVespertino.setBounds(178, 85, 77, 23);
		contentPane_2.add(rbdVespertino);
		
		JRadioButton rbdNoturno = new JRadioButton("Noturno");
		buttonGroup.add(rbdNoturno);
		rbdNoturno.setBounds(269, 85, 74, 23);
		contentPane_2.add(rbdNoturno);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 147, 90, 68);
		contentPane_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(88, 147, 89, 68);
		contentPane_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(176, 147, 89, 68);
		contentPane_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(264, 147, 89, 68);
		contentPane_2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(347, 147, 89, 68);
		contentPane_2.add(btnNewButton_3_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel contentPane_3 = new JPanel();
		contentPane_3.setLayout(null);
		contentPane_3.setToolTipText("Programa\u00E7\u00E3o Orientada a Objeto\r\nT\u00E9cninas de Programa\u00E7\u00E3o\r\nBanco de Dados\r\nEngenharia de Software");
		contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_3.setBounds(0, 0, 434, 184);
		panel_2.add(contentPane_3);
		
		JLabel btnRGM_1 = new JLabel("RGM");
		btnRGM_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM_1.setBounds(10, 32, 37, 14);
		contentPane_3.add(btnRGM_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(46, 30, 97, 20);
		contentPane_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(153, 30, 272, 20);
		contentPane_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.LIGHT_GRAY);
		textField_10.setBounds(10, 61, 414, 20);
		contentPane_3.add(textField_10);
		
		JLabel btnDisciplina = new JLabel("Disciplina");
		btnDisciplina.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDisciplina.setBounds(10, 92, 59, 16);
		contentPane_3.add(btnDisciplina);
		
		JComboBox cmbDisciplina = new JComboBox();
		cmbDisciplina.setBackground(Color.GRAY);
		cmbDisciplina.setBounds(102, 90, 322, 22);
		contentPane_3.add(cmbDisciplina);
		
		JLabel btnSemestre = new JLabel("Semestre");
		btnSemestre.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSemestre.setBounds(10, 125, 62, 16);
		contentPane_3.add(btnSemestre);
		
		JComboBox cmbSemestre = new JComboBox();
		cmbSemestre.setBounds(102, 123, 89, 22);
		contentPane_3.add(cmbSemestre);
		
		JLabel btnNota = new JLabel("Nota");
		btnNota.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNota.setBounds(201, 123, 46, 14);
		contentPane_3.add(btnNota);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(234, 123, 53, 22);
		contentPane_3.add(comboBox);
		
		JLabel btnFalta = new JLabel("Falta");
		btnFalta.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFalta.setBounds(297, 123, 46, 14);
		contentPane_3.add(btnFalta);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(338, 124, 86, 20);
		contentPane_3.add(textField_11);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
	}
}
