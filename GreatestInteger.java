/*
 * Problem 3.8 Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
 */

import java.util.Scanner;

public class GreatestInteger {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 3 integers sepserated by a space");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();

		if (num3 < num1 && num3 < num2 && num3 < num2) {
			System.out.println("Increasing order: " + num3 + " " + num2 + " " + num1);
		} 
		else if (num1 < num3 && num2 < num3 && num1 < num2) {
			System.out.println("Increasing order: " + num1 + " " + num2 + " " + num3);
		}
		else if (num2 < num3 && num2 < num1 && num1 < num3) {
			System.out.println("Increasing order: " + num2 + " " + num1 + " " + num3);
		}
		else if (num1 < num3 && num3 < num2 && num1 < num2) {
			System.out.println("Increasing order: " + num1 + " " + num3 + " " + num2);
		}
		else if (num2 < num3 && num2 < num1 && num3 < num1) {
			System.out.println("Increasing order: " + num2 + " " + num3 + " " + num1);
		}
		else {
			System.out.println("Increasing order: " + num3 + " " + num1 + " " + num2);
		}
	}
}
