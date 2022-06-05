package javaimportantconcepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * How to Write a File & How to Read from a File using Java - Simple method
 * 
 * @Author:BhanuSurendra Deepala
 */
public class WriteNReadFile {

	public static void main(String[] args) throws IOException {

		String[] fruites = { "Mangoes", "Bananas", "Apples", "Oranges",null };
		String fileName = "./resources/output.txt";
		writeToFile(fileName, fruites);
		System.out.println(readFromFile(fileName));
	}

	// Method to read from a file line by line untill end of line & put that in a
	// list of String;
	private static List<String> readFromFile(String fileName) throws IOException {

		List<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line;
			System.out.println("Reading from the file " + fileName);
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			e.getStackTrace();
		}
		return list;
	}

	//Method is to write contents to a File, in this example I am using an Array of Strings to add to a file
	private static void writeToFile(String fileName, String[] fruits) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			for (String fruit : fruits) {
				writer.write(fruit + "\n");
			}
			System.out.println("============Successfully written to file===============");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
			e.getStackTrace();
		}

	}

}
