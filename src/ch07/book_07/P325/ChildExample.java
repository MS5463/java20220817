package ch07.book_07.P325;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();//.....자동 타입 변환	=> line 14
		parent.field1 = "data1";//child만 가지고 있는 메소드는 실행 시킬 수 없다
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2";	//(불가능)
		 parent.method3();			//(불가능)
		 */
		
		Child child = (Child) parent;//.....강제 타입 변환
		child.field1 = "yyy";	//(가능)
		child.method3();    	//(가능)
	}
}
