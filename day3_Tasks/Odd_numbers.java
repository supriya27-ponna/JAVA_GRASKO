package day3_Tasks;
//Write a Java program to print the odd numbers from 1 to 99. Prints one number per line

public class Odd_numbers {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

}
