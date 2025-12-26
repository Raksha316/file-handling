package com.rakshaa;
import java.io.FileWriter;
public class FW {
	public static void main(String[] args) throws Exception{
		
		FileWriter fw = new FileWriter("data.txt");
		
		fw.write("Hello Prasoon Sir");
		
		fw.flush();
		fw.close();
	}

		
	}




