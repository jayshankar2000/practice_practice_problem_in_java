package ninja;
import java.util.Scanner;
public class Factorial {
	public static int fact(int n) {
		 if(n==0) {
			 return 1;
		 }
		 int smallans=fact(n-1);
		 return n*smallans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		int ans=fact(n);
		System.out.println(ans);
		
	}

}
