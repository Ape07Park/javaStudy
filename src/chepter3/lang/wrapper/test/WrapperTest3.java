package chepter3.lang.wrapper.test;

public class WrapperTest3 {

	public static void main(String[] args) {

		String str = "100";

		Integer num = Integer.valueOf(str);

		int i = num.intValue();

		Integer num2 = Integer.valueOf(i);

		System.out.println(num);
		System.out.println(i);
		System.out.println(num2);

	}
}
