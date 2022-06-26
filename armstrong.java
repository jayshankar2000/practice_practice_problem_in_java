package Arrays;
import java.util.Scanner;
public class armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem,sum=0;
		int orgnum =num;
		
		while(orgnum!=0) {
			 rem=(orgnum%10);
			 sum = sum +rem*rem*rem;
			 orgnum/=10;
			 
		}
		 if(sum==num) 
			 System.out.println("true");
		 else
			 System.out.println("false");
		 
		
	}

}
