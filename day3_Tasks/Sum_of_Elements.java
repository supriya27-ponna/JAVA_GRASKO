package day3_Tasks;
import java.util.Scanner;

//			Write a Java program and compute the sum of the digits of an integer.

public class Sum_of_Elements {

	public static void main(String[] args) {
		int num,digit,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num =sc.nextInt();

		while(num>0) {
			digit = num%10;
			sum = sum+digit;
			num = num/10;
			}
		System.out.println("Sum of digits of a number is"+" " +sum);

		}
		

}
