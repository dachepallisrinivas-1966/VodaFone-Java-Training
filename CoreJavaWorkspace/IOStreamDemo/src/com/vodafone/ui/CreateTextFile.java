package com.vodafone.ui;

import java.io.FileReader;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("names.txt");
			int ch;
			while (true) {
				ch = fr.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
			
		} catch(IOException excep) {
			System.out.println(excep.getMessage());
		} finally {
			try {
				fr.close();
			} catch (IOException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}

}
