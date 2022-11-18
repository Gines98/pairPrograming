package testing;

public class Problem_6 {
	private static byte char64(char x) {
		if((int) x < 0 || (int) x > index_64.length) { //Tiene que ser mayor o igual en el index_64
			//porque si está por encima del rango tienes que poner >= o también > index_64 -1
			return -1;
		}
		return index_64[(int) x];
	}
	
	//SOLUCION
	private static byte char64(char x) {
		if((int) x < 0 || (int) x > index_64.length - 1) {
			return -1;
		}
		return index_64[(int) x];
	}
}
