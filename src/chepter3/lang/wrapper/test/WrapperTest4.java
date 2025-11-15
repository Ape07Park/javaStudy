package chepter3.lang.wrapper.test;

public class WrapperTest4 {

	public static void main(String[] args) {

		String str = "100";

		Integer val1 = Integer.valueOf(str);

		int i = val1;

		Integer num2 = i;

		System.out.println(val1);
		System.out.println(i);
		System.out.println(num2);

	}
}
