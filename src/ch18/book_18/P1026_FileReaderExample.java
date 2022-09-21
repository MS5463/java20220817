package ch18.book_18;

import java.io.FileReader;

public class P1026_FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"src/ch18/book_18/P1026_FileReaderExample.java");
				
		int readCharNo;
		char[] cbuf = new char[100];// IntStream과는 다르게 문자 단위로 읽음
		while ((readCharNo=fr.read(cbuf)) != -1 ) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}
