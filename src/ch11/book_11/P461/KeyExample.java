package ch11.book_11.P461;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
//HashMap : 자바에서 Map이라는 구조를 구현한 클래스(다른 언어에서는 Dictionary)
//해시코드