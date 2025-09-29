package chepter2.poly.basic;

/**
 * 다형성 참조: 부모는 자식을 품을 수 있다
 */
public class PolyMain {
	public static void main(String[] args) {
		// 부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod(); // Parent.parentMethod

		// 자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> Child");
		Child child = new Child();
		child.parentMethod(); // Parent.parentMethod
		child.childMethod(); // Child.childMethod

		// 부모 변수가 자식 인스턴스 참조(다형적 참조)
		System.out.println("Parent -> Child");
		Parent poly = (Parent) new Child(); //  (Parent) 불 꺼짐 즉 생략 O
		poly.parentMethod(); // Parent.parentMethod

		// Child child1 = new Parent(); // 자식은 부모를 못 담음

		// 자식의 기능 호출 불가
		// poly.childMethod(); // Parent 타입은 child를 모름 그래서 호출 불가

	}
}
