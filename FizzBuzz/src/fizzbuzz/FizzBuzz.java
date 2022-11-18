package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println("Insert a number: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		int num = keyboard.nextInt();
		
		if(num%3 == 0 && num%5 == 0) {
			System.out.println("FizzBuzz");
		}else if(num%5 == 0) {
			System.out.println("Buzz");
		}else if(num%3 == 0) {
			System.out.println("Fizz");
		}else {
			System.out.println(num);
		}
		
	}
}
