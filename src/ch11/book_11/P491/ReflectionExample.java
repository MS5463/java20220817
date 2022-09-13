package ch11.book_11.P491;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec06.exan02_reflection.Car");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor constructors = clazz.getDeclaredConstructor();//┐
		for (Constructor constructor : constructors) {			  //│
			System.out.println(constructor.getName() + "(");	  //│
			Class[] parameters = constructor.getParameterTypes(); //│.....생성자 이름과 매개 변수 정보를 출력	
			printParameters(parameters);						  //│
			System.out.println(")");							  //│
		}														  //┘
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + 
			"" + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	
}
