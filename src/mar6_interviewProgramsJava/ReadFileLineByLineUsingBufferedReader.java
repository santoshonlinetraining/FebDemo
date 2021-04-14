package mar6_interviewProgramsJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:\\Automation\\W\\U_Selenium\\files\\data.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				if(line.contains("Santosh")){
					System.out.println("Found Santosh");
				}
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
