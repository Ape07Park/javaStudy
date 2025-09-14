package chepter3.lang.string.method;

public class StringUtilsMain2 {

	public static void main(String[] args) {
		int num = 100;
		boolean bool = true;
		String str = "Hello, Java!";

		// format 메서드
		String format1 = String.format("num = %d, bool = %b, str = %s", num, bool, str);
		System.out.println(format1);

		// 소수 2번쨰 자리까지 표현
		String format2 = String.format("num = %.2f" , 10.1234);
		System.out.println(format2);

		// 소수 2번쨰 자리까지 표현
		System.out.printf("num = %.2f\n", 10.1234);

		// matches 메서드
		String regex =  "Hello, (Java!|World!)"; // Hello, 무조건 포함하면서 Java! 거나 World!면 true

		System.out.println("str이 패턴과 일치하는지 = " + str.matches(regex));



	}
}
