package day3_Tasks;
//Write a Java program to reverse a string

import java.util.Scanner;
public class string_reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String k = sc.next();
		String rev = "";
		
		int len = k.length();
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+k.charAt(i);
		}
		
		System.out.println("Original String is:"+k);
		System.out.println("Reversed String is:"+rev);

	}

}
