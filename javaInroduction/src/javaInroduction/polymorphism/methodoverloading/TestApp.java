package javaInroduction.polymorphism.methodoverloading;
import java.util.Scanner;
public class TestApp {

	static void addFun()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no1:");
		int no1=sc.nextInt();
		
		System.out.println("Enter no2:");
		int no2=sc.nextInt();
		
		int ans=no1+no2;
		System.out.println("Addition="+ans);
		
	}
	
	static void addFun(int no1)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no2:");
		int no2=sc.nextInt();
		
		int ans=no1+no2;
		System.out.println("Addition="+ans);
	}
	
	static void addFun(int no1,int no2)
	{
		int ans=no1+no2;
		System.out.println("Addition="+ans);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("addFun()");
		addFun();
		System.out.println("--------------------------------------");
		
		
		System.out.println("addFun(int no1)");
		System.out.println("Enter no1:");
		int no1=sc.nextInt();
		addFun(no1);
		System.out.println("--------------------------------------");
	
		
		System.out.println("addFun(int no1,int no2)");
		System.out.println("Enter no:");
		int no=sc.nextInt();
		System.out.println("Enter no2:");
		int no2=sc.nextInt();
		addFun(no1,no2);
	}

}
