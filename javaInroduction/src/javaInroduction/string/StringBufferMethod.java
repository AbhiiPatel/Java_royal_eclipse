package javaInroduction.string;

public class StringBufferMethod {

	public static void main(String[] args) {
		
		StringBuffer obj=new StringBuffer("Royal ");
		
		System.out.println(obj+" "+obj.hashCode());
		
		obj.append("Technosoft Pvt Ltd.");
		
		System.out.println(obj+" "+obj.hashCode());
		
		
//		System.out.println(obj.reverse());
		obj.reverse();
		System.out.println(obj);
		
		//using append method it doesnot create a new object
		
		
		String name="abhi";
		
		name.concat(" patel");
		System.out.println(name);
	}

}
