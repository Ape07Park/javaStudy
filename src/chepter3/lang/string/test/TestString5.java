package chepter3.lang.string.test;

public class TestString5 {

	public static void main(String[] args) {

		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";

		int count = 0;

		for (String s : str.split(",")) {
			System.out.println(s);

			if (s.indexOf(key) != -1) {
				count++;
			}
			System.out.println(count);
		}

		System.out.println(count);

	}
}



