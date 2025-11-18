package jungsuckbook.exception.finallypk;

public class FinallyEx {
	public static void main(String[] args) {
		FinallyEx.method();
		System.out.println("method 수행 후 main으로 돌아옴");
	}

	/**
	 * return 무시하고 finally까지 실행 후 메서드 종료
	 */
	static void method() {
		try {
			System.out.println("method  호출");
			return; // return 무시 
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("method의 finally 실행");
		}
	}

}
