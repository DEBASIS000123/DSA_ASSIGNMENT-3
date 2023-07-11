package Q5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		Integer []arr=new Integer[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search :");
		int n=sc.nextInt();
		int ocr=count(arr,n);
		System.out.println("Number of times "+n+" present in the array is: "+ocr);
	}
	public static <T> int count(T array[],T element) {
		int c=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].equals(element))
				c++;
		}
		return c;
	}

}
