package array2;

public class largestinarray {
	public static void secondlargest(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 int max =arr[i];
	              if(arr[i+1]>max)
					 max=arr[i];
	              System.out.println(max);
		 }
	}
	public static void main(String[] args) {
		int arr[]= {2,5,1,7,8,9,6};
		secondlargest(arr);
		
		
	}
}
