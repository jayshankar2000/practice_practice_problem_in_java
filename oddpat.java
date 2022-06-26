package ninja;
import java.util.Scanner;
public class oddpat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(row%2==0){
                	return;
                   
                }
                else{
                	 System.out.print(j);
                }
            }
            System.out.println();
            
        }
	}

}
