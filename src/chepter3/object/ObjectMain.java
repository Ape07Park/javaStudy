package chepter3.object;

public class ObjectMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.childMethod();
		child.parentMethod();

		// toString()은 Object 클래스의 메서드. 상속관계 가 child -> parent -> Object 라 child가 Object의 toString() 사용 가능
		String string = child.toString(); // 객체의 정보 제공
		System.out.println(string);
	}
}
