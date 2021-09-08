package day1;

import java.util.*;

//			Write a java program which initialization earning of an employee. The program should calculate the income tax to be paid by the employee as per the criteria given below:
//			Slab rate IT rate
//			Upto Rs. 50,000 Nil
//			Upto Rs. 60,000 10% on additional amount
//			Upto Rs. 1,50,000 20% on additional amount
//			Above Rs. 1,50,000 30% on additional amount
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the salary:");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int tax_amount = 0;
		if(salary<=50000) {
			tax_amount = 0;
		}
		if(salary>50000 && salary <= 60000) {
			tax_amount = (salary-50000)*10/100;
		}
		if(salary>60000 && salary <= 150000) {
			tax_amount = (salary-50000)*20/100;
		}
		if(salary>150000) {
			tax_amount = (salary-50000)*30/100;
		}
		System.out.println("The Tax is:"+tax_amount);
	}

}
