package chepter3.lang.string.method;

public class StringUtilsMain1 {

	public static void main(String[] args) {
		int num = 100;
		boolean bool = true;
		Object obj = new Object();
		String str = "Hello Java!";

		// valueOf 메서드
		String numStr = String.valueOf(num);
		System.out.println("숫자를 문자열화 시킨 값: " + numStr);

		String boolStr = String.valueOf(bool);
		System.out.println("불리언을 문자열화 시킨 값: " + boolStr);

		String objStr = String.valueOf(obj);
		System.out.println("객체를 문자열화 시킨 값: " + objStr); // 주소값

		// 문자 + x -> 문자x(연접)
		String numStr2 = "" + num; // int가 자동으로 String으로 캐스팅
		System.out.println("빈문자열 + num: " + numStr2);

		// toCharArray()
		char[] chars = str.toCharArray();
		System.out.println("문자열을 문자 배열로 변환 :" + chars);
		for (char c : chars) {
			System.out.print(c);
		}
		System.out.println();


	}
}
