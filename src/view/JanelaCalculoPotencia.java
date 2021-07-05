package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Sistema;

public class JanelaCalculoPotencia extends Janela implements ActionListener{
	private JButton calcular;
	private float base;
	private float expoente;
	private JTextField jt_base;
	private JTextField jt_expoente;
	private JPanel painel2;
	private Sistema sistema;
	private long potencia;
	
	public JanelaCalculoPotencia(Sistema sistema) {
		this.sistema = sistema;
		getContentPane().setLayout(new GridLayout(1,1,4,5));
		this.setTitle("Calculo de Potencia");
		JLabel lb_base = new JLabel("Base: ");
		lb_base.setBounds(100, 50, 70, 40);
		jt_base = new JTextField();
		jt_base.setBounds(200, 60, 20, 20);
		JLabel lb_expoente = new JLabel("Expoente: ");
		lb_expoente.setBounds(100, 100, 75, 20);
		jt_expoente = new JTextField();
		jt_expoente.setFont(new Font("font",Font.PLAIN,28));
		jt_expoente.setBounds(180, 90, 100, 30);
		calcular = new JButton("Calcular");
		calcular.setBounds(100, 170, 100, 30);
		calcular.addActionListener(this);
		JPanel painel1 = new JPanel();
		painel1.setLayout(null);
		painel1.add(lb_base);
		painel1.add(jt_base);
		painel1.add(lb_expoente);
		painel1.add(jt_expoente);
		painel1.add(calcular);
		this.getContentPane().add(painel1);
		//painel2 = new JPanel();
		//this.getContentPane().add(painel2);
		//this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.base = Float.parseFloat(jt_base.getText());
		this.expoente = Float.parseFloat(jt_expoente.getText());
		this.potencia = sistema.calcularPotencia(expoente, base);
		JOptionPane.showMessageDialog(this, "O resultado de " + expoente +
				" elevado a " +  (int)base + "ª potencia é " + potencia + ".");
		//this.exibirResultado();
	} 
	
	private void exibirResultado() {
		JLabel jl_resultado = new JLabel("Resultado");
		jl_resultado.setFont(new Font("font",Font.PLAIN,30));
		this.painel2.add(jl_resultado);
		this.getContentPane().remove(painel2);
		this.getContentPane().add(painel2);
		painel2.repaint();
		this.getContentPane().repaint();
		JLabel jl_operacao = new JLabel("");
	}
	
}
