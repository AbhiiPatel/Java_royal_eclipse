package Abstract;

abstract class Animal{
	
	abstract void makesound();
	public void eat(){
		System.out.println("I can eat.");
	}
	
}

class Dog extends Animal
{
	public void makesound() {
		System.out.println("Bark bark.");
	}
}

public class AnimalVoice {
	public static void main(String arg[])
	{
		Dog obj=new Dog();
		obj.makesound();
		obj.eat();
		
	}
}
