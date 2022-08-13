package javaInroduction.FinalKeyWord;

import java.util.Scanner;

public class DataMember {

	//final int no1=10;
	
	final int no1;
	
	
	public DataMember(int value)
	{
		no1=value;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter no:");
		int value=new Scanner(System.in).nextInt();
		
		DataMember obj=new DataMember(value);
		System.out.println("No1="+obj.no1);
		
		/*In data member you can't assign value in final
		variable after creating an object,you must assign value 
		before creating an object.*/
		
	}

}
