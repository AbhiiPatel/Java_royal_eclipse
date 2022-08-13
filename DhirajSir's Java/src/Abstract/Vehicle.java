package Abstract;

abstract class MotorBike
{
	abstract void brake();

}

class SportsBike extends MotorBike{
	public void brake()
	{
		System.out.println("SportsBike-brake");
	}
}

class MountainBike extends MotorBike{
	
	public void brake() {
		System.out.println("MountainBike-brake");
	}
	
}

public class Vehicle {
	
	public static void main(String arg[])
	{
		SportsBike obj=new SportsBike();
		obj.brake();
		
		MountainBike obj1=new MountainBike();
		obj1.brake();
		
	}

}
