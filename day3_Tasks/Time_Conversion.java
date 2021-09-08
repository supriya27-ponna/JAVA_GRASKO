package day3_Tasks;
//Write a Java program to convert seconds to hour, minute and seconds.
import java.util.Scanner;

public class Time_Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Input seconds:");
		int input = sc.nextInt();
		int hr = (input%86400)/3600;
		int min = (input%86400)%3600/60;
		int sec = (input%86400)%3600%60;
		
	
		
		System.out.println(hr+" : "+min+" : "+sec);

		
	}

}
