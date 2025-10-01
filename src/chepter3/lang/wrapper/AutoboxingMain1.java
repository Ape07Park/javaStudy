package chepter3.lang.wrapper;

public class AutoboxingMain1 {

	public static void main(String[] args) {

		// primitive -> wrapper
		int value = 7;
		// boxing
		Integer boxedVal = Integer.valueOf(value);

		// Wrapper -> primitive
		// unboxing
		int unboxedVal = boxedVal.intValue();

		System.out.println("boxedVal = " + boxedVal);
		System.out.println("intValue = " + unboxedVal);

	}
}
