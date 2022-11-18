package testing;

import java.util.Objects;

public class Extra {
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
				processedData == processedData && //Deberia de comparar processData con that.processData
				persistedData == that.persistedData &&
				numSubtasks == that.numSubtasks && 
				numAckSubtasks == that.numAckSubtasks &&
				status == that.status &&
				Objects.equals(checkpointType, that.checkpointType) &&
				Object.equals(
						checkpointStatisticsPerTask,
						that.checkpointStatisticsPerTask);
	}
	
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
				processedData == that.processedData && //Deberia de comparar processData con that.processData
				persistedData == that.persistedData &&
				numSubtasks == that.numSubtasks && 
				numAckSubtasks == that.numAckSubtasks &&
				status == that.status &&
				Objects.equals(checkpointType, that.checkpointType) &&
				Object.equals(
						checkpointStatisticsPerTask,
						that.checkpointStatisticsPerTask);
	}
}
