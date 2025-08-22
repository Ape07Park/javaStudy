package chepter3.lang.object.equals;

public class EqMainV2 {

	public static void main(String[] args) {
		UserV2 userV1 = new UserV2("id-100");
		UserV2 userV2 = new UserV2("id-100");

		// 동일성
		System.out.println("identity = " + (userV1 == userV2));
		// 동등성(id 같으면 동등한 걸로 함
		System.out.println("equals = " + userV1.equals(userV2));
	}
}
