package control;

import model.Calculadora;
import model.Formulas;
import model.NaoExistemRaizesReaisException;

public class Sistema implements Facada{

	@Override
	public float calcularRaiz(float numero, float baseRaiz) {
		
		return new Calculadora().calcularRaiz(numero, baseRaiz);
	}

	@Override
	public float calcularPotencia(float numero, float basePotencia) {
		
		return new Calculadora().calcularPotentia(numero, basePotencia);
	}

	@Override
	public float[] calcularRaizEquacao(float a, float b, float c) {
		Formulas formulas = new Formulas();
		if (validarRaizes(a, b, c) ){
			try {
				return formulas.calcularRaizEqaucao2GrauComBaskara(a, b, c);
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
			formulas.calcularRaizEqaucao2GrauComBaskara(a, b, c);
		} catch (NaoExistemRaizesReaisException e) {
			return false;
		}
		
		return true;
	}

}
