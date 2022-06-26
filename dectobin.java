package ninja;
import java.util.Scanner;
public class dectobin {
	public static void main(String[] args) {
		int dec_num, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner sc = new Scanner(System.in);
        dec_num = sc.nextInt();
		
        quot = dec_num;
		
        while(quot != 0)
        {
           bin_num[i++] = quot%2;
           
            quot = quot/2;
            
        }
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
       
	}

}
