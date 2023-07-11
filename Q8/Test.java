package Q8;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number want to reverse :");
		int n=sc.nextInt();
		System.out.print("Reverse of the given number "+n+" is:");
		reverse(n);
	}
	public static void reverse(int n) {
		if(n<10) {
			System.out.print(n);
		}
		else {
			System.out.print(n%10);
			reverse(n/10);
		}
	}

}
