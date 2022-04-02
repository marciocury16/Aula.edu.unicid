package Aula;

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
	private JTextField textQtd1;
	private JTextField textPreco1;
	private JTextField textQtd2;
	private JTextField textPreco2;
	private JTextField textQtd4;
	private JTextField textPreco4;
	private JTextField textQtd3;
	private JTextField textPreco3;
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
		
		textQtd1 = new JTextField();
		textQtd1.setBounds(151, 68, 109, 20);
		contentPane.add(textQtd1);
		textQtd1.setColumns(10);
		
		textPreco1 = new JTextField();
		textPreco1.setBounds(263, 68, 114, 20);
		contentPane.add(textPreco1);
		textPreco1.setColumns(10);
		
		textQtd2 = new JTextField();
		textQtd2.setColumns(10);
		textQtd2.setBounds(151, 90, 109, 20);
		contentPane.add(textQtd2);
		
		textPreco2 = new JTextField();
		textPreco2.setColumns(10);
		textPreco2.setBounds(263, 90, 114, 20);
		contentPane.add(textPreco2);
		
		textQtd4 = new JTextField();
		textQtd4.setColumns(10);
		textQtd4.setBounds(151, 139, 109, 20);
		contentPane.add(textQtd4);
		
		textPreco4 = new JTextField();
		textPreco4.setColumns(10);
		textPreco4.setBounds(263, 139, 114, 20);
		contentPane.add(textPreco4);
		
		textQtd3 = new JTextField();
		textQtd3.setColumns(10);
		textQtd3.setBounds(151, 115, 109, 20);
		contentPane.add(textQtd3);
		
		textPreco3 = new JTextField();
		textPreco3.setColumns(10);
		textPreco3.setBounds(263, 115, 114, 20);
		contentPane.add(textPreco3);
		
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
				
				textQtd1.setText(null);
				textPreco1.setText(null);
				textQtd2.setText(null);
				textPreco2.setText(null);
				textQtd4.setText(null);
				textPreco4.setText(null);
				textQtd3.setText(null);
				textPreco3.setText(null);
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
				
				int textQtde1 = Integer.parseInt(textQtd1.getText());
				int textQtde2 = Integer.parseInt(textQtd2.getText());
				int textQtde3 = Integer.parseInt(textQtd3.getText());
				int textQtde4 = Integer.parseInt(textQtd4.getText());
				
				double preco1 = Double.parseDouble(textPreco1.getText());
				double preco2 = Double.parseDouble(textPreco2.getText());
				double preco3 = Double.parseDouble(textPreco3.getText());
				double preco4 = Double.parseDouble(textPreco4.getText());
				
				
				double resultado =       (textQtde1 * preco1 ) +
						   				 (textQtde2 * preco2 ) +	
						   				 (textQtde3 * preco3 ) +
						   				 (textQtde4 * preco4);
				
				textTotal.setText(String.valueOf(resultado));
				
				//===================================
				
				
				
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCalcular.setBounds(171, 191, 89, 23);
		contentPane.add(btnCalcular);
	}
}
