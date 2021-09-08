 package day2;
//A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
//	We have to print the money deposited by him in a particular bank.
//	Create a class 'Bank' with a method 'getBalance' which returns 0. 
//	Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the
//	same name 'getBalance' which returns the amount deposited in that particular bank. 
//	Call the method 'getBalance' by the object of each of the three banks.

class Bank0{

	int getBalance()
		{ 
		return 0;
		}

	}

class Bankh extends Bank0{

int getBalance(int balance)
   { 
	return balance; 
	}

}

class Banki extends Bank0{

int getBalance(int balance) 
{
	return balance;
	}

}

class Bankj extends Bank0{

int getBalance(int balance)
{ 
	return balance;
	}

}

public class practice{

public static void main(String args[]) {

Bankh a = new Bankh();

Banki b = new Banki(); 
Bankj c = new Bankj();

System.out.println("$" +a.getBalance(1000));

System.out.println("$" +b.getBalance(1500));

System.out.println("$" +c.getBalance(2000));

}

}
