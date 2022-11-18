package testing;

public class Problem_3 {
	protected PreDeConModel computeLocalModel(DoubleDBIDList neighbors, ....){
		final int referenceSetSize = neighbors.size();
		....
		//Shouldn't happen
		if(referenceSetSize < 0) { //Debería ser menor o igual que cero porque sino-
			LOG.warning("Empty reference set -"
					+ "should at least include the query point!");
			return new PreDeConModel(Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
		}
		....
		for (int d = 0; d < dim; d++) {
			s[d] /= referenceSetSize;// -aquí habría una división entre 0
			mvVar.put(s[d]);
		}
	}
}


//SOLUCIÓN
public class Problem_3 {
	protected PreDeConModel computeLocalModel(DoubleDBIDList neighbors, ....){
		final int referenceSetSize = neighbors.size();
		....
		//Shouldn't happen
		if(referenceSetSize <= 0) { 
			LOG.warning("Empty reference set -"
					+ "should at least include the query point!");
			return new PreDeConModel(Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
		}
		....
		for (int d = 0; d < dim; d++) {
			s[d] /= referenceSetSize;
			mvVar.put(s[d]);
		}
	}
}