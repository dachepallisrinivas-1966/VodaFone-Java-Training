package com.vodafone.ui;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		Scanner scan = null;
		FileWriter fw = null;
		
		try {
			scan = new Scanner(System.in);
			fw = new FileWriter("names.txt");
			String name = "";
			
			while (true) {
				System.out.println("Enter name ['end' to stop]: ");
				name = scan.nextLine();
				if ("end".equals(name))
					break;
				fw.write(name);
			}
			
		} catch(IOException excep) {
			System.out.println(excep.getMessage());
		} finally {
			try {
				fw.close();
			} catch (IOException excep) {
				System.out.println(excep.getMessage());
			}
			scan.close();
		}
	}

}
