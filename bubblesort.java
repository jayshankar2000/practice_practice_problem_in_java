package array2;

public class bubblesort {
	
	public static void bubblesort(int arr[]) {
		int temp;
		int len=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {3,4,6,2,7,1,8,12,18,13};
		 bubblesort(arr);
		 int len=arr.length;
		 System.out.println(arr[len-3]);
		 for(int i=0;i<arr.length-1;i++) {
			 System.out.print(arr[i]+ " ");
			
			 System.out.println(arr[len-2]);
		 }
		
	}

}
