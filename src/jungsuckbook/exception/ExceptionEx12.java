package jungsuckbook.exception;

/**
 * method2()에서 예외가 발생했지만 처리를 안해서 메서드가 종료되고 예외는 method1()로 넘어감
 * 거기서도 처리를 안해 메서드가 종료되고 main()으로 넘어감
 * 그리고 거기서도 처리를 안해 결국 프로그램이 종료됨.
 */
public class ExceptionEx12 {

	public static void main(String[] args) throws Exception {

		method1(); // 예외를 전달받았지만 처리 x라 프로그램이 종료됨
		System.out.println("종료");
	}

	static void method1() throws Exception {
		method2();
	}

	static void method2() throws Exception {
		throw  new Exception();
	}
}
