package ninja;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int revers=0;
		while(number != 0)   
		{  
		int remainder = number % 10;  
		revers = revers * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println(revers);  
	}

}
