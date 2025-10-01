package chepter3.lang.wrapper;

public class WrapperUtilsMain {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10); // 숫자 래퍼 객체 반환
		Integer i2 = Integer.valueOf("10"); // 문자열을 숫자로 변환해 래퍼 객체로 반환

		int intValue = Integer.parseInt("10"); // 문자열을 int 형으로 변환해서 반환

		// 비교
		int compareResult = i1.compareTo(20);
		int compareResult2 = Integer.compare(i1, i2);

		System.out.println("compareResult = " + compareResult); // i1이 20보다 작아서 -1
		System.out.println("compareResult2 = " + compareResult2); // 같아서 0
	}
}
