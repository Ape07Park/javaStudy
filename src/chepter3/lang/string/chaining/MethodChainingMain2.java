package chepter3.lang.string.chaining;

public class MethodChainingMain2 {

	public static void main(String[] args) {

		/**
		 * 변수명만 다르지 adder, adder1, adder2, adder3이 참조하는 곳은 모두 동일
		 * 이유는 add()가 더하고 인스턴스의 참조값을 반환하기 때문
		 */

		ValueAdder adder = new ValueAdder();

		// adder의 주소값을 adder1에 할당
		ValueAdder adder1 = adder.add(1);

		// adder1의 주소값(adder 주소값임)을 adder2에 할당
		ValueAdder adder2 = adder1.add(1);

		ValueAdder adder3 = adder2.add(1);

		int result = adder3.getValue();

		System.out.println("result = " + result);
	}
}
