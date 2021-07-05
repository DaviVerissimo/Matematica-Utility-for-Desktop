package view;

import control.Sistema;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaCalculoPorcentagem extends Janela implements ActionListener{
	/**
	 * @wbp.nonvisual location=39,75
	 */
	private final JLabel lb_numero;
	private JTextField numeroEntrada;
	private final JLabel lb_porcetagem;
	private JTextField entradaPorcentagem;
	private JButton BotaoCalcularPorcetagem;
	private Sistema sistema;
	
	public JanelaCalculoPorcentagem (Sistema sistema) {
		this.sistema = sistema; 
		getContentPane().setLayout(new GridLayout(5,1,4,5));
		lb_numero = new JLabel("numero: ");
		numeroEntrada = new JTextField();
		lb_porcetagem = new JLabel("Porcentagem");
		entradaPorcentagem = new JTextField();
		BotaoCalcularPorcetagem = new JButton("Calcular Porcentagem (%)");
		this.getContentPane().add(lb_numero);
		this.getContentPane().add(numeroEntrada);
		this.getContentPane().add(lb_porcetagem);
		this.getContentPane().add(entradaPorcentagem);
		BotaoCalcularPorcetagem.addActionListener(this);
		this.getContentPane().add(BotaoCalcularPorcetagem);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float numero = Float.parseFloat(numeroEntrada.getText().toString());
		float porcento = Float.parseFloat(entradaPorcentagem.getText().toString());
		float porcentagem  = sistema.calcularPorcentagem(numero, porcento);
		JOptionPane.showMessageDialog(this, porcento + "% de " + numero + " = " + porcentagem + ".");
	}

}
