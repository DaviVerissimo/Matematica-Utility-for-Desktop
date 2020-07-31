package model;

import java.util.Scanner;

public class Calculadora {
	
	public float calcularRaiz(float numero, float baseRaiz) {
		float raiz = (float) Math.pow(numero, 1 / baseRaiz);
		return raiz;
	}
	
	public float calcularPotentia(float numero, float basePotencia) {
		float potencia = (float) Math.pow(numero, basePotencia);
		return potencia;
	}

}
