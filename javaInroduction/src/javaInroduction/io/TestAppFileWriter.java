package javaInroduction.io;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestAppFileWriter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.nextLine();
		
		try {
			FileWriter fw=new FileWriter("name.txt");
			
			fw.write(name);
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("success");
	}

}
