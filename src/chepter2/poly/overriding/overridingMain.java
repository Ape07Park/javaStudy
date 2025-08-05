package chepter2.poly.overriding;

public class overridingMain {

	public static void main(String[] args) {
		// 자식 변수가 자식 인스턴스 참조
		Child child = new Child();
		System.out.println("Child -> Child");
		System.out.println("value = " + child.value);
		child.method();

		// 부모 변수가 부모 인스턴스 참조
		Parent parent = new Parent();
		System.out.println("Parent -> Parent");
		System.out.println("value = " + parent.value);
		parent.method();

		// 부모 변수가 자식 인스턴스 참조
		// TODO 왜 변수는 변수는 overriding x 이고 메서드는 overriding O 되는지 더 자세히 알아보기
		// 정적 바인딩: 컴파일 단계에서 변수는 결정됨
		// 동적 바인딩: 런타임 단계에서 메서드 결정됨
		// 따라서 둘이 다른 것
		Parent poly = new Child();
		System.out.println("Parent -> Child");
		System.out.println("value = " + poly.value); // 변수는 overriding x
		poly.method(); // 메서드는 overriding O

	}
}
