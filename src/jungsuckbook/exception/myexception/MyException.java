package jungsuckbook.exception.myexception;

/**
 * 나만의 예외를 만드는 이유는 예외에 특정 정보를 포함하기 위함
 */
public class MyException extends RuntimeException {
	
	// HTTP 상태 코드
	private int code;

	public MyException(String msg) {
		super(msg);
		this.code = 500;
	}

	public MyException(String msg, int code) {
		super(msg);
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
