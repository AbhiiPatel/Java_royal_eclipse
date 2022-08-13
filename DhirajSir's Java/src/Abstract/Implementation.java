package Abstract;

abstract class Sample1
{
	int x=5;
	final float pi=3.14f;
	abstract void add();
	void add1()
	{
		System.out.println("This is non abstract method of abstract class");
	}

}

interface Sample2
{
	int y=6;
	void add2();
}

final class Sample3
{
	int z=46;
	void add3()
	{
		System.out.println("This is add3 method of final class.");
	}
}

class Sample4 extends Sample1 implements Sample2{
	 void add()
	{
		System.out.println("This is abstract method of abstract class");
	}
	public void add2()
	{
		System.out.println("This is the method of interface.");
	}
}

public class Implementation {

	public static void main(String[] args) {
		
		Sample4 obj=new Sample4();
		obj.add();
		obj.add1();
		obj.add2();
		
		Sample3 obj1=new Sample3();
		obj1.add3();
		System.out.println(obj1.z);

		
	}

	
}
