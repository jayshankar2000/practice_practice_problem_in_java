package function;
import java.util.Scanner;
public class add {
	public static void add(int n1, int n2) {
		int sum = n1+n2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		  add(num1,num2);
	}

}
