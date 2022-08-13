package javaInroduction.exception.throwkeyword;

import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
public class CustomException {

	public static void validAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Person is not eligible for vote.");
		}else {
			System.out.println("Person is eligible for vote.");
		}
	}
	public static void main(String[] args){
		
		System.out.println("Enter age:");
		int age=new Scanner(System.in).nextInt();
		
		try {
			validAge(age);
		}catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
}
