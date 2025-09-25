package chepter3.lang.wrapper;

public class MyIntegerMethodMain1 {

	public static void main(String[] args) {

		MyInteger value = new MyInteger(10);
		
		// 메서드를 사용해서 비교, 비교 대상에 무조건 자신이 들어가서 자신은 객체의 필드로 이미 들어가 있음
		int i1 = value.compareTo( 5);
		int i2 = value.compareTo( 10);
		int i3 = value.compareTo( 20);

		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}


}
