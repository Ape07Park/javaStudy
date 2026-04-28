package chepter3.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {

	public static void main(String[] args) throws
        ClassNotFoundException,
        NoSuchMethodException,
        InvocationTargetException,
        InstantiationException,
        IllegalAccessException {

		Class helloClass = Hello.class;
		// Class.forName("lang.clazz.Hello");

		// 클래스의 선언된 생성자를 통해 인스턴스 생성
		Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
		String result = hello.hello();
		System.out.println(result);


	}



	// public static void main(String[] args) throws
	// 	Exception {
	// 	Class clazz = new Hello().getClass();
	// 	System.out.println(clazz.getName());
	//
	// 	// reflection: 클래스 메타 데이터를 통해 메서드 호출 및 인스턴스 생성하는 것
	// 	Hello hello = (Hello)clazz.getDeclaredConstructor().newInstance();
	//
	// }
}
