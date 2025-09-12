package chepter3.lang.string.method;

public class StringChangeMain2 {

	public static void main(String[] args) {
		String strWithSpaces = "	Java Programming ";

		System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
		System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

		// Whitespace만 제거
		System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");

		// since 11
		// Whitespace와 유니코드 공백(한글의 특수한 공백 등)을 포함해서 제거
		System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");


		System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");
		System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");

	}
}
