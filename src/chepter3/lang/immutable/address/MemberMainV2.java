package chepter3.lang.immutable.address;

public class MemberMainV2 {

	public static void main(String[] args) {

		ImmutableAddress address = new ImmutableAddress("서울");

		MemberV2 memberA = new MemberV2("회원A", address);
		MemberV2 memberB = new MemberV2("회원B", address);

		// 회원 a,b 모두 처음 주소는 서울
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);

		// 회원 b 주소 부산으로 변경

		// *한번 할당하면 값 변경 불가니 생성하면서 값 할당
		memberB.setAddress(new ImmutableAddress("부산")); // 주소 객체를 새로 생성
		System.out.println("부산 -> memberB.address");
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);

	}
}
