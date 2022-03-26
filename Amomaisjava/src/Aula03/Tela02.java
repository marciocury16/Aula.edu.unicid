package Aula03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Tela02 extends JFrame {

	private JPanel contentPane;
	private JLabel btnTipoSorvete;
	private JLabel btnSorveteDeFrutas;
	private JLabel btnChocolateFrutas;
	private JLabel btnBola;
	private JLabel btnPote2l;
	private JLabel btnQtde;
	private JLabel btnPrecoUnitario;
	private JTextField textQtdeSorveteDeFtrutas;
	private JTextField textPrecoSorveteDeFtrutas;
	private JTextField textQtdeChocolateFrutas;
	private JTextField textPrecoChocolateFrutas;
	private JTextField textQtdePote2l;
	private JTextField textPrecoPote2l;
	private JTextField txtQtdeBola;
	private JTextField txtPrecoBola;
	private JTextField textTotal;
	private JLabel btnTotal;
	private JButton btnLimpar;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela02 frame = new Tela02();
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
	public Tela02() {
		setFont(new Font("Arial Black", Font.ITALIC, 12));
		setTitle("Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnTipoSorvete = new JLabel("Tipo de Sorvete");
		btnTipoSorvete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTipoSorvete.setBounds(10, 31, 132, 20);
		contentPane.add(btnTipoSorvete);
		
		btnSorveteDeFrutas = new JLabel("Sorvete de Frutas");
		btnSorveteDeFrutas.setForeground(Color.RED);
		btnSorveteDeFrutas.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSorveteDeFrutas.setBounds(10, 65, 133, 19);
		contentPane.add(btnSorveteDeFrutas);
		
		btnChocolateFrutas = new JLabel("Chocolate/Frutas");
		btnChocolateFrutas.setForeground(Color.RED);
		btnChocolateFrutas.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnChocolateFrutas.setBounds(10, 90, 131, 19);
		contentPane.add(btnChocolateFrutas);
		
		btnBola = new JLabel("Bola");
		btnBola.setForeground(Color.RED);
		btnBola.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBola.setBounds(10, 115, 33, 19);
		contentPane.add(btnBola);
		
		btnPote2l = new JLabel("Pote de 2L.");
		btnPote2l.setForeground(Color.RED);
		btnPote2l.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPote2l.setBounds(10, 140, 84, 19);
		contentPane.add(btnPote2l);
		
		btnQtde = new JLabel("Qtde.");
		btnQtde.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnQtde.setBounds(152, 34, 46, 14);
		contentPane.add(btnQtde);
		
		btnPrecoUnitario = new JLabel("Pre\u00E7o Unit\u00E1rio");
		btnPrecoUnitario.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrecoUnitario.setBounds(263, 32, 108, 19);
		contentPane.add(btnPrecoUnitario);
		
		textQtdeSorveteDeFtrutas = new JTextField();
		textQtdeSorveteDeFtrutas.setBounds(151, 68, 109, 20);
		contentPane.add(textQtdeSorveteDeFtrutas);
		textQtdeSorveteDeFtrutas.setColumns(10);
		
		textPrecoSorveteDeFtrutas = new JTextField();
		textPrecoSorveteDeFtrutas.setBounds(263, 68, 114, 20);
		contentPane.add(textPrecoSorveteDeFtrutas);
		textPrecoSorveteDeFtrutas.setColumns(10);
		
		textQtdeChocolateFrutas = new JTextField();
		textQtdeChocolateFrutas.setColumns(10);
		textQtdeChocolateFrutas.setBounds(151, 90, 109, 20);
		contentPane.add(textQtdeChocolateFrutas);
		
		textPrecoChocolateFrutas = new JTextField();
		textPrecoChocolateFrutas.setColumns(10);
		textPrecoChocolateFrutas.setBounds(263, 90, 114, 20);
		contentPane.add(textPrecoChocolateFrutas);
		
		textQtdePote2l = new JTextField();
		textQtdePote2l.setColumns(10);
		textQtdePote2l.setBounds(151, 139, 109, 20);
		contentPane.add(textQtdePote2l);
		
		textPrecoPote2l = new JTextField();
		textPrecoPote2l.setColumns(10);
		textPrecoPote2l.setBounds(263, 139, 114, 20);
		contentPane.add(textPrecoPote2l);
		
		txtQtdeBola = new JTextField();
		txtQtdeBola.setColumns(10);
		txtQtdeBola.setBounds(151, 115, 109, 20);
		contentPane.add(txtQtdeBola);
		
		txtPrecoBola = new JTextField();
		txtPrecoBola.setColumns(10);
		txtPrecoBola.setBounds(263, 115, 114, 20);
		contentPane.add(txtPrecoBola);
		
		textTotal = new JTextField();
		textTotal.setColumns(10);
		textTotal.setBounds(263, 160, 114, 20);
		contentPane.add(textTotal);
		
		btnTotal = new JLabel("Total:");
		btnTotal.setBackground(Color.CYAN);
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBounds(152, 166, 71, 14);
		contentPane.add(btnTotal);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//===============================================
				
				textQtdeSorveteDeFtrutas.setText(null);
				textPrecoSorveteDeFtrutas.setText(null);
				textQtdeChocolateFrutas.setText(null);
				textPrecoChocolateFrutas.setText(null);
				textQtdePote2l.setText(null);
				textPrecoPote2l.setText(null);
				txtQtdeBola.setText(null);
				txtPrecoBola.setText(null);
				textTotal.setText(null);						
				
				//===============================================
			
			
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(273, 191, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//===================================
				
				int textQtdeSorveteDeFtrutas = Intereger.parseInt(textQtdeSorveteDeFtrutas.getText());
				double textPrecoSorveteDeFtrutas = double.parseDouble(textPrecoSorveteDeFtrutas.getText());
				int textQtdeChocolateFrutas = Intereger.parseDouble(textQtdeChocolateFrutas.getText());
				double textPrecoChocolateFrutas = double.parseDouble(textPrecoChocolateFrutas.getText);
				
				
				
				double resultado = (textQtdeSorveteDeFtrutas * textPrecoSorveteDeFtrutas ) +
								   (textQtdeChocolateFrutas * extPrecoChocolateFrutas ) +	
								   (textQtdeSorveteDeFtrutas * textPrecoSorveteDeFtrutas ) +
								   (textQtdeSorveteDeFtrutas * textPrecoSorveteDeFtrutas ) ;
				
				textTotal.setText(String.valueOf(resultado));
				
				
				//===================================
				
				
				
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(171, 191, 89, 23);
		contentPane.add(btnCalcular);
	}
}
