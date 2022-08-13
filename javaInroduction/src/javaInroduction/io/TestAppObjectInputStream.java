package javaInroduction.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestAppObjectInputStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\javaInroduction\\studentrecord.txt");
			
			ObjectInputStream in=new ObjectInputStream(fin);
			
			Student s=(Student)in.readObject();
			
			System.out.println(s.getRolllno()+" "+s.getName()+" "+s.getStd());
			
			in.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
