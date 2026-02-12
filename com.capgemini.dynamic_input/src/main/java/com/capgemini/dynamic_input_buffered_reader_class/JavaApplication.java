/**
 * 
 */
package com.capgemini.dynamic_input_buffered_reader_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

public interface JavaApplication {
	public static void execution() {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter the Byte Data");
		try {
			byte byteData = Byte.parseByte(bufferedReader.readLine());
			System.out.println(byteData);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}