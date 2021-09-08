package day2;
//		Create a class to print an integer and a character with two methods having the same name
//		but different sequence of the integer and the character parameters.
//		For example, if the parameters of the first method are of the form (int n, char c),
//		then that of the second method will be of the form (char c, int n).
public class Character {
	
		void printn(char c,int n) {
		System.out.println("a , 10");
		}
		void printn(int n,char c) {
		System.out.println("10 , a");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character nc=new Character();
		nc.printn('a', 11);
		nc.printn(3, 'd');
	}

}


//
//Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.
//
//
//A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
//Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.
