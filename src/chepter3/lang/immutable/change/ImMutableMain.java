package chepter3.lang.immutable.change;

public class ImMutableMain {

	public static void main(String[] args) {

		ImmutableObj obj1 = new ImmutableObj(10);
		// *결과값 반환 필수
		ImmutableObj obj2 = obj1.add(20);

		// 계산 이후 값
		System.out.println("obj1 = " + obj1.getValue());
		System.out.println("obj2 = " + obj2.getValue());
	}
}
