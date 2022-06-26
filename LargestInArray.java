package Arrays;

import java.util.Scanner;

public class LargestInArray {
	public static int largestInArray(int input[]) {
		int count=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		return max;
		for(int i=0;i<input.length;i++) {
			if(max==input[i]) {
				count =count+1;
			}
		  System.out.println(count);
		}
	}

	public static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 int input[] =new int[size];
		 for(int i=0;i<size;i++) {
			 input[i]=sc.nextInt();
		 }
		 return input;
		 
		}
		public static void print(int input[]) {
			int size = input.length;
			for(int i=0;i<size;i++) {
				System.out.print(input[i]+" ");
			}
		}
		
	public static void main(String[] args) {
		int arr[]=takeInput();
		print(arr);
		int largest =largestInArray(arr);
		System.out.print("Largest is  "+ largest);
 }
}

