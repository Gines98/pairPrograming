package testing;

public class Problem_1 {
	private boolean checkDimensions(CLIQUEUnit other, int e) {
		for(int i = 0, j = 0; i < e; i++, j+=2) {
			if(dims[i] != other.dims[i]
					|| bounds[j] != other.bounds[j]
							|| bounds[j + 1] != bounds[j + 1]) { //Esto no funciona porque estas accediendo a ambos lados 
				//del operador al mismo elemento y comprobando que sean distintos cuando se trata del mismo
				
				return false;
			}
		}
		
		return true;
	}
	
	//SOLUCION
	private boolean checkDimensions(CLIQUEUnit other, int e) {
		for(int i = 0, j = 0; i < e; i++, j+=2) {
			if(dims[i] != other.dims[i]
					|| bounds[j] != other.bounds[j]
							|| bounds[j + 1] != other.bounds[j + 1]) { /
				
				return false;
			}
		}
		
		return true;
	}
}
