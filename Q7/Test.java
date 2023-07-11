package Q7;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose a mathematical operation below :");
			System.out.println("1. Determine factiorial of a number.");
			System.out.println("2. Determine x^n for two numbers x & n.");
			System.out.println("3. Determine GCD of two numbers.");
			System.out.println("4. Determine Binary equivalent of a given number.");
			System.out.println("5. Determine product of two numbers.");
			System.out.println("0. For Exit.");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter a number.");
					int f=sc.nextInt();
					int fact=factorial(f);
					System.out.println("Factorial of the number "+f+" is :"+fact);
					break;
			case 2: System.out.println("Enter two numbers.");
					int x=sc.nextInt();
					int n=sc.nextInt();
					System.out.println("x^n for two numbers "+x+" "+n+" is "+power(x,n));
					break;
			case 3: System.out.println("Enter two numbers.");
					int x1=sc.nextInt();
					int n1=sc.nextInt();
					System.out.println("GCD for two numbers "+x1+" "+n1+" is "+findgcd(x1,n1));
					break;
			case 4: System.out.println("Enter the number:");
					int b=sc.nextInt();
					System.out.println("Binary equivalent of given number "+b+" is:"+binaryequivalent(b));
					break;
			case 5: System.out.println("Enter two numbers.");
					int x2=sc.nextInt();
					int n2=sc.nextInt();
					System.out.println("Product for two numbers "+x2+" "+n2+" is "+product(x2,n2));
					break;
			case 0: System.out.println("Thank you..");
			 		break;
			default:System.out.println("Invalid choice Try again !!!");
			}
			
		}
		while(choice!=0);
		{
			sc.close();
		}
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*=factorial(n-1);
		}
	}
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		else {
			return x*power(x,n-1);
		}
	}
	public static int findgcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return findgcd(b,a%b);
		}
	}
	public static String binaryequivalent(int n) {
		
		if(n==0) {
			return "0";
		}
		else if(n==1) {
			return "1";
		}
		else {
			return binaryequivalent(n/2)+String.valueOf(n%2);
		}
	}
	public static int product(int x,int y) {
		if(x==0 ||y==0) {
			return 0;
		}
		else {
			return x+product(x,y-1);
		}
	}
	
}
