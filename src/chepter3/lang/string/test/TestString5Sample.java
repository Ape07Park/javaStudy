package chepter3.lang.string.test;

public class TestString5Sample {

	public static void main(String[] args) {

		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";

		int count = 0;

		int index = str.indexOf(key);
		System.out.println("index = " + index);


		// 6, 18, 32라 3번 도는 거
		while (index >= 0) {

			// 인덱스 갱신
			index = str.indexOf(key, index + 1);
			System.out.println("index = " + index);
			count++;
		}

		System.out.println("count = " + count);

	}
}



