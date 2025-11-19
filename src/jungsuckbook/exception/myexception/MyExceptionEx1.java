package jungsuckbook.exception.myexception;

public class MyExceptionEx1 {

	public static void main(String[] args) {

		// 500 에러 발생
		System.out.println("500 에러 실험");
		occur500Err();
		System.out.println("500 에러 통과");

		// 400 에러 발생
		System.out.println("400 에러 실험");
		occur400Err();
		System.out.println("400 에러 통과");

	}

	public static void occur500Err() throws MyException {

		System.out.println("서버에 요청 보냄");

		System.out.println("서버에서 처리 중");

		try {

			throw new MyException("서버에서 처리중 에러 발생");

		} catch (MyException e) {
			System.out.println("500에러 처리 됨");
			e.printStackTrace();
		}
	}

	public static void occur400Err() throws MyException {

		System.out.println("서버에 요청 보냄");

		try {
			throw new MyException("Not found", 400);
		} catch (MyException e) {
			System.out.println("400에러 처리 됨");
			e.printStackTrace();

		}

	}
}
