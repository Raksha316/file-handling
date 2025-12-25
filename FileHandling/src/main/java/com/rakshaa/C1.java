package com.rakshaa;
import java.io.File;
import java.io.IOException;
public class C1 {
	public static void main(String[] args) {

		File f = new File("data");
		boolean hh = f.mkdir();
		
		File f1 = new File(f, "file.txt");
		
		try {
			boolean filecreatedOrNot = f1.createNewFile();
			System.out.println(filecreatedOrNot);
		} 
		catch (IOException e) {
		e.printStackTrace();
		
		}
	}
}
