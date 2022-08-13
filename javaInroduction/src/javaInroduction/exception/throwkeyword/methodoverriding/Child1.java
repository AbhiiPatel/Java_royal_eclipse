package javaInroduction.exception.throwkeyword.methodoverriding;
/*
 * If the superclass method declares an exception, subclass overridden
 * method can declare same, subclass exception or no exception but
 * cannot declare parent exception.
 */
public class Child1 extends Parent1{

	void display() throws ArithmeticException{
		System.out.println("Child Exception");
	}
	public static void main(String[] args) {
		Parent obj=new Child();
		
		try {
			obj.display();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
