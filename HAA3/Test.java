package HAA3;
import java.util.Scanner;
public class Test {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println(ispallendrome(str,0,str.length()-1)?"The string is a pallendrome ":"No,the string is not pallendrome.");
	}
	public static boolean ispallendrome(String Str,int lb,int ub) {
		if (lb==ub)
			return true;
		if(Str.charAt(lb)!=Str.charAt(ub))
			return false;
		if(lb<ub)
			return ispallendrome(Str,lb+1,ub-1);
		return true;
	}
	
	
}
