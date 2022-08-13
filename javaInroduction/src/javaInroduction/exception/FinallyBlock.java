package javaInroduction.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			
			int ans=25/0;
			System.out.println(ans);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled");
//			System.out.println(e);
//			e.printStackTrace();
		}
		finally {
			System.out.println("Always executed");
		}

	}

}
