package Q1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your lucky number :");
		int n=sc.nextInt();
		try {
			if(n<0) {
				throw new NumberFormatException("Negetive Number !!!");
			}
			else {
				System.out.println("Your lucky number is :"+n);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
