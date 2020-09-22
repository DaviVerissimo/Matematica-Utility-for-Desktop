package model;

public class Calculadora {
	
	public long calcularRaiz(float numero, float baseRaiz) {
		long raiz = (long) Math.pow(numero, 1 / baseRaiz);
		return raiz;
	}
	
	public long calcularPotentia(double numero, double basePotencia) {
		Double potenciacao = Math.pow(numero, basePotencia);
		long potencia = potenciacao.longValue();
		return potencia;
	}
	
}
