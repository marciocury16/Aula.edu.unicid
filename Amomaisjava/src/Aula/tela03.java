package Aula;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class tela03 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorVenda;
	private JTextField txtValorCompra;
	private JButton rbdDinheiro;
	private JButton rbdCheque;
	private JButton rbdCartao;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela03 frame = new tela03();
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
	public tela03() {
		setTitle("Pre\u00E7o Final");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel btnValorVenda = new JLabel("Entre com o valor da venda:");
		btnValorVenda.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnValorVenda.setBounds(21, 25, 206, 19);
		contentPane.add(btnValorVenda);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtValorVenda.setText(null);
				txtValorCompra.setText(null);
				buttonGroup.clearSelection();
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(232, 170, 89, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double valor = Double.parseDouble(txtValorVenda.getText());
				double resultado = 0;
				if(rbdDinheiro.isSelected()) {
					resultado = valor *0.95;					
				}
				if(rbdCheque.isSelected()) {
					resultado = valor * 1.05;
				}
				if(rbdCartao.isSelected()) {
					resultado = valor * 1.10;					
				}
				DecimalFormat df = new DecimalFormat("#0.00");
				txtValorCompra.setText(String.valueOf(df.format(resultado)));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(331, 170, 89, 46);
		contentPane.add(btnNewButton_1);
		
		JRadioButton rbdDinheiro = new JRadioButton("Dinheiro");
		buttonGroup.add(rbdDinheiro);
		rbdDinheiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbdDinheiro.setBounds(19, 66, 109, 23);
		contentPane.add(rbdDinheiro);
		
		JRadioButton rbdCheque = new JRadioButton("Cheque");
		buttonGroup.add(rbdCheque);
		rbdCheque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbdCheque.setBounds(142, 66, 109, 23);
		contentPane.add(rbdCheque);
		
		JRadioButton rbdCartao = new JRadioButton("Cart\u00E3o");
		buttonGroup.add(rbdCartao);
		rbdCartao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbdCartao.setBounds(279, 66, 109, 23);
		contentPane.add(rbdCartao);
		
		JLabel btnValorCompra = new JLabel("Valor da compra:");
		btnValorCompra.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnValorCompra.setBounds(21, 107, 206, 19);
		contentPane.add(btnValorCompra);
		
		txtValorVenda = new JTextField();
		txtValorVenda.setBounds(267, 26, 153, 20);
		contentPane.add(txtValorVenda);
		txtValorVenda.setColumns(10);
		
		txtValorCompra = new JTextField();
		txtValorCompra.setBounds(267, 108, 153, 20);
		contentPane.add(txtValorCompra);
		txtValorCompra.setColumns(10);
		
		
	}
}
