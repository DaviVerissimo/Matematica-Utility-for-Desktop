package model;

public class Formulas {
	
	public float calcularDelta(float a, float b, float c) {
		float delta = new Calculadora().calcularPotentia(b, 2)-(4 * a * c);
		return delta;
	}
	
	
	public float[] calcularRaizEqaucao2GrauComBaskara (float a, float b, float c) 
			throws NaoExistemRaizesReaisException {
		float[] raizes = new float[2];
		float delta = this.calcularDelta(a, b, c);
		float raiz1 = (float) ((-1 * b + (Math.sqrt(delta)))) / 2 * a;
		float raiz2 = (float) ((-1 * b - (Math.sqrt(delta)))) / 2 * a;
		if (delta == 0) {
			raizes[0] = raiz1;
		}
		if (delta >  0) {
			raizes[0] = raiz1;
			raizes[1] = raiz2;
		}
		if (delta <  0) {
			throw new NaoExistemRaizesReaisException();
		}
		return raizes;
	}

}
