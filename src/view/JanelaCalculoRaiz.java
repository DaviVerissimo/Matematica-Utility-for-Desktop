package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Sistema;

public class JanelaCalculoRaiz extends Janela implements ActionListener{
	private JButton calcular;
	private float base;
	private float expoente;
	private JTextField jt_base;
	private JTextField jt_expoente;
	private JPanel painel2;
	private Sistema sistema;
	private float raiz;
	
	public JanelaCalculoRaiz(Sistema sistema) {
		this.sistema = sistema;
		getContentPane().setLayout(new GridLayout(1,1,4,5));
		this.setTitle("Calculo de Raiz");
		JLabel lb_base = new JLabel("Raiz: ");
		lb_base.setBounds(100, 65, 71, 40);
		jt_base = new JTextField();
		jt_base.setBounds(160, 72, 20, 20);
		JLabel lb_expoente = new JLabel("Expoente: ");
		JLabel lb_raiz = new JLabel("√");
		lb_raiz.setBounds(170, 80, 75, 40);
		lb_raiz.setFont(new Font("font",Font.PLAIN,40));
		lb_expoente.setBounds(100, 100, 75, 20);
		jt_expoente = new JTextField();
		jt_expoente.setFont(new Font("font",Font.PLAIN,28));
		jt_expoente.setBounds(195, 90, 100, 30);
		calcular = new JButton("Calcular");
		calcular.setBounds(100, 170, 100, 30);
		calcular.addActionListener(this);
		JPanel painel1 = new JPanel();
		painel1.setLayout(null);
		painel1.add(lb_base);
		painel1.add(jt_base);
		painel1.add(lb_raiz);
		painel1.add(lb_expoente);
		painel1.add(jt_expoente);
		painel1.add(calcular);
		this.getContentPane().add(painel1);
		//painel2 = new JPanel();
		//this.getContentPane().add(painel2);
		this.repaint();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.base = Float.parseFloat(jt_base.getText());
		this.expoente = Float.parseFloat(jt_expoente.getText());
		this.raiz = sistema.calcularRaiz(expoente, base);
		JOptionPane.showMessageDialog(this, "O resultado de " + expoente +
				" na raiz " +  (int)base + "√  é " + raiz + ".");
	}

}
