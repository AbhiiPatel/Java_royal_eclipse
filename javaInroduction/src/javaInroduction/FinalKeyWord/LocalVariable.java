package javaInroduction.FinalKeyWord;

public class LocalVariable {

	public static void main(String arg[])
	{
		
		final int no1;
		
		no1=10;
		System.out.println("No1="+no1);
		
		//no1=20;  //compile time error
		System.out.println("No2="+no1);
	}
}
