package jungsuckbook.exception;

import java.io.IOException;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			// System.out.println(0/0);

			throw new IOException();
			// System.out.println(4);
		} catch (ArithmeticException ae) {

			// ae instanceof Exception,RuntimeException 도 true. 이유는 Exception, RuntimeException이 ArithmeticException의 조상이기 때문
			if (ae instanceof ArithmeticException) {
				System.out.println("true");
				System.out.println("ArithmeticException");
			}
			
			// RuntimeException의 자식 외의 예외를 잡음
		} catch (Exception e) {
			System.out.println("Exception");
		} // try-catch 끝

		System.out.println(6);
		System.out.println("end");
	}
}
