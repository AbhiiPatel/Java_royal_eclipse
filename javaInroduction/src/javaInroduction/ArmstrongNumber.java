package javaInroduction;
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		int num=new Scanner(System.in).nextInt();
		
		int temp=num;
		int sum=0,last,digit=0;
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			sum += Math.pow(last,digit);
			temp=temp/10;
		}
			
		if(sum==num)
		{
			System.out.println(num+" is armstrong.");
		}else {
			System.out.println(num+" is not armstrong.");
		}
		
	}

}
