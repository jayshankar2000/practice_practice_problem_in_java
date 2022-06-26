package ninja;
import java.util.Scanner;
public class series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1; count<n;i++)
		{
		int result = 3*i+2;
		if(result%4!=0)
		{
		System.out.print(result+" ");
		count++;
	    }
    }
		
  }
	

}
