package javaInroduction.string;

public class StringFormatMethod {

	public static void main(String[] args) {
		
		String name="Abhi";
		
		String s1=String.format("name is %s",name);
		String s2=String.format("value is %f", 32.446);
		String s3=String.format("valus is %30.12f",32.33434);//return 12 char fractional value
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(String.format("value=%d",34 ));
	}

}
