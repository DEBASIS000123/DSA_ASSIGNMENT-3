package Q10;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		System.out.println("eversed string os the string ="+reversed(str));
	}
	public static String reversed(String str) {
		if(str.isEmpty()) 
			return str;
		
		return reversed(str.substring(1))+str.charAt(0);
		
	}
}
