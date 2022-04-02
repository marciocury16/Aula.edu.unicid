package CadastroDeAluno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NotasFaltas extends JFrame {

	private JPanel contentPane;
	private JTextField txtRGM;
	private JTextField txtConsultaAluno;
	private JTextField txtConsultaCurso;
	private JTextField txtFalta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasFaltas frame = new NotasFaltas();
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
	public NotasFaltas() {
		setTitle("Notas e Faltas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		contentPane = new JPanel();
		contentPane.setToolTipText("Programa\u00E7\u00E3o Orientada a Objeto\r\nT\u00E9cninas de Programa\u00E7\u00E3o\r\nBanco de Dados\r\nEngenharia de Software");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnRGM = new JLabel("RGM");
		btnRGM.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM.setBounds(10, 32, 37, 14);
		contentPane.add(btnRGM);
		
		txtRGM = new JTextField();
		txtRGM.setBounds(46, 30, 97, 20);
		contentPane.add(txtRGM);
		txtRGM.setColumns(10);
		
		txtConsultaAluno = new JTextField();
		txtConsultaAluno.setBackground(Color.LIGHT_GRAY);
		txtConsultaAluno.setBounds(153, 30, 272, 20);
		contentPane.add(txtConsultaAluno);
		txtConsultaAluno.setColumns(10);
		
		txtConsultaCurso = new JTextField();
		txtConsultaCurso.setColumns(10);
		txtConsultaCurso.setBackground(Color.LIGHT_GRAY);
		txtConsultaCurso.setBounds(10, 61, 414, 20);
		contentPane.add(txtConsultaCurso);
		
		JLabel btnDisciplina = new JLabel("Disciplina");
		btnDisciplina.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDisciplina.setBounds(10, 92, 59, 16);
		contentPane.add(btnDisciplina);
		
		JComboBox cmbDisciplina = new JComboBox();
		cmbDisciplina.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Op\u00E7\u00E3o:", "Programa\u00E7\u00E3o Orientada a Objeto", "T\u00E9cnincas de Programa\u00E7\u00E3o", "Banco de dados"}));
		cmbDisciplina.setBackground(Color.GRAY);
		cmbDisciplina.setBounds(102, 90, 322, 22);
		contentPane.add(cmbDisciplina);
		
		JLabel btnSemestre = new JLabel("Semestre");
		btnSemestre.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSemestre.setBounds(10, 125, 62, 16);
		contentPane.add(btnSemestre);
		
		JComboBox cmbSemestre = new JComboBox();
		cmbSemestre.setBounds(102, 123, 89, 22);
		contentPane.add(cmbSemestre);
		
		JLabel btnNota = new JLabel("Nota");
		btnNota.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNota.setBounds(201, 123, 46, 14);
		contentPane.add(btnNota);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(234, 123, 53, 22);
		contentPane.add(comboBox);
		
		JLabel btnFalta = new JLabel("Falta");
		btnFalta.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFalta.setBounds(297, 123, 46, 14);
		contentPane.add(btnFalta);
		
		txtFalta = new JTextField();
		txtFalta.setBounds(338, 124, 86, 20);
		contentPane.add(txtFalta);
		txtFalta.setColumns(10);
	}
}
