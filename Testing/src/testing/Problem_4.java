package testing;

public class Problem_4 {

	public String getStrippedSubstring() {
		int sstart = start, ssend = end;
		while(sstart < ssend) {
			char c = input.charAt(sstart);
			if(c != ' ' || c != '\n' || c != '\r' || c != '\t') { //Siempre se mete en el if; las condicones se solapan por completo
				break;
			}
			++sstart;
		}
		....
	}
	
}

//SOLUCIÓN
public class Problem_4 {

	public String getStrippedSubstring() {
		int sstart = start, ssend = end;
		while(sstart < ssend) {
			char c = input.charAt(sstart);
			if(c == ' ' || c == '\n' || c == '\r' || c == '\t') { //Siempre se mete en el if; las condicones se solapan por completo
				break;
			}
			++sstart;
		}
		....
	}
	
}