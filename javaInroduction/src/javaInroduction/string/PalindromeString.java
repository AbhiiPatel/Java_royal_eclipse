package javaInroduction.string;

import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String name=sc.nextLine();
		
		boolean flag=true;
		for(int i=0,j=(name.length()-1);i<name.length();i++,j--) {
			
			if(name.charAt(i) != name.charAt(j)) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome.");
		}

	}

}
