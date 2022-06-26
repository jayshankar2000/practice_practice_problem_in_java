package function;
import java.util.Scanner;
public class dividenum2 {
	public static int dividenumber(int num,int deno) {
		if(deno==0) {
			return -1;
		}
		return num/deno;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int deno=sc.nextInt();
	int result = dividenumber(num,deno);
	System.out.println(result);
}
}
