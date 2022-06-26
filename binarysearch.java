package array2;
import java.util.Scanner;
public class binarysearch {
	public static int binarysearch(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		if(target==arr[mid]) {
			return mid;
		}else if(target>arr[mid]) {
			 
			start =mid+1;
		}else {
			end = mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int input[] = new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();	
		}
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+" ");
			
		}
		int  x = sc.nextInt();
		int result= binarysearch(input,x);
		System.out.println(result);
		
		
	}

}
