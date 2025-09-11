package chepter3.lang.string.equals;

public class StringEqualsMain2 {

	public static void main(String[] args) {

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));

		String str3 = "hello";
		String str4 = "hello";
		System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));
	}


	// main 메서드 만드는 개발자와 isSame 메서드 만드는 개발자가 분리 되어 있다고 생각하기
	private static boolean isSame(String str1, String str2) {

	// isSame의 인수로 new로 생성한 str이 올지 문자열 리터럴이 올지 알 수 없음
	// 	return str1 == str2;
		// * 따라서 문자열 비교는 항상 equals 사용하기(동등성 비교)
		return str1.equals(str2);
	}
}
