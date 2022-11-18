package testing;

import java.util.Objects;

public class Problem_5 {
	@Override
	public boolean equals(Object o) {
		CheckpointStatistics that = (CheckpointStatistics) o;
		return  id == that.id &&
				savepoint == that.savepoint &&
				triggerTimestamp == that.triggerTimestamp &&
				lattestAckTimestamp == that.lattestAckTimestamp &&
				stateSize == that.stateSize &&
				duration == that.duration &&
				aligmentBuffered == that.aligmentBuffered &&
				processedData = that.processedData &&
				persistedData = that.persistedData &&
				numSubtasks = that.numSubtasks && 
				numAckSubtasks = that.numAckSubtasks &&
				status == that.status &&
				Objects.equals(checkpointType, that.checkpointType) &&
				Object.equals(
						checkpointStatisticsPerTask,
						that.checkpointStatisticsPerTask);
	//Podrías crear un objeto con todos estos atributos y utilizar un solo Object.equals
		
	}
}

//SOLUCIÓN
public class Problem_5 {
	@Override
	public boolean equals(Object o) {
		CheckpointStatistics that = (CheckpointStatistics) o;
		return  Object.equals(newCompoundObject, that);
		
	}
}