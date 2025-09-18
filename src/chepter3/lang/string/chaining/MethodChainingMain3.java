package chepter3.lang.string.chaining;

public class MethodChainingMain3 {

	public static void main(String[] args) {

		ValueAdder adder = new ValueAdder();

		// 메서드 채이닝 적용
		// 메서드 체이닝이 적용 가능한 이유는 같은 주소값을 반환 받기 때문에 연산이 같은 곳에 적용됨
		// adder.add(1)을 하면 adder의 주소값을 반환 거기서 바로 add(2) 적용하면 같은 인스턴스에 연산이 적용되고 adder의 주소값 반환
		int result = adder.add(1).add(2).add(3).getValue();

		System.out.println("result = " + result);
	}
}
