package chepter3.lang.clazz;

public class ClassCreateMain {
	public static void main(String[] args) throws
		Exception {
		Class clazz = new Hello().getClass();
		System.out.println(clazz.getName());

		// reflection: 클래스 메타 데이터를 통해 메서드 호출 및 인스턴스 생성하는 것
		Hello hello = (Hello)clazz.getDeclaredConstructor().newInstance();

	}
}
