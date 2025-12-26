package com.rakshaa;
import java.io.File;
public class DisplayFileDir  {
	public static void main(String[] args) throws Exception{
		
		File f = new File("C:\\Users\\DELL\\Desktop\\loction");
		
		String arr[] = f.list();
		
		//for each loop
		
		for(String hh : arr) {
			File f1 = new File(f, hh);
			
			if (f1.isFile()) {
				System.out.println(hh);
			}
			
		}
	}
}