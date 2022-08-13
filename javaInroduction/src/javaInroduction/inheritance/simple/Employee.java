package javaInroduction.inheritance.simple;
import java.util.Scanner;

public class Employee extends Person{
	
	public String name;
	public float salary;
	
	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		name=sc.nextLine();
		System.out.println("Enter employee salary:");
		salary=sc.nextFloat();
	}
	
	public void display()
	{
		
		System.out.println("Information of an employee");
		System.out.println("-------------------------------------------");
		System.out.println(id+" "+name+" "+salary);
	}
}
