package day1;

//	Write a Java program to find the factorial of a number.
//	Java Program to read number (entered by user)
//	Java Program to check if a number is positive or negative
//	Java Program to add two numbers
//	Java Program to Find ASCII value of a Character
//	Java Program to Multiply two Numbers
//	Java Program to Calculate Area of Triangle
import java.util.*;
public class MyFirst {
		public static void main(String args[]) {
			System.out.println("Welcome to Grasko Solutions");
			int a,b,sum,sub,mul,div;
			float l= (float)2.09, k=12,area;
			a=10;
			b=-2;
			System.out.println("sum=" + (a+b)  + "sub=" + (a-b) + "mul=" + (a*b) + "div=" + (a/b));
			
//			Adding two numbers
			
			int var1 = 9,var2 = 12;
			System.out.println("The additon of var1 and var 2 is" +(var1+var2));
			
//			Multiplying  two numbers
			
			System.out.println("The multiplication of var1 and var 2 is" +(var1*var2));

//			positive number & negative number
			
			if(a>0 & b>0) {
				System.out.println("positive number");
			}
			else {
				System.out.println("Negative Number");
			}
			
			
//			area of triangle
			
			area = (l*k)/2;
			System.out.println("Area of a Triangle" + area);
			
//		factorial of a given number 
//      Taking input from the user as integer 
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number:");
			int i,fact=1;
			int num = sc.nextInt();
			if(num==1 | num==0) {
				System.out.println("1");
			}
			else if(num<0) {
				System.out.println("enter valid number");
			}
			else {
			for(i=1;i<=num;i++) {
				fact = fact*i;
			}
			System.out.println("factorial of a given num is:"+fact);
			}
//			Find ASCII values of a character
			char pk = 'a';
			int ascii = pk;
			System.out.print("ASCII value of 'a' is:" + ascii);
			
			
		}
}
