package javaInroduction.exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			
			try {
				int a=5/0;
				System.out.println("Answer="+a);
			}catch(ArithmeticException e) {
				System.out.println("catch block--1 ArithmeticException handled");
				//e.printStackTrace();
			}
			

			try {
				String name=null;
				System.out.println("name.length()--" + name.length());
			}catch(NullPointerException e) {
				System.out.println("catch block--2 NullPointerException handled");
				//e.printStackTrace();
			}
			
			try {
				String name="abhi";
				System.out.println(name.charAt(5));
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("catch block--3 StringIndexOutOfBoundsException handled");
				//e.printStackTrace();
			}
			
			try {
				int a[]=new int[5];
				a[5]=10;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("catch block--4 ArrayIndexOutOfBoundsException handled");
				//e.printStackTrace();
			}
			
			try {
				String value="1f2g3h";
				int no=Integer.parseInt(value);
				no=no+200;
				System.out.println(no);
			}catch(NumberFormatException e) {
				System.out.println("catch block--5 NumberFormatException handled");
				//e.printStackTrace();
			}
		}catch(Exception e) {
			System.out.println("Exception");
			
		}

	}

}
