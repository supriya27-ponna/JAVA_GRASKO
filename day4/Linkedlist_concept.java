package day4;
import java.util.*;
//
//	Write a Java program to append the specified element to the end of a linked list

//	Write a Java program to iterate through all elements in a linked list
//
//	Write a Java program to iterate through all elements in a linked list starting at the specified position.
//
//	Write a Java program to iterate a linked list in reverse order
//
//	Write a Java program to insert elements into the linked list at the first and last position
public class Linkedlist_concept {

	public static void main(String[] args) {
		
//		Write a Java program to append the specified element to the end of a linked list

		LinkedList<String> li1 = new LinkedList<String>();
		li1.add("mango");
		li1.add("banana");
		li1.add("apple");
		li1.add("guava");
		System.out.println("LinkedList is : "+li1);
		
		
//		Write a Java program to iterate through all elements in a linked list
		
		Iterator<String> i = li1.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		Write a Java program to iterate through all elements in a linked list starting at the specified position.
		Iterator<String> k = li1.listIterator();
		while(k.hasNext()) {
		System.out.println(k.next());
		}
		
//		Write a Java program to iterate a linked list in reverse order
		Iterator<String> h = li1.descendingIterator();
		while(h.hasNext()) {
			System.out.println("Reversed linked list is:"+h.next());
		}
		
//		Write a Java program to insert elements into the linked list at the first and last position
		System.out.println("LinkedList is : "+li1);

		li1.addFirst("First element");
		li1.addLast("Last element");
		System.out.println("Updated linkedlist is:"+li1);

	}

}
