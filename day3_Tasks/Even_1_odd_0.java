package day3_Tasks;
//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class Even_1_odd_0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%2==0) 
			System.out.println("Even number" +1);
		else
			System.out.println("Odd number" +0);

		
	}

}
