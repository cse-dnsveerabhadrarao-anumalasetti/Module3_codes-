/**
 * 
 */
package com.capgemini.module_3_file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class FileHandler {
	public static final String path = "D:\\SDET-Programming\\file_handling_files\\file1.txt";
	public static final String data = "Hello World!";
	public static File file;
	
	public static void create() throws IOException {
		file = new File(path);
		if(file.createNewFile()) {
			System.out.println("File created!");
		}else {
			System.out.println("File already exists!");
		}
	}
	
	public static void update() throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(data);
		fileWriter.flush();
		fileWriter.close();
		System.out.println("File Updated!");
	}
}
