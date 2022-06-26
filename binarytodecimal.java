package ninja;
import java.util.Scanner;
public class binarytodecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =0;
		int base=1;
		int temp = n;
		while(temp>0) {
			int last_D=temp%10;
			temp/=10;
			result += last_D*base;
			base = base*2;
		}
		System.out.println(result);
	}

}
