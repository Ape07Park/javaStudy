package chepter3.lang.wrapper;

public class AutoboxingMain2 {

	public static void main(String[] args) {
		
		// auto boxing, auto unboxing: 자바에서 자동으로 기본 -> 래퍼, 래퍼 -> 기본으로 변환해줌. 컴파일 단계에서 변환 메서드를 자바가 자동 추가

		// primitive -> wrapper
		int value = 7;
		// boxing
		Integer boxedVal = value; // auto boxing

		// Wrapper -> primitive
		int unboxedVal = boxedVal; // auto unboxing

		System.out.println("boxedVal = " + boxedVal);
		System.out.println("intValue = " + unboxedVal);

	}
}
