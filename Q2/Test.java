package Q2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four colors");
		String color[]=new String[4];
		for(int i=0;i<4;i++) {
			color[i]=sc.next();
		}
		try {
		System.out.println("Convert string to integer ");
		int n=Integer.parseInt(color[0]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("Enter one more color ");
			color[5]=sc.next();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		System.out.println("The colors entered are");
		for(int i=0;i<4;i++) {
			System.out.println(color[i]);
		}
	}

}
