package numerals;

import java.util.Scanner;

public class Numerals {

	public static String convertToRomanNumerals(int num) {
		int i;
		int thousands;
		int hundreds;
		int tens;
		int units;

		String s = "";

		thousands = num / 1000;
		hundreds = num / 100 % 10;
		tens = num / 10 % 10;
		units = num % 10;

		for (i = 1; i <= thousands; i++) {
			s = s + "M";
		}

		if (hundreds == 9) {
			s = s + "CM";
		} else if (hundreds >= 5) {
			s = s + "D";
			for (i = 6; i <= hundreds; i++) {
				s = s + "C";
			}
		} else if (hundreds == 4) {
			s = s + "CD";
		} else {
			for (i = 1; i <= hundreds; i++) {
				s = s + "C";
			}
		}

		if (tens == 9) {
			s = s + "XC";
		} else if (tens >= 5) {
			s = s + "L";
			for (i = 6; i <= tens; i++) {
				s = s + "X";
			}
		} else if (tens == 4) {
			s = s + "XL";
		} else {
			for (i = 1; i <= tens; i++) {
				s = s + "X";
			}
		}

		if (units == 9) {
			s = s + "IX";
		} else if (units >= 5) {
			s = s + "V";
			for (i = 6; i <= units; i++) {
				s = s + "I";
			}
		} else if (units == 4) {
			s = s + "IV";
		} else {
			for (i = 1; i <= units; i++) {
				s = s + "I";
			}
		}
		return s;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int num;

		do {
			System.out.print("Insert a number between 1 & 3999: ");
			num = input.nextInt();
		} while (num < 1 || num > 3999);

		System.out.println(num + " in Roman numeral: " + convertToRomanNumerals(num));
	}

}
