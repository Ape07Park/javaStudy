package chepter2.extends1.super2;

public class ClassC extends ClassB {

	public ClassC() {
		// super(); // ClassB에 기본 생성자 없어서 컴파일 오류 발생
		super(10, 20);
		System.out.println("ClassC 생성자");
	}
}
