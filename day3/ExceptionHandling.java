package day3;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a = 20;
				int b = a/0;
				System.out.println(b);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				String s = null;
				System.out.println("string length is :"+(s.length()));
			}
			catch(NullPointerException e) {
				System.out.println("you've given string as null" +e);
			}
			try {
				 int arr[]= {5,67,89}  ;
				 System.out.println(arr[12]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayException handled"+e);
			}
		}
		catch(Exception e) {
			System.out.println("Default catch if there is no exceptions"+e);
		}
		
	}

}
