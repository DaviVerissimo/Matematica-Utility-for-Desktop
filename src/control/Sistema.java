package control;

import model.Calculadora;
import model.Formulas;
import model.NaoExistemRaizesReaisException;

public class Sistema implements Facada{

	@Override
	public long calcularRaiz(float numero, float baseRaiz) {
		
		return new Calculadora().calcularRaiz(numero, baseRaiz);
	}

	@Override
	public long calcularPotencia(float numero, float basePotencia) {
		
		return new Calculadora().calcularPotentia(numero, basePotencia);
	}

	@Override
	public double[] calcularRaizEquacao(float a, float b, float c) {
		Formulas formulas = new Formulas();
		if (validarRaizes(a, b, c) ){
			try {
				return formulas.calcularRaizEquacao2GrauComBaskara(a, b, c);
			} catch (NaoExistemRaizesReaisException e) {
				
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public boolean validarRaizes(float a, float b, float c) {
		Formulas formulas = new Formulas();
		try {
			formulas.calcularRaizEquacao2GrauComBaskara(a, b, c);
		} catch (NaoExistemRaizesReaisException e) {
			return false;
		}
		
		return true;
	}

	@Override
	public float calcularPorcentagem(float numero, float porcento) {
		
		return new Calculadora().calcularPorcentagem(numero, porcento);
	}

	@Override
	public float calcularQuantosPorcentoDoNumero(float numero, float valor) {
		
		return new Calculadora().calcularParcelaCorrespodenteEmPorcetagem(numero, valor);
	}

}
