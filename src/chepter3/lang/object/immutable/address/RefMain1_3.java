package chepter3.lang.object.immutable.address;

public class RefMain1_3 {

	public static void main(String[] args) {
		Address a = new Address("서울");
		Address b = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// 사이드 이펙트 발생(주소값 공유에 따라 발생). 같은 a,b 모두 같은 주소를 보고 있어서 객체의 필드 변경 시 a,b 모두 영향 받음
		change(b, "부산");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	private static void change(Address address, String changeAddress) {
		System.out.println("changeAddress -> " + changeAddress);
		address.setValue(changeAddress);
	}
}
