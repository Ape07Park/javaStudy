package chepter3.lang.object.immutable;

public class RefMain1_1 {

	public static void main(String[] args) {
		Address a = new Address("서울");
		Address b = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		b.setValue("부산");
		System.out.println("부산 -> b");
		// 사이드 이펙트 발생(주소값 공유에 따라 발생). 같은 a,b 모두 같은 주소를 보고 있어서 객체의 필드 변경 시 a,b 모두 영향 받음
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
