package day2;
//Create a class to print the area of a square and a rectangle.
//The class has two methods with the same name but different number of parameters.
//The method for printing area of rectangle has two parameters which are length and breadth
//respetively while the other method forprinting area of square has one parameter which is side of 
//square.
public class Area {
 void square(int x) {
	 System.out.println("The area of square is"+(x*x));
 }
void square(int x,int y) {
	 System.out.println("The area of rectangle is"+(x*y));
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area();
		a.square(4);
		a.square(2,3);
	}

}
