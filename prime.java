package ninja;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1,count=0;
        while(i<=n){
            if(i%2==0){
                count++;
            }
            i++;
        } 
         if (count==2){
              System.out.println(i);
         }
	}

}
