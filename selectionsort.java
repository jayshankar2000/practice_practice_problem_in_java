package array2;
import java.util.Scanner;
public class selectionsort {
	public static void selectionsort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int minindex = i;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
			}
			arr[minindex]=arr[i];
			arr[i]=min;
		}
	}
public static void main(String[] args) {
	int arr[] = {2,5,3,1,6,7};
	selectionsort(arr);
	for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i]);
	}
	
}
	
}
