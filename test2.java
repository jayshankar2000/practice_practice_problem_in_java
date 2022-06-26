package ninja;

public class test2 {
//	 public static void func(int a) {
//	        int b = 10;
//	        a = a + 10;
//	        System.out.println(a);
//	    }
//
//	    public static void main(String[] args) {
//	        int a = 10;
//	        func(a);
//	        System.out.println(a);
//	    }
//	public static int func(int a){
//	    a += 10;
//	    return a;
//	}
//
//	public static void main(String[] args) {
//	    int a = 5;
//	    func(a);
//	    System.out.println(a);
//	}
//	public static int square(int a){
//	    int ans = a * a;
//	    return ans;
//	}
//
//	public static void main(String[] args) {
//	    int a = 4;
//	    a = square(a);
//	    System.out.println(a);
//	}
	
	public static boolean isPrime(int x)
	{
	    for(int i=2;i<x;i++)
	    {
	        if(x%i==0)
	        return false;
	    }
	    return true;

	}
	public static void main (String[] args) {
	    System.out.print(isPrime(104));
	}
}
