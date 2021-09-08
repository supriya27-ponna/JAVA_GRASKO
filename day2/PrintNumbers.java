package day2;
//    Create a class named 'PrintNumber' to print various numbers of different datatypes
//   by creating different methods with the same name 'printn'having a parameter for each datatype.
public class PrintNumbers {
	public int printn(int a) {
		System.out.println(a);
		return a;
	}
	public float printn(float b) {
		System.out.println(b);
		return b;
	}
	public String printn(String l) {
		System.out.println(l);
		return l;
	}
	public double printn(double c) {
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers a =  new PrintNumbers();
		PrintNumbers b =  new PrintNumbers();
		a.printn(9);
		a.printn("priya");
		b.printn(19.089);
		a.printn(0.888913);

	}

}
