package Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static int binarysearch(int arr[],int start, int end,int target) {
		int len= arr.length;
		if(start>end) 
			return -1;
		
			int mid =(start+end)/2;
			if(target==arr[mid]) 
				return mid;
			
				else if(target<arr[mid]);
					return binarysearch(arr,start,mid-1,target);
					
	}
		
				     return binarysearch(arr,mid+1,end,target);
					
			   		
	
	
}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
			System.out.print(input[i]+" ");
		}
		int num = sc.nextInt();
		int start=0;
		int end =size-1;
		int result=binarysearch(input,start,end,num);
		System.out.print(result);
	}

}
