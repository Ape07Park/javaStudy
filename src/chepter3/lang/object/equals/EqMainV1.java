package chepter3.lang.object.equals;

public class EqMainV1 {

	public static void main(String[] args) {
		UserV1 userV1 = new UserV1("id-100");
		UserV1 userV2 = new UserV1("id-100");

		// 동일성: 참조값이 달라서 false
		System.out.println("identity = " + (userV1 == userV2));
		// 동등성: Object가 제공하는 equals()를 사용해서 동일성 비교로 바뀜
		// 내가 원하는 비교를 할려면  equals() override 해야함
		/**
		 * this(user1) == obj(user2)
		 */
		System.out.println("equality = " + (userV1.equals(userV2)));
	}
}
