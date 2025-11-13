package jungsuckbook.exception;

/**
 * 예외가 발생한 곳에서 처리되어 main()은 정상 실행됨
 */
public class ExceptionEx13 {

	public static void main(String[] args) throws Exception {

		method1(); // 예외를 전달받았지만 처리 x라 프로그램이 종료됨
		System.out.println("종료");
	}

	static void method1() throws Exception {
		method2();
	}

	static void method2() throws Exception {

		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 처리");
		}
	}
}
