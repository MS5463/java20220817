package ch18.lecture.p02outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C05OutputStream {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\user\\Desktop\\output\\오징어게임.jpg";
		String des = "C:\\Users\\user\\Desktop\\output\\오징어게임2.jpg";
	
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		
		byte[] buffer = new byte[100];		
		int len = 0;
		while ((len = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, len);
		}
	
		fis.close();
		fos.close();
	}
}	

