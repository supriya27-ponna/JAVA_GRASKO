package day1;
//		Define a “Clock” class that does the following: -
//			a. Accept hours, minutes and seconds.
//			b. Check the validity numbers.
//			c. Set the time to AM/PM mode.
//		Use necessary constructors and methods to do the above task.


class Time{
	int hr,min,sec;
	Time(int h, int m,int s){
		hr = h;
		min = m;
		sec = s;
	}
	
	void isTimeValid() {
		if(hr>=0 &&  hr<24  && min>0  && min<60 && sec>0 && sec<60 ) {
			System.out.println("Time is valid");
		}
		else {
			System.out.println("Time is not valid");
		}
	}
	
	void setTimeMode() {
		if(hr<12) {
			System.out.println("Time=" + hr + ":" + min + ":" + sec + "AM");
		}
		else {
			hr = hr-12;
			System.out.println("Time=" + hr + ":" + min + ":" + sec + "PM");
		}
	}
}
public class clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time  T= new Time(16,45,32);
		T.isTimeValid();
		T.setTimeMode();
	}

}
