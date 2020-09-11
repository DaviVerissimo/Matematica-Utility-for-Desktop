package view;

import java.awt.Color;

import javax.swing.JFrame;

public class Janela extends JFrame{
	
	public Janela() {
		setVisible(true);
		setSize(300, 500);
		getContentPane().setBackground(Color.GRAY.darker());
	}

}
