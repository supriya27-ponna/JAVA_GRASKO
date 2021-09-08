package day2;

public class Circle_new extends Shape_new {
	void Circle_area(Double r){
		Double circle_area=3.14*r*r;
		System.out.println("area of the circle:"+circle_area);
		
	}
	public static void main(String[] args) {
		Shape_new s=new Circle_new();
		Circle_new c=new Circle_new();
		s.Circle_area(3.2);
	}

}
