package chepter3.lang.string.method;

public class StringComparisonMain {

	public static void main(String[] args) {
		String str1 = "Hello World"; // 대문자 일부 O
		String str2 = "hello world"; // 모두 소문자
		String str3 = "Hello Java";

		// 대소문자 구분
		System.out.println("str1 eq str2 :" + str1.equals(str2));

		// 대소문자 미구분
		System.out.println("str1 equalsIgnoreCase str2 :" + str1.equalsIgnoreCase(str2));

		// 1칸 차이
		System.out.println("'b' compareTo 'a' : " + "b".compareTo("a"));
		// 2칸 차이
		System.out.println("'c' compareTo 'a' : " + "c".compareTo("a"));

		// -2칸 차이
		System.out.println("'a' compareTo 'c' : " + "a".compareTo("c"));

		// 사전순 비교(같은 문자 포함 시 문자열 길이의 차이를 반환하고 같은 문자 없으면 다른 것의 아스키 코드 값 차이 반환)
		System.out.println("str1 compareTo str3 " + str1.compareTo(str3));
		
		// 대소문자 구분없이 사전 순 비교
		System.out.println("str1 compareToIgnoreCase str3 " + str1.compareToIgnoreCase(str2));

		System.out.println("str1 start with 'Hello : " + str1.startsWith("Hello"));
		System.out.println("str1 start with 'World : " + str1.endsWith("World"));
	}
}
