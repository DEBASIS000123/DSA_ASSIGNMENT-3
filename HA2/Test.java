package HA2;
import java.util.Scanner;
public class Test {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter array elements in increasing order :");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search :");
		int n=sc.nextInt();
		int lb=0,ub=a;
		int pos=binarysearch(arr,n,lb,ub);
		if (pos==-1) {
			System.out.println("The element is not present in the array.");
		}
		else {
			System.out.println("The number "+n+" is present in the array at position "+(pos+1));
		}
	}
	public static int binarysearch(int arr[],int n,int lb,int ub) {
		int mid=(lb+ub)/2;
		if(lb>ub) {
			return -1;
		}
		else if(n==arr[mid]){
			return mid;
		}
		else if(n<arr[mid]) {
			return binarysearch(arr,n,lb,mid-1);
		}
		else {
			return binarysearch(arr,n,mid+1,ub);
		}
	}
}
