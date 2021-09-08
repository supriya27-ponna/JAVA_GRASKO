package day4;
import java.util.*;
//	Write a program to create an arraylist of colours.
//	Update a specific element in the arraylist
//	Write a java program to reverse elements in the arraylist
//	Write a Java program to shuffle the arraylist
//	Write a Java Program to check if an arraylist is empty or not
public class ArrayList_concept {

	public static void main(String[] args) {
		
//		Write a program to create an arraylist of colours.
		
		ArrayList <String> li = new ArrayList<String>();
		li.add("purple");
		li.add("orange");
		li.add("pink");
		li.add("violet");
		li.add("green");

		System.out.println( "Original list :"+li);
		
//		Update a specific element in the arraylist
		
		li.set(3, "blue");
		System.out.println("updated list:"+li);
		
//		Write a java program to reverse elements in the arraylist

		System.out.println( "before _reverse:"+li);
		System.out.println( li.toString());
		Collections.reverse(li);
		System.out.println( "after_reverse"+li);

//		Write a Java program to shuffle the arraylist
		List<String> list = Arrays.asList("priya","amala","uma","karthik");
		System.out.println("before :"+list);
		Collections.shuffle(list);
		System.out.println("after :"+list);
		
//		Write a Java Program to check if an arraylist is empty or not
		if(list.isEmpty()) {
			System.out.println("it's empty list");
		}
		else
			System.out.println("Not an empty list");


	}

}
