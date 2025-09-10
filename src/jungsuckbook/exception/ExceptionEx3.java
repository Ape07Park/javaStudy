package jungsuckbook.exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			// 프로그램 종료가 안되기에 계속 진행됨
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("예외 발생");
				System.out.println("0");
			}

		}
	}
}
