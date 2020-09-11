package view;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.CORBA.OMGVMCID;

import control.Sistema;

public class JanelaPrincipal extends Janela implements ActionListener{
	
	private JButton botaoCalculoPotencia;
	private JButton botaoCalcularRaizNumero;
	private JButton botaoCalcularRaizEquacao;
	
	public JanelaPrincipal() {
		botaoCalculoPotencia = new JButton("Calcular Potencia");
		botaoCalcularRaizNumero = new JButton("Calcular Raiz de Numero");
		botaoCalcularRaizEquacao = new JButton("Calcular Raiz(es) de Equação");
		botaoCalculoPotencia.addActionListener(this);
		botaoCalcularRaizNumero.addActionListener(this);
		botaoCalcularRaizEquacao.addActionListener(this);
		this.getContentPane().add(botaoCalculoPotencia);
		this.getContentPane().add(botaoCalcularRaizNumero);
		this.getContentPane().add(botaoCalcularRaizEquacao);
		this.setLayout(new GridLayout(3,1,4,5));
		this.setTitle("Matemática Utility");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static void main(String[] args) {
		new JanelaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Sistema sistema = new Sistema();
		if (e.getSource() == botaoCalculoPotencia) {
			new JanelaCalculoPotencia(sistema);
		}
		if (e.getSource() == botaoCalcularRaizNumero) {
			new JanelaCalculoRaiz(sistema);
		}
		if (e.getSource() == botaoCalcularRaizEquacao) {}
	}
}
