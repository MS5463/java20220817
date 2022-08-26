package ch06.book_06.s0662;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteField);//0
		System.out.println("shortField: " + fiv.shortField);//0
		System.out.println("intField: " + fiv.intField);//0
		System.out.println("longField: " + fiv.longField);//0
		System.out.println("booleanField: " + fiv.booleanField);//false
		System.out.println("charField: " + fiv.charField);//
		System.out.println("floatField: " + fiv.floatField);//0.0
		System.out.println("doubleField: " + fiv.doubleField);//0.0
		System.out.println("arrField: " + fiv.arrField);//null
		System.out.println("referenceField: " + fiv.referenceField);//null
	}
}
//FieldInitValue 필드 선언시 초기값을 주지 않았기 때문에 출력시 기본값만이 출력된다.