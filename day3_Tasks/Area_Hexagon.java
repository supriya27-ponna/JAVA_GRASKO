package day3_Tasks;
//Write a Java program to compute the area of a hexagon.

import java.util.Scanner;
public class Area_Hexagon {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input the length of a side of the hexagon: ");
	        double s = input.nextDouble();
	        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
	    }
	    public static double hexagonArea(double s) {
	        return (6*(s*s))/(4*Math.tan(Math.PI/6));
	    }
	

	}


