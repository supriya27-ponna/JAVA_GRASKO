package day2;
//				Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//				$100, $150 and $200 are deposited in banks A, B and C respectively. 
//				'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
//				Call this method by creating an object of each of the three classes.
abstract class Bank_new{
	abstract int getBalance();
}
class BankA extends Bank_new{
	private int balance;
	void deposit(int money) {
		balance = balance+money;
	}
	@Override
	int getBalance() {
		return balance;
	}
}
class BankB extends Bank_new{
	private int balance;
	void deposit(int money) {
		balance = balance+money;
	}
	@Override
	int getBalance() {
		return balance;
	}
}
class BankC extends Bank_new{
	private int balance;
	void deposit(int money) {
		balance = balance+money;
	}
	@Override
	int getBalance() {
		return balance;
	}
}
public class Bank_deposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a = new BankA();
		BankB b  = new BankB();
		BankC c = new BankC();
		
		a.deposit(100);
		b.deposit(150);
		c.deposit(200);
		
		System.out.println("Balance of BankA=$"+a.getBalance());
		System.out.println("Balance of BankB=$"+b.getBalance());
		System.out.println("Balance of BankC=$"+c.getBalance());

	}

}
