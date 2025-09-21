package chepter3.lang.string.test;

public class TestString2 {

	public static void main(String[] args) {

		int count = 0;

		String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

		// 코드 작성
		for (String str : arr) {
			count += str.length();
			System.out.println(str + " : " + str.length());
		}

		System.out.println("count = " + count);


	}
}


