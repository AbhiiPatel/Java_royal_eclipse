package javaInroduction.polymorphism.methodoverriding;

public class Vehicle {
	/*
	public void getSpecification()
	{
		
		System.out.println("Vehicle-General Specification Details");

	}
	*/
	
	public void getSpecification(Vehicle vehicle) {
		if(vehicle instanceof TW) {
			TW tw=(TW)vehicle;
			tw.getSpecification();
		}else if(vehicle instanceof LMV) {
			LMV lmv=(LMV)vehicle;
			lmv.getSpecification();
		}else if(vehicle instanceof HMV) {
			HMV hmv=(HMV)vehicle;
			hmv.getSpecification();
		}
	}
}
