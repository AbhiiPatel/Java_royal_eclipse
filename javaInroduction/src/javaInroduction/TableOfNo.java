package javaInroduction;

import java.util.Scanner;
public class TableOfNo {

	public static void main(String arg[])
	{
		System.out.println("Enter number:");
		
		int no=new Scanner(System.in).nextInt();
		
		for(int i=1;i<=10;i++)
		{
			//5 * 1 = 5
			 System.out.println(no+" * "+i+" = "+no*i);
		}
		
		
	}
	
}
