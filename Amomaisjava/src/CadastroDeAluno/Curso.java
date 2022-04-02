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
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Curso extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Curso frame = new Curso();
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
	public Curso() {
		setTitle("Curso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnCurso = new JLabel("Curso:");
		btnCurso.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCurso.setBounds(21, 23, 46, 14);
		contentPane.add(btnCurso);
		
		JLabel btnCampus = new JLabel("Campus:");
		btnCampus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCampus.setBounds(21, 48, 69, 16);
		contentPane.add(btnCampus);
		
		JLabel btnperiodo = new JLabel("Per\u00EDodo");
		btnperiodo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnperiodo.setBounds(21, 87, 49, 16);
		contentPane.add(btnperiodo);
		
		JComboBox cbCurso = new JComboBox();
		cbCurso.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o:", "An\u00E1lise e Desenvolvimento de Sistemas", "Ci\u00EAncias da Computa\u00E7\u00E3o", "Redes"}));
		cbCurso.setBounds(132, 20, 252, 22);
		contentPane.add(cbCurso);
		
		JComboBox cbCampus = new JComboBox();
		cbCampus.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o:", "Tatuap\u00E9", "An\u00E1lia Franco", "S\u00E3o Miguel", "Br\u00E1s Cubas"}));
		cbCampus.setBounds(132, 46, 252, 22);
		contentPane.add(cbCampus);
		
		JRadioButton rbdMatutino = new JRadioButton("Matutino");
		buttonGroup.add(rbdMatutino);
		rbdMatutino.setBounds(102, 85, 74, 23);
		contentPane.add(rbdMatutino);
		
		JRadioButton rbdVespertino = new JRadioButton("Vespertino");
		buttonGroup.add(rbdVespertino);
		rbdVespertino.setBounds(178, 85, 77, 23);
		contentPane.add(rbdVespertino);
		
		JRadioButton rbdNoturno = new JRadioButton("Noturno");
		buttonGroup.add(rbdNoturno);
		rbdNoturno.setBounds(269, 85, 74, 23);
		contentPane.add(rbdNoturno);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 147, 90, 68);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(88, 147, 89, 68);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(176, 147, 89, 68);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(264, 147, 89, 68);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(347, 147, 89, 68);
		contentPane.add(btnNewButton_3_1);
	}

}
