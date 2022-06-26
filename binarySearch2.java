package Arrays;
import java.util.Scanner;
public class binarySearch2 {
	
	public static int binarysearch(int arr[] , int x) {
		int start =0;
		int end=arr.length;
		while(start<=end) {
		int  mid =start+end/2;
		if(x==arr[mid]) {
			return mid;
		}else if(x>arr[mid]) {
			start =mid+1;
		}else {
			end =mid-1;
		}
	}
		return -1;
	} 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int input[]= new int[size];
	for(int i=0;i<size;i++) {
		input[i]=sc.nextInt();
		
	}
	for(int i=0;i<size;i++) {
		System.out.print(input[i]+" ");
	}
	int target = sc.nextInt();
	int index= binarysearch(input ,target);
	System.out.println(index);
}
}
