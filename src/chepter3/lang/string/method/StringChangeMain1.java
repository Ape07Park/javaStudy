package chepter3.lang.string.method;

public class StringChangeMain1 {

	public static void main(String[] args) {
		String str = "Hello, Java! Welcome to Java";

		System.out.println("인덱스 7부터 부분 문자열 :" + str.substring(7));
		System.out.println("인덱스 7부터 12까지의 부분 문자열 :" + str.substring(7, 12));

		System.out.println("문자열 결합: " + str.concat("!!!"));

		// 포함되어있는 모든 문자를 내가 지정한 문자로 전부 대체
		System.out.println("'Java'를 'World'로 전부 대채: " + str.replace("Java", "World"));

		System.out.println("첫 번째 'Java를 'World로 대체: " + str.replaceFirst("Java", "World"));


	}
}
