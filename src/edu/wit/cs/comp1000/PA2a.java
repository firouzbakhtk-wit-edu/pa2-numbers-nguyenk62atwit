package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner scanner = new Scanner(System.in);
		
		int sumPostive = 0, sumNonPostive = 0, sumAll = 0;
		int countPostive = 0, countNonPostive = 0;
		
		System.out.printf("Enter five whole numbers: ");
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			sumAll = sumAll + num;
			
			if (num > 0) {
				sumPostive = sumPostive + num;
				countPostive = countPostive + 1;
			} else {
				sumNonPostive = sumNonPostive + num;
				countNonPostive = countNonPostive + 1;
			}
			
		}
		
		double averagePostive = countPostive > 0 ? (double) sumPostive / countPostive: 0; //asked tutor, taught me about (double), still kinda confused about it even after doing more research but I couldn't find another way for it to work
		double averageNonPostive = countNonPostive > 0 ? (double) sumNonPostive / countNonPostive: 0;
		double averageAll = (double) sumAll / 5;
		
		System.out.printf("The sum of the %d positive numbers: %d%n", countPostive, sumPostive);
		System.out.printf("The sum of the %d non-postive numbers: %d%n", countNonPostive, sumNonPostive);
		System.out.printf("The sum of the 5 numbers: %d%n ", sumAll);
		
		System.out.printf("The average of the %d postive numbers: %.2f%n", countPostive, averagePostive);
		System.out.printf("The average of the %d non-postive numbers: %.2f%n", countNonPostive, averageNonPostive);
		System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
	}

}
