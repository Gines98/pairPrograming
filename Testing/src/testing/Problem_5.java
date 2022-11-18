package testing;

import java.util.Arrays;

public class Problem_5 {
	public static final ByteSequence prefiexEndOf(ByteSequence prefix) {
		byte[] endKey = prefix.getBytes().clone();
		for(int i = endKey.length -1; i >= 0; i--) {
			if(endKey[i] < Oxff) { // La condición siempre va a ser True porque el ese número en decimal es
				//255 y el rango de la variable byte de java es de ese tamaño
				endKey[i] = (byte) (endKey[i] + 1);
				return ByteSequence.from(Arrays.copyOf(endKey, i + 1));
			}
		}
		
		return ByteSequence.from(NO_PREFIX_END);
	}
	
	public static final ByteSequence prefiexEndOf(ByteSequence prefix) {
		byte[] endKey = prefix.getBytes().clone();
		for(int i = endKey.length -1; i >= 0; i--) {
			if(endKey[i] > -128 && endKey[i] < 127) { 
				endKey[i] = (byte) (endKey[i] + 1);
				return ByteSequence.from(Arrays.copyOf(endKey, i + 1));
			}
		}
		
		return ByteSequence.from(NO_PREFIX_END);
	}
}
