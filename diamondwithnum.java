package ninja;
import java.util.Scanner;
public class diamondwithnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
	}
	
}
