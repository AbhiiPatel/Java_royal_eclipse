package javaInroduction.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestAppObjectOutputStream {

	public static void main(String[] args) {
		
		Student s=new Student(1,"abhi patel",120);
		
		try {
			FileOutputStream fout=new FileOutputStream("studentrecord.txt");
			
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(s);
			
			out.close();
			
			fout.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");

	}

}
