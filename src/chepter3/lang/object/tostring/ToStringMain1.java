package chepter3.lang.object.tostring;

public class ToStringMain1 {

	public static void main(String[] args) {
		Object obj = new Object();
		String string = obj.toString();

		// toString() 반환값 출력
		System.out.println(string);

		// obj 직접 출력
		System.out.println(obj);
	}
}
