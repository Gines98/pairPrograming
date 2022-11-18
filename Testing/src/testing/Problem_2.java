package testing;

public class Problem_2 {
	@Override
	public double[] computeMean() {
		//No funciona porque estas accediendo a la posicion dos cuando el size es de 1 posicion
		return points.size() == 1 ? points.get(1) : null;
	}
	
	//SOLUCION
	@Override
	public double[] computeMean() {
		return points.size() == 1 ? points.get(0) : null;
	}
}
