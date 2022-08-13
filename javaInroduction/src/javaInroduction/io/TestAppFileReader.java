package javaInroduction.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestAppFileReader {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		try {
			FileReader fr=new FileReader("C:\\Users\\admin\\eclipse-workspace\\javaInroduction\\name.txt");
			
			int temp;
			
			while( (temp=fr.read()) != -1) {
				sb.append((char)temp);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(sb.toString());
	}

}
