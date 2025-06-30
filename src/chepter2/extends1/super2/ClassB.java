package chepter2.extends1.super2;

public class ClassB extends ClassA {

	public ClassB(int a) {
		super(); // 기본 생성자 호출 - 생략 o, 자바가 자동으로 생성해줌
		System.out.println("ClassB 생성자 a=" + a);
	}

	public ClassB(int a, int b) {
		super();
		System.out.println("ClassB 생성자 a=" + a + " b=" + b );
	}
}
