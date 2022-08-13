package javaInroduction;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		

		System.out.println("Enter number:");
		int no=new Scanner(System.in).nextInt();

		if(no==1) {
			System.out.println("Number is not a prime.");
		}
		for(int i=2;i<no;i++) {
			
			if(no%i==0) {
				System.out.println(no+" is not a prime.");
				break;
			}else {
				System.out.println(no+" is prime.");
				break;
			}
			
		}
		
	}

}
