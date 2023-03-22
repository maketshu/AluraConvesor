package DesafioAluraMoedas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;

public class Visual {
	private JFrame frmConversorDeMoedas;
	private JTextField tfQuantidade;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visual window = new Visual();
					window.frmConversorDeMoedas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Visual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeMoedas = new JFrame();
		frmConversorDeMoedas.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 16));
		frmConversorDeMoedas.setTitle("Conversor de Moedas");
		frmConversorDeMoedas.setBounds(100, 100, 450, 300);
		frmConversorDeMoedas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeMoedas.getContentPane().setLayout(null);
		
		JLabel lbMoedas = new JLabel("Moedas:");
		lbMoedas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbMoedas.setBounds(27, 27, 82, 14);
		frmConversorDeMoedas.getContentPane().add(lbMoedas);
		
		JLabel lbPara = new JLabel("Para:");
		lbPara.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbPara.setBounds(50, 85, 59, 14);
		frmConversorDeMoedas.getContentPane().add(lbPara);
		
		JButton btnConversao = new JButton("Conversão");
		
		JLabel lbQuantidade = new JLabel("Quantidade:");
		lbQuantidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbQuantidade.setBounds(27, 127, 108, 14);
		frmConversorDeMoedas.getContentPane().add(lbQuantidade);
		
		JComboBox comboBoxM = new JComboBox(Moeda.MoedaAmostra);
		comboBoxM.setBounds(105, 25, 153, 22);
		comboBoxM.setRenderer(new ListCellRenderer());
		frmConversorDeMoedas.getContentPane().add(comboBoxM);
		
		JComboBox ComboBox_P1 = new JComboBox(Moeda.MoedaAmostra);
		ComboBox_P1.setBounds(105, 83, 153, 22);
		ComboBox_P1.setRenderer(new ListCellRenderer());
		frmConversorDeMoedas.getContentPane().add(ComboBox_P1);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(133, 126, 86, 20);
		frmConversorDeMoedas.getContentPane().add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(179, 227, 89, 23);
		frmConversorDeMoedas.getContentPane().add(btnNewButton);
		
		btnConversao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double quantidade = Double.parseDouble(tfQuantidade.getText());
				Moeda origem = (Moeda)comboBoxM.getSelectedItem();
				Moeda destino = (Moeda)ComboBox_P1.getSelectedItem();
				double conversor = ConversorDeMoedas.ConversorDeMoedas(quantidade, origem, destino);
				String ValorAmostra = ConversorDeMoedas.ConversorDeMoedas(conversor, destino.getNome());
				tfResultado.setText(ValorAmostra);
			}
		});
		btnConversao.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnConversao.setBounds(301, 125, 123, 23);
		frmConversorDeMoedas.getContentPane().add(btnConversao);
		
		JLabel lbResultado = new JLabel("Resultado:");
		lbResultado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbResultado.setBounds(218, 58, 108, 14);
		frmConversorDeMoedas.getContentPane().add(lbResultado);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(317, 55, 86, 20);
		frmConversorDeMoedas.getContentPane().add(tfResultado);
		tfResultado.setColumns(10);
		
		
	
	}
}
