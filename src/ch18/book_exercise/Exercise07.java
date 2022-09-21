package ch18.book_exercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise07 {
	public static void main(String[] args) throws Exception {
		//정확한 경로로 수정하세요.
		String fillPath =
				"src/ch18/book_exercise/Exercise07.java";
		//작성 위치
		FileReader fr = new FileReader(name);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		fr.close();
	}
}
