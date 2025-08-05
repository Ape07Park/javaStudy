package chepter2.poly.basic;

public class CastingMain2 {

	public static void main(String[] args) {

		// 부모 변수가 자식 인스턴스 참조(다형적 참조)
		Parent poly = new Child();

		// 자식의 기능은 호출 불가
		// poly.childMethod();

		// 다운 캐스팅: 부모 -> 자식 으로 타입 다운
		Child child = (Child) poly;
		child.childMethod();

		// 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
		// poly 변수를 Child 타입으로 먼저 변경할려고 괄호 2개 사용. 괄호 없으면 메서드 먼저 실행됨
		// 순간만 사용가능, 위에 보다 코드가 간결해짐
		((Child)poly).childMethod();

	}
}
