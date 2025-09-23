package chepter3.lang.string.test;

public class TestString9 {

	public static void main(String[] args) {
		String email = "hello@example.com";
		// 코드 작성

		String[] result = email.split("@");
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}


