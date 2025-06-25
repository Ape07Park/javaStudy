package chepter2.ref;

public class MethodChange2 {

	public static void main(String[] args) {

		int a = 10;

		System.out.println("메소드 호출 전 : a = " + a);

		changePrimitive(a);

		System.out.println("메소드 호출 전 : a = " + a);

		System.out.println("--------------- 기본형 종료 ---------------");

		Data dataA = new Data();
		dataA.value = 10;

		System.out.println("메소드 호출 전 : dataA.value = " + dataA.value);

		System.out.println(dataA);

		changeReference(dataA);

		System.out.println("메소드 호출 후 : dataA.value = " + dataA.value);

	}

	static void changeReference(Data data) {
		System.out.println(data);
		data.value = 20;
	}

	static void changePrimitive(int x) {
		x = 20;
	}
}
