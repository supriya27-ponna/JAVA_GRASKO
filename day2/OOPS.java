package day2;

//      Abstraction


 abstract class Shape{
	abstract void draw();
}
 
 class Rectangle extends Shape{
	 void draw() {
		 System.out.println("Drawing Rectangle");
	 }
 }
 class Circle extends Shape{
	 void draw() {
		 System.out.println("Drawing circle");
	 }
 }
 
 abstract class Bank{
	 abstract  int getROI();
 }
 
 class SBI extends Bank{
	 int getROI() {
		 return 8;
	 }
 }
 class BOB extends Bank{
	 int getROI() {
		 return 5;
	 }
 }
public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle();
		Shape r = new Rectangle();
		s.draw();
		r.draw();
		
		Bank b;
		b = new SBI();
		System.out.println("The SBI is having ROI of :"+b.getROI()+"%");

		b= new BOB();
		System.out.println("The BOB is having ROI of :"+b.getROI()+"%");

		

	}

}
