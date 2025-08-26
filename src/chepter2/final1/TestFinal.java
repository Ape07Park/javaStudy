package chepter2.final1;

public class TestFinal {

	final int value = 10;
	final int value2;
	static final int TEST_VALUE = 30;

	TestFinal() {
		value2 = 20;
	}

	public static void main(String[] args) {
		TestFinal testFinal = new TestFinal();
		System.out.println(testFinal.value);
	}
}
