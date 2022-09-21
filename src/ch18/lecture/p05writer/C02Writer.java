package ch18.lecture.p05writer;

import java.io.FileWriter;
import java.io.Writer;

public class C02Writer {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\output\\output6.txt";
		Writer wr = new FileWriter(fileName);
		
		wr.write("Hello World");
		wr.write("!!!!!!!!!!!"); // \n : enter
		wr.write("@@@@@@@@@@@"); // \t : tab
		
		wr.close();
	}
}
