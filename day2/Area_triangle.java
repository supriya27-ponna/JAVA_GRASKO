package day2;

import java.util.Scanner;

public class Area_triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		
		Double b=sc.nextDouble();
		Double h=sc.nextDouble();
		Double area=0.5*b*h;
		System.out.println("area of the triangle is "+ area);	
	}

}
