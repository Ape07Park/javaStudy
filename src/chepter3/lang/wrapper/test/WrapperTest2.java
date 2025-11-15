package chepter3.lang.wrapper.test;

public class WrapperTest2 {

	public static void main(String[] args) {
		String[] arr = {"1.5", "2.5", "3.0"};

		double sum = 0;

		for (String str : arr) {
			double num = Double.parseDouble(str);
			sum += num;
		}

		System.out.println("sum = " + sum);
	}
}
