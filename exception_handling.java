package ninja;

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("A");
			throw new NullPointerException("hello");
		}
		catch(ArithmeticException e) {
			System.out.print("B");
		}
      
	}

}
