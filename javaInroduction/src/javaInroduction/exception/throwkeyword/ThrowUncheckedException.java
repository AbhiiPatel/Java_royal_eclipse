package javaInroduction.exception.throwkeyword;
/*
 * The Java throw keyword is used to throw an exception explicitly.
 * 
 * We can throw either checked or unchecked exceptions in Java by throw 
 * keyword.
 * 
 * Here,we use unchecked exception
 */
import java.util.Scanner;
public class ThrowUncheckedException {

	public static void validage(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible for vote.");
		}else {
			System.out.println("Person is eligible for vote.");
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter age:");
		int age=new Scanner(System.in).nextInt();
		
		validage(age);

	}

}
