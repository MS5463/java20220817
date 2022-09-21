package ch18.book_18;

import java.io.FileInputStream;

public class P1022_FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
			"src/ch18/book_18/P1022_FileInputStreamExample.java");
			
			int data;
			while ( (data = fis.read() ) != -1) {	//
				System.out.write(data);				//.....1byte씩 읽고 콘솔에 출력
			}										//
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
