package Arrays;
import java.util.Scanner;
public class countmax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		 int max =input[0];
		 for(int i=0;i<size;i++) {
			 if(max<input[i+1]) {
				 max=input[i];
			 }
			 System.out.println(max);
		 }
		 int count=0;
		 for(int i=0;i<size;i++) {
			 if(max==input[i]) {
				 count=count+1;
			 }
			 System.out.println(count);
		 }
	}

}
