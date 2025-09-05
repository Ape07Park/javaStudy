package chepter3.lang.string;

public class StringConcatMain {

	public static void main(String[] args) {
		String a = "hello";
		String b = "world";

		// 참조값은 더할 수 없음
		// 그러나 String을 더할 시 concat() 자동으로 해줌
		String result1 = a + b;
		// 연접
		String result2 = a.concat(b);

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

	}
}
