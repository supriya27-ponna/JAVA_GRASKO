package day1;
//	Design a class for a bank database the database should support the following operations.
//		1. Deposit a certain amount into an account,
//		2. Withdrawing a certain amount from an account,
//		3. Return a value specifying the amount (i.e. balance) in an amount.
class NewBank{
	int accno;
	String name = null;
	int balance;
	
	void setData( int a , String n, int b) {
		accno = a;
		name = n;
		balance = b;
	}
	
	void deposit(int amount) {
		balance = balance +amount;
	}
	void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Insufficient fund");
		}
		else
		balance = balance - amount;
	}
	
	void display() {
	System.out.println("Your accno :" + accno);
	System.out.println("Your name :" + name);
	System.out.println("Your balance :" + balance);
		
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewBank nb = new NewBank();
		nb.setData(1752722909, "priya", 100000);
		nb.deposit(60000);
		nb.withdraw(8000);
		nb.display();
	}

}
