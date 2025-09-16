package chepter2.extends1.super2;

public class Super2Main {

	public static void main(String[] args) {

		// ClassC 생성자 호출 - 부모 생성자 호출 및 부모 생성 * 2 - 자식 생성
		// ClassC classC = new ClassC(); // 부모를 먼저 생성하고 그 다음 자식을 생성

		ClassB classB = new ClassB(10);
	}
}
