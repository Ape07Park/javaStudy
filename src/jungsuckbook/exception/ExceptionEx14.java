package jungsuckbook.exception;

/**
 * 발생한 예외를 넘겨서 method1()에서 처리되어 main()은 정상 실행됨
 */
public class ExceptionEx14 {

	public static void main(String[] args) throws Exception {

		method1(); 
		System.out.println("종료");
	}

	static void method1() throws Exception {

		try {
		method2();

		} catch (Exception e) {
			System.out.println(e.getMessage()); // null
			e.printStackTrace();
			System.out.println("예외가 처리됨");
		}
	}

	static void method2() throws Exception {
		throw new Exception();
	}
}
