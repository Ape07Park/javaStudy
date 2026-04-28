package chepter3.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class 조회

		Class clazz = String.class; // 클래스에서 직접 조회
		// Class clazz1 = new String().getClass(); // 인스턴스 생성해서 조회
		// Class.forName("java.lang.String"); // 문자열(클래스 명으로 조회)

		// 모든 필드 출력
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("Field : " + field.getName() + "type : " + field.getType());
		}

		// 모든 메서드 출력
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Method : " + method);
		}

		System.out.println("SuperClass : " + clazz.getSuperclass().getName());

		Class[] interfaces = clazz.getInterfaces();
		for (Class interfaceClass : interfaces) {
			System.out.println("Interface : " + interfaceClass.getName());
		}




		// // Class 조회
		// Class clazz = String.class; // 클래스에서 직접 조회
		// Class clazz2 = new String().getClass(); // 인스턴스 생성해서 조회
		// Class clazz3 = Class.forName("java.lang.String"); // 클래스 명으로 가져와서 조회
		//
		// // clazz에 선언된 필드 배열에 담기
		// // Field: 클래스의 메타정보 중 필드를 담을 수 있는 객체
		// Field[] fields = clazz.getDeclaredFields();
		//
		// // 필드 출력중
		// for (Field field : fields) {
		// 	System.out.println("Field : " + field.getName() + "type : " + field.getType());
		// }
		//
		// // Method: 클래스의 메타정보 중 메서드를 담을 수 있는 객체
		// Method[] methods = clazz.getDeclaredMethods();
		// for (Method method : methods) {
		// 	System.out.println("Method : " + method);
		// }
		//
		// // 상위 클래스 정보 출력
		// System.out.println("SuperClass : " + clazz.getSuperclass().getName());
		//
		// // 구현해야하는 인터페이스 목록
		// Class[] interfaces = clazz.getInterfaces();
		// for (Class interfaceClass : interfaces) {
		// 	System.out.println("Interface : " + interfaceClass.getName());
		// }
	}
}
