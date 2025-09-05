package chepter3.lang.immutable.address;

public class RefMain2 {

	public static void main(String[] args) {

		ImmutableAddress a = new ImmutableAddress("서울");
		ImmutableAddress b = a; // 참조값 대입은 못 막음

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// b.setValue("부산"); // 불변 객체의 값은 처음 할당 후 변경 불가함
		b = new ImmutableAddress("부산");
		System.out.println("부산 -> b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
