package javaInroduction.string;

public class StringIntroduction {

	public static void main(String[] args) {
		
		
		String name1="abhi";
		String name2="abhi";
		String name3="tirth";
		
		System.out.println("Name1: "+name1+" "+name1.hashCode());
		System.out.println("Name2: "+name2+" "+name2.hashCode());
		System.out.println("Name3: "+name3+" "+name3.hashCode());
		
		String obj1=new String("Rudra");
		String obj2=new String("Rudra");
		String obj3=new String("abhi");
		
		System.out.println("Name1: "+obj1+" "+obj1.hashCode());
		System.out.println("Name2: "+obj2+" "+obj2.hashCode());
		
		//equals=compare value equality
		System.out.println("name1.equals(name2) ="+name1.equals(name2));
		System.out.println("name1.equals(name3) ="+name1.equals(name3));
		
		//equal(=)  =  compare object equality
		System.out.println( name1==name2);//true
		System.out.println( name1==name3);//false
		System.out.println(obj1==obj2);//false
		
		
		System.out.println(name1.equals(obj3));//true
		System.out.println(name1.equals(obj2));//false
		
		System.out.println(name1==obj3);//false
	
		
	}

}
