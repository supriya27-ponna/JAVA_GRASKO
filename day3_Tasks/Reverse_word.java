package day3_Tasks;
//Write a Java program to reverse a word.
import java.util.Scanner;
public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Original string : ");
	 
	        String OStr = sc.nextLine();
	        sc.close();
	 
	        String words[] = OStr.split(" ");
	        String reversedString = "";
	 
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	            String reverseWord = "";
	            for (int j = word.length() - 1; j >= 0; j--) {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	            reversedString = reversedString + reverseWord + " ";
	        }
	 
	        
	        System.out.print("Reversed string : " + reversedString);
	}

}
