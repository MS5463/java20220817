package ch06.lecture.p11annotation;

import ch05.lecture.p04enum.Week;
public class C02Element {
	@MyAnnotation2(value = "coyote")
	private int i;
	
	@MyAnnotation2(value = "iceman")
	private int j;
	
	@MyAnnotation2("maverick")// value 생략 가능
	private int k;
	
	@MyAnnotation2
	private int l;
	
	@MyAnnotation2(value = "iceman", age = 30)	// 2개 이상의 어트리뷰트를 사용할 경우
	private int m;								// value 생략 불가능			
	
	@MyAnnotation2(week = Week.TUESDAY)
	private int o;
	
	@MyAnnotation2(names = {"maverick", "phoenix"})
	private int p;
	
	@MyAnnotation2(names = {"rooster"})
	private int q;
	
	@MyAnnotation2(names = {"rooster"})
	private int r;//값이 하나면 배열로 줄 필요는 없음
}
