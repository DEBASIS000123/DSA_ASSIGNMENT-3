package Q4;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		Integer []arrint=new Integer[5];
		for(int i=0;i<5;i++) {
			arrint[i]=sc.nextInt();
		}
		System.out.println("Integer array contains :");
		printarray(arrint);
		System.out.println("Enter array elements :");
		Double []douarr=new Double[5];
		for(int i=0;i<5;i++) {
			douarr[i]=sc.nextDouble();
		}
		System.out.println("Double array contains :");
		printarray(douarr);
	}
	public static <t> void printarray(t arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}

}
