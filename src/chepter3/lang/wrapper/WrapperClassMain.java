package chepter3.lang.wrapper;

public class WrapperClassMain {

	public static void main(String[] args) {
		Integer newInteger = new Integer(100);

		// 항상 -128 ~ 127의 범위의 값을 포함
		// 팩토리 메서드: 객체를 생성해 반환하는 메서드
		Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변

		Long longObj = Long.valueOf(100);

		Double doubleObj = Double.valueOf(100.1);

		System.out.println("integerObj = " + integerObj);
		System.out.println("longObj = " + longObj);
		System.out.println("doubleObj = " + doubleObj);

		System.out.println("내부 값 읽기");

		int intVal = integerObj.intValue();
		long longVal = longObj.longValue();
		double doubleVal = doubleObj.doubleValue();

		System.out.println("intVal = " + intVal);
		System.out.println("longVal = " + longVal);
		System.out.println("doubleVal = " + doubleVal);

		System.out.println("비교");
		System.out.println("== : " + (newInteger == integerObj)); // 주소값 비교
		System.out.println("equals : " + newInteger.equals(integerObj)); // 값만 비교
	}
}
