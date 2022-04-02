package CadastroDeAluno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class JanelaComAbas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaComAbas frame = new JanelaComAbas();
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
	public JanelaComAbas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel pnDadosPessoais = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, pnDadosPessoais, null);
		
		JPanel pnCurso = new JPanel();
		tabbedPane.addTab("Curso", null, pnCurso, null);
		
		JPanel pnNotaeFalta = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, pnNotaeFalta, null);
		
		JPanel pnBoletim = new JPanel();
		tabbedPane.addTab("Boletim", null, pnBoletim, null);
	}

}
