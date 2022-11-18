package rock_paper_scissors;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class RockPaperScissors {

	public static int insertOption() {
    	Scanner keyboard = new Scanner(System.in); 
			System.out.println("Choose your option: \n"
			 		+ "0: Rock \n"
			 		+ "1: Paper \n"
			 		+ "2: Scissors \n");
			 
			 int option = keyboard.nextInt();
			 
			 return option;
		
    }

	public static void main(String[] args) {

		int randomNum = ThreadLocalRandom.current().nextInt(0, 3);

		int option = insertOption();

		while (option < 0 || option > 2) {
			System.out.println("Select a number between 0 & 2 \n");
			option = insertOption();
		}

		if (option == randomNum) {
			System.out.println("Draw");
		}

		if (option == 0 && randomNum == 1) {
			System.out.println("AI chooses paper");
			System.out.println("AI wins (paper beats rock)");
		}

		if (option == 0 && randomNum == 2) {
			System.out.println("AI chooses scissors");
			System.out.println("You win (rock beats scissors)");
		}

		if (option == 1 && randomNum == 0) {
			System.out.println("AI chooses rock");
			System.out.println("You win (paper beats rock)");
		}

		if (option == 1 && randomNum == 2) {
			System.out.println("AI chooses rock");
			System.out.println("AI wins (rock beats scissors)");
		}

		if (option == 2 && randomNum == 0) {
			System.out.println("AI chooses rock");
			System.out.println("AI wins (rock beats scissors)");
		}

		if (option == 2 && randomNum == 1) {
			System.out.println("AI chooses paper");
			System.out.println("You win (scissors beats paper)");
		}

	}
}