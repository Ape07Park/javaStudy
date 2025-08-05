package chepter2.poly.basic;

// 다운캐스팅 자동 허용 x 이유
public class CastingMain5 {

	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);

		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}

	// 객체를 만든 개발자와 사용하는 개발자가 나누어져 있다고 상정
	private static void call(Parent parent) {
		parent.parentMethod();

		// parent 매개변수가 Child 인스턴스 인지 확인
		if (parent instanceof Child) {
			System.out.println("Child 인스턴스 O");
			Child child = (Child) parent;
			child.childMethod();
		} else {
			System.out.println("Child 인스턴스 x");
		}
	}

}
