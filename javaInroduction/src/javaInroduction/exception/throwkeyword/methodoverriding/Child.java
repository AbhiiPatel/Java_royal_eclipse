package javaInroduction.exception.throwkeyword.methodoverriding;
/*
 * If the superclass method does not declare an exception, subclass
 * overridden method cannot declare the checked exception but it can
 * declare unchecked exception.
 */
public class Child extends Parent{

	void display() throws ArithmeticException{
		System.out.println("Child Exception");
	}
	public static void main(String[] args) {
		Parent obj=new Child();
		obj.display();

	}

}
