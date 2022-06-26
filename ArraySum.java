package Arrays;
import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		int arrsum=0;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			arrsum+=input[i];
		}
		System.out.println("the value of array sum is "+arrsum);
		
	}

}
