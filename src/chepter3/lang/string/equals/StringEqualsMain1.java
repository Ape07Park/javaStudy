package chepter3.lang.string.equals;

public class StringEqualsMain1 {

	public static void main(String[] args) {

		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println("new String() == 비교:  " + (str1 == str2));
		System.out.println("new String() equals 비교 : " + str1.equals(str2));

		String str3 = "hello";
		String str4 = "hello";

		System.out.println("리터럴 == 비교:  " + (str3 == str4));
		System.out.println("리터럴 equals 비교:  " + (str3.equals(str4)));

		// 참조값 동일
		String refValue1 = Integer.toHexString(System.identityHashCode(str3));
		String refValue2 = Integer.toHexString(System.identityHashCode(str4));

		System.out.println(refValue1);
		System.out.println(refValue2);


	}
}
