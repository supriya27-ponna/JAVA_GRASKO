package day2;
//We have to calculate the percentage of marks
//obtained in three subjects (each out of 100) by student A
//and in four subjects (each out of 100) by student B. 
//Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
//It is inherited by two other classes 'A' and 'B' each having a method with the same name 
//which returns the percentage of the students. 
//The constructor of student A takes the marks in three subjects as its parameters 
//and the marks in four subjects as its parameters for student B. 
//Create an object for each of the two classes and print the percentage of marks for 
//both the students.

abstract class Mark{
	public abstract double getPercentage();
}
class A extends Mark{
	int mark_1,mark_2,mark_3;
	A(int m1,int m2,int m3){
		mark_1=m1;
		mark_2=m2;
		mark_3=m3;

	}
	public double getPercentage() {
		double percent = ((mark_1+mark_2+mark_3)/300.0)*100;
		return percent;
	}
}
class B extends Mark{
	int mark_1,mark_2,mark_3,mark_4;
	B(int m1,int m2,int m3,int m4){
		mark_1=m1;
		mark_2=m2;
		mark_3=m3;
		mark_4 = m4;
	}
	public double getPercentage() {
		double percent = ((mark_1+mark_2+mark_3+mark_4)/400.0)*100;
		return percent;
	}
}
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(90,56,78);
		B b = new B(78,90,67,89);
		System.out.println("The percentage of Student A is:" +a.getPercentage());
		System.out.println("The percentage of Student B is:" +b.getPercentage());

	}

}
