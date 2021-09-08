package day2;

public class Rectangle_new extends Shape_new {
	void Rectangle_area(Double l1,Double b){
		Double rectangle_area=l1*b;
		System.out.println("area of the rectangle:"+rectangle_area);
		
	}
	public static void main(String[] args) {
		Rectangle_new r=new Rectangle_new();
		r.Rectangle_area(3.4,5.0);

	}

}
