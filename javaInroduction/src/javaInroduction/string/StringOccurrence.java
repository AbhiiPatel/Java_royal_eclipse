package javaInroduction.string;
import java.util.Scanner;
public class StringOccurrence {

	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		
		int count[]=new int[1000];
		
		for(int i=0;i<name.length();i++) {
			count[(int)name.charAt(i)]++;
		}
		
		for(int i=0;i<1000;i++) {
			if(count[i]!=0) {
				System.out.println((char)i+" "+count[i]);
			}
		}
	}
}
