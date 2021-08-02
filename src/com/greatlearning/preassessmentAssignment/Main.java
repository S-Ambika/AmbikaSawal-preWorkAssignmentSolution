package com.greatlearning.preassessmentAssignment;

import java.util.Scanner;

public class Main {
	int userInput;
	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		int reverse, sum = 0, temp;
		System.out.println("Enter the number to check whether it is palindrome or not");

		userInput = sc.nextInt();
		temp = userInput;
		while (userInput > 0) {
			reverse = userInput % 10;
			sum = (sum * 10) + reverse;
			userInput = userInput / 10;
		}
		if (temp == sum)
			System.out.println("This is a palindrome number " + "\n"); // add extra line to show options in clear manner
		else
			System.out.println("This is not a palindrome number" + "\n");

	}

	// function to printPattern

	public void printPattern() {

		System.out.println("Enter the number to print pattern");
		userInput = sc.nextInt();
		if (userInput > 0) {
			for (int i = userInput; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("Please enter valid number" + "\n");

		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("Enter the number to check whether it is prime or not");
		userInput = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= userInput / 2; ++i) {
			if (userInput % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println("This is a prime number." + "\n");
		else
			System.out.println("This is not a prime number." + "\n");

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.
		System.out.println("Enter the number to print Fibonacci Series");
		userInput = sc.nextInt();
		int first = 0, second = 1;
		int check;
		if (userInput > 0) {

			System.out.print(first + " " + second);

			for (int i = 2; i < userInput; ++i) {
				check = first + second;
				System.out.print(" " + check);
				first = second;
				second = check;
			}
			System.out.println();
		} else {
			System.out.println("Please enter valid number" +"\n");

		}
	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
