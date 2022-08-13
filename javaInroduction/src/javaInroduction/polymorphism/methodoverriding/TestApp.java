package javaInroduction.polymorphism.methodoverriding;

public class TestApp {

	public static void main(String[] args) {
		
		//for first method getspecification
		
	/*	Vehicle vehicle=new Vehicle();
		vehicle.getSpecification();
		
		TW tw=new TW();
		tw.getSpecification();
		
		LMV lmv=new LMV();
		lmv.getSpecification();
		
		HMV hmv=new HMV();
		hmv.getSpecification();    */
		
		
		
		//Polymorphic object
		
		/*Vehicle vehicle=new TW();
		vehicle.getSpecification();
		
		Vehicle vehicle1=new LMV();
		vehicle1.getSpecification();
		
		Vehicle vehicle2=new HMV();
		vehicle2.getSpecification();
		
		//
		vehicle=new LMV();
		vehicle.getSpecification();
		
		vehicle=new HMV();
		vehicle.getSpecification();*/
		
		
		
		
		//for second method getspecifitation
		
		Vehicle vehicle1=new TW();
		vehicle1.getSpecification(vehicle1);
		
		vehicle1=new LMV();
		vehicle1.getSpecification(vehicle1);
		
		vehicle1=new HMV();
		vehicle1.getSpecification(vehicle1);
	}

}
