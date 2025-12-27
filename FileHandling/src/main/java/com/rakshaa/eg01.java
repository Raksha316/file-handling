package com.rakshaa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class eg01 {
	public static void main(String[] args) throws Exception {
		
       /* FileWriter fw = new FileWriter("data.txt");
		fw.write("Hello Prasoon Sir");
		
		fw.flush();
		fw.close();*/
		
		/*FileReader fr = new FileReader("data.txt");
		int i = fr.read();
		while(i != -1) {
			System.out.println((char) i);
			
			i = fr.read();
		}*/
		
		
	FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		System.out.println(line);		
	}
}
