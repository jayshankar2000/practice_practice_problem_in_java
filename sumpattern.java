package ninja;
import java.util.Scanner;
public class sumpattern {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                 sum = sum + j;
                 if(i==j) {
                	 System.out.print(j+"="+sum);
                 }
                
              
            }
            System.out.println();
        }
	}

}
