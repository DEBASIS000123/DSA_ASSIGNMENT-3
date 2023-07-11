package HA1;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String na=sc.next();
		System.out.println("Enter account number");
		long ac=sc.nextLong();
		System.out.println("Enter balance");
		double ba=sc.nextDouble();
		System.out.println("Detils of account holder :");
		System.out.println("Name: "+na);
		System.out.println("Account number: "+ac);
		System.out.println("Balance :"+ba);
		System.out.println("Eneter amount to withdraw");
		double wi=sc.nextDouble();
		try {
			if(wi>ba) {
				throw new InvalidBalanceExcepttion("Balance can not be less than 0");
			}
			else {
				System.out.println("After withdraw, Balance= "+(ba-wi));
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
