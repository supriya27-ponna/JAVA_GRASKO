package day3;
import java.util.Scanner;

public class ArrayException {

public static void main(String[] args) {
				try{

						try{
							int b=56/0;
							System.out.println(b);
						}
						catch(ArithmeticException e){
							System.out.println(e);
						}

						try{
							Scanner sc=new Scanner(System.in);
							System.out.println("enter the number");
							int n=sc.nextInt();
							int[] a=new int[6];
							System.out.println("enter the array elements");
							for(int i=0;i<n;i++)
							{
								a[i]=sc.nextInt();
							}
						}

						catch(ArrayIndexOutOfBoundsException e){
							System.out.println(e);

						}
				}
				catch(NullPointerException e){
					System.out.println(e);
				}
				finally{
					System.out.println("Exceptions");
				}

		}
}

