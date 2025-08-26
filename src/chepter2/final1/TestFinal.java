package chepter2.final1;

public class TestFinal {

	final int value = 10; // 이미 할당 되어 있어서 수정 불가
	final int value2; // 생성자를 통해 1번만 할당 가능 그 뒤 수정 불가
	static final int TEST_VALUE = 30; // 상수, static이 붙어 있어서 프로그램 전 범위 사용 가능

	// value2에 값이 없어서 생성자를 통해 무조건 할당해야함.
	// 이유는 값 세팅 x 시 int의 기본값인 0이 들어가서 에러 발생
	public TestFinal(int value2) {
		this.value2 = value2;
	}

	public static void main(String[] args) {

		TestFinal testFinal = new TestFinal(20);
		System.out.println(testFinal.value);
		System.out.println(testFinal.value2);
		System.out.println(testFinal.value);
	}
}
