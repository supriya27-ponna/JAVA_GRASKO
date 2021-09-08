package day2;

public class Square_new extends Shape_new {
	void Square_area(Double l){
		Double square_area=l*l;
		System.out.println("area of the square:"+square_area);
		
		
	}
	public static void main(String[] args) {
		
		
	
		Square_new s=new Square_new();
		s.Square_area(6.3);
		
	}

}
