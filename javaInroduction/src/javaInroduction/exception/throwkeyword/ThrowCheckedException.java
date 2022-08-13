package javaInroduction.exception.throwkeyword;

import java.io.IOException;
import java.util.Scanner;
public class ThrowCheckedException {

	public static void validAge(int age) throws IOException{
		if(age<18) {
			throw new IOException("Person is not eligible for vote.");
		}else {
			System.out.println("Person is eligible for vote.");
		}
	}
	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter age:");
		int age=new Scanner(System.in).nextInt();
		
		/*try {
			validAge(age);
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		validAge(age);
	}

}
