package jungsuckbook.exception;

public class ExceptionEx {


	// 메서드 내에 여러 개의 try - catch 포함 가능
	public static void main(String[] args) {

		// 1차 try - catch
		try {
			try {} catch (Exception e) {}

			// catch 내에서도 예외 발생 가능
			// catch라는 이름의 메서드와 매개변수 Exception e
		} catch (Exception e) {

			try {

			}
			// catch (Exception e) {} // 변수 중복으로 컴파일 에러 발생
			// 블럭을 보면 e는 이미 선언되어 있음
			catch (Exception e2) {
			}
		}

		// 2차 try - catch

		try {

		} catch (Exception e) {

		}
	}
}
