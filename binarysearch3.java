package Arrays;

public class binarysearch3 {
	public static int binarys(int[] arr,int x) {
	 int start=0;
	 int end = arr.length-1;
	 while(start<=end) {
		 
	 
		int mid=(start+end)/2;
		if(x==arr[mid]) {
			return mid;
		}else if(x>arr[mid]) {
			start =mid+1;
		}else {
			end=mid-1;
		}
	 }
		return -1;
	 
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int index =binarys(arr,8);
		System.out.println(index);
	
	}

}
