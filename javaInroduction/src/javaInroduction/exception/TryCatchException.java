package javaInroduction.exception;

public class TryCatchException {

	public static void main(String[] args) {
		
		try{
//			int ans=5/0;
//			System.out.println(ans);
			
//			String name=null;
//			System.out.println("name.length()--" + name.length());
			
//			String name="abhi";
//			System.out.println(name.charAt(5));
			
//			int a[]=new int[5];
//			a[5]=10;
			
			String value="1f2g3h";
			int no=Integer.parseInt(value);
			no=no+200;
			System.out.println(no);
			
		}catch(ArithmeticException e)//e=reference variable
		{
			System.out.println("ArithmeticException-------handled");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException------handled");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException----handled");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException----handled");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException----handled");
			//errorLog
			e.printStackTrace();
//			System.out.println(e);
		}

	}

}
