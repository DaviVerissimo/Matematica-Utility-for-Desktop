package view;

import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.CORBA.OMGVMCID;

import control.Sistema;

public class Principal extends Janela implements ActionListener{
	
	private Font fonteGeral = new Font("SansSerif", Font.BOLD, 20);
	private JButton botaoCalculoPotencia;
	private JButton botaoCalcularRaizNumero;
	private JButton botaoCalcularRaizEquacao;
	private JButton botaoCalcularPorcetagem;
	
	public Principal() {
		botaoCalculoPotencia = new JButton("Calcular Potencia");
		botaoCalcularRaizNumero = new JButton("Calcular Raiz de Numero");
		botaoCalcularRaizEquacao = new JButton("Calcular Raiz(es) de Equação");
		botaoCalcularPorcetagem = new JButton("Carcular Porcetagem");
		botaoCalculoPotencia.addActionListener(this);
		botaoCalcularRaizNumero.addActionListener(this);
		botaoCalcularRaizEquacao.addActionListener(this);
		botaoCalcularRaizEquacao.setBackground(Color.gray);
		botaoCalcularPorcetagem.addActionListener(this);
		this.getContentPane().add(botaoCalculoPotencia);
		this.getContentPane().add(botaoCalcularRaizNumero);
		this.getContentPane().add(botaoCalcularRaizEquacao);
		this.getContentPane().add(botaoCalcularPorcetagem);
		this.setLayout(new GridLayout(4,1,4,5));
		this.setTitle("Matemática Utility");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	public static void main(String[] args) {
		new Principal();
	}

	public Font getFonteGeral() {
		return fonteGeral;
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
		
		if (e.getSource() == botaoCalcularPorcetagem) {
			new JanelaCalculoPorcentagem(sistema);
		}
	}
}
