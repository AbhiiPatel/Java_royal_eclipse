package javaInroduction.string;

import java.util.Scanner;
public class StringMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter name:");
		String name=sc.nextLine();
		
		System.out.println("String ="+name);
		
		for(int i=0;i<name.length();i++) {
			System.out.println("Char at "+i+" index is="+name.charAt(i));
		}*/

		
		//contains-method
		/*String name="What do you know about me";
		
		System.out.println(name.contains("do you know"));
		
		System.out.println(name.contains("about  "));
		System.out.println(name.contains("about "));
		
		System.out.println(name.contains("abhi"));*/
		
		
		
		//endswith-method
		/*String name="java by rahul sir";
		
		System.out.println(name.endsWith("sir"));
		System.out.println(name.endsWith("sir "));
		System.out.println(name.endsWith("r"));*/
				
		
		
		//equalsIgnoreCase-method
		/*String name1="abhi";
		String name2="Abhi";
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));*/
		
	
		
		//getBytes-method
		String name="royal";
		
		/*byte b[]=name.getBytes();
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" "+name.charAt(i));
		}
		for(int i:b) {
			System.out.println(i);
		}*/
		
		
		
		//getChars-method
		/*String name="Royal technosoft";
		
		char ch[]=new char[10];
		
		name.getChars(0, 5, ch, 0);        
		
		System.out.println(ch);*/
		
		
				
		//indexOf-method
		/*String name="hello how are you";
		System.out.println(name.indexOf("are"));//return index of are sunstring
		
		System.out.println(name.indexOf("l"));
		System.out.println(name.indexOf("b"));//return -1
		*/
		
		
		
		//intern-method
		/*String name1="abhi";
		String name2=new String("abhi").intern();//it doesn't create new object if already same value of object in heap
		
		System.out.println(name1==name2);*/
		
		
		
		//isEmpty-method
		/*String s1="";
		String s2="abhi";
		String s3=null;
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());//Error-NullPointerException*/
		
		
		
		//join-method
		//System.out.println(String.join("@", "royal","how","are","you"));
		
		
		
		//lastIndexOf-method
		/*String s="this is java language";
		System.out.println(s.indexOf("s"));
		System.out.println(s.lastIndexOf("s"));*/
		
		
		
		//length-method
		//String name="royal technosoft";
		//System.out.println(name.length());
		
		
		//replace-method
		//String name="royal technosoft";
		//System.out.println(name.replace('a', 'e'));
		
		
		
		//split-method
		/*String name="Hello, how are you?";
		
		String word[]=name.split("\\s");//split the string based on whitespace
		
		for(String i:word) {
			System.out.println(i);
		}*/
		
		
		
		//substring-method
		/*String name="Royal technosoft";
		
		System.out.println(name.substring(0));
		System.out.println(name.substring(6, 16));
		System.out.println(name.substring(6, 20));//Error-StringIndexOutOfBoundsException
		*/
		
		
		
		//toCharArray-method
		/*String name="Royal technosoft";
		
		char ch[]=name.toCharArray();
		
		for(char i:ch) {
			System.out.println(i);
		}*/
		
		
		
		//toLowerCase-method
		//String name="TIRTH";
		//System.out.println(name.toLowerCase());
		
		
		
		//toUpperCase-method
		//String name="tirth";
		//System.out.println(name.toUpperCase());
		
		
		
		//trim-method
		/*String name="  Royal technosoft   ";
		System.out.println("Before trim-"+name.length());
		name=name.trim();
		System.out.println("After trim-"+name.length());*/
		
		
		
		//valueOf-method
		//byte
		//boolean
		//char
		//short
		//int                        String.valueOf(anytypevalue)
		//long
		//float
		//double
		
		
		int no1=10;
		int no2=20;
		
		System.out.println(no1+no2);
		
		System.out.println(String.valueOf(no1)+String.valueOf(no2));
	}

}
