package ch18.lecture.p03exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C03Exception {
	public static void main(String[] args) {
		// try - with - resources (java 7부터 가능)
		// try - with - resources에서 사용 가능한 type 은
		// AutoCloseable만 가능
		
		try (
			// 여기 선언된 자원은 자동으로 닫아줌
			OutputStream os = new FileOutputStream("");
			InputStream is = new FileInputStream("");
			) {
			// 다시 할당할 수 없음
			// os = new FileOutputStream("");
			
			// 읽고 쓰는 직업
			os.write(3);
			is.read();
			
			} catch (Exception e) {	
				e.printStackTrace();
		}
	}
}
