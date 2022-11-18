package testing;

public class Problem_7 {
	@Override
	public void putToCache(PutRecordsRequest putRecordsRequest) { //Debería de lanzar la ejecución a la que va a hacerle el catch
		if(dataTmpFile == null || !dataTmpFile.exists()) { //Si llamas a createNewFile con el operador || o con
			// dataTmpFile == null te va a saltar un NullPointerException porque estas creando un fichero
			//a partir de algo nulo
			try {
				dataTmpFile.createNewFile();
			}catch (IOException e){
				LOGGER.error("Failed to create cache tmp file, return.", e);
				return;
			}
		}
	}
	
	@Override
	public void putToCache(PutRecordsRequest putRecordsRequest) { 
		if(dataTmpFile != null && !dataTmpFile.exists()) {
			try {
				dataTmpFile.createNewFile();
			}catch (IOException e){
				LOGGER.error("Failed to create cache tmp file, return.", e);
				return;
			}
		}
	}
}
