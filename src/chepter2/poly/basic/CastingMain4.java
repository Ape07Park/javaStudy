package chepter2.poly.basic;

// 다운캐스팅 자동 허용 x 이유
public class CastingMain4 {

	public static void main(String[] args) {
		Parent parent1 = new Child();

		Child child1 = (Child) parent1;
		child1.childMethod(); // 문제 x

		Parent parent2 = new Parent();
		Child child2 = (Child) parent2; // 런타임 에러 - .ClassCastException : class chepter2.poly.basic.Parent cannot be cast to class chepter2.poly.basic.Child
		child2.childMethod(); // 실행 x

	}

}
