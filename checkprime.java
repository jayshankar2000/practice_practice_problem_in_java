package function;
import java.util.Scanner;
public class checkprime {
	public static boolean isprime(int n) {
		if(n<=1) {
           return false;
		}
		  int  i=2;
	      while(i<n) {
				if(n%i==0) {
					return false;
				}
				i++;
				
			}
	      return true;
			
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int num = sc.nextInt();
		  boolean ans = isprime(num);
		  System.out.println(ans);
	}
}
