package ch18.book_18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class P1033_BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\user\\Desktop\\output\\오징어게임.jpg");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\user\\Desktop\\output\\오징어게임.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}
