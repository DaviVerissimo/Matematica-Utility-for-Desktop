package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.Sistema;

public class JanelaPorcentagemEquivalente extends Janela implements ActionListener{
	private final JLabel lb_numero;
	private JTextField numeroEntrada;
	private final JLabel lb_valor;
	private JTextField entradaValor;
	private JButton BotaoVerificaPorcetagemEquivalente;
	private Sistema sistema;
	
	public JanelaPorcentagemEquivalente(Sistema sistema) {
		this.sistema = sistema; 
		getContentPane().setLayout(new GridLayout(5,1,4,5));
		lb_numero = new JLabel("numero: ");
		numeroEntrada = new JTextField();
		lb_valor = new JLabel("Quanto equivale este valor em porcentagem:");
		entradaValor = new JTextField();
		BotaoVerificaPorcetagemEquivalente = new JButton("Verificar Porcentagem (%) equivalente");
		this.getContentPane().add(lb_numero);
		this.getContentPane().add(numeroEntrada);
		this.getContentPane().add(lb_valor);
		this.getContentPane().add(entradaValor);
		BotaoVerificaPorcetagemEquivalente.addActionListener(this);
		this.getContentPane().add(BotaoVerificaPorcetagemEquivalente);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float numero = Float.parseFloat(numeroEntrada.getText());
		float valor = Float.parseFloat(entradaValor.getText());
		float resultado = sistema.calcularQuantosPorcentoDoNumero(numero, valor);
		JOptionPane.showMessageDialog(this, valor + " equivale há " + resultado + "% de " + numero);
	}

}
