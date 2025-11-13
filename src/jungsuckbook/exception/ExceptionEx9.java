package jungsuckbook.exception;

public class ExceptionEx9 {

	public static void main(String[] args) {

		try {
			Exception e = new Exception("예외 발생");
			throw e;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("종료");
	}
}
