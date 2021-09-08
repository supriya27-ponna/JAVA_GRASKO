package day3_Tasks;
//Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative
import java.util.Scanner;
public class Three_Integers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int first = sc.nextInt();
		System.out.println("enter the second number:");
		int second = sc.nextInt();
		System.out.println("enter the third number:");
		int third = sc.nextInt();
		System.out.println("The result is:"+last_digit(first,second,third,true));

	}
	public static boolean last_digit(int k, int l, int m, boolean firstsecondthird)
    {
	     return (k % 10 == l % 10) || (k % 10 == m % 10) || (l % 10 == m % 10);
    }

}
