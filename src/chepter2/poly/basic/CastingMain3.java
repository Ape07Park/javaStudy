package chepter2.poly.basic;

// upcasting vs downcasting
public class CastingMain3 {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent1 = (Parent) child; // 업캐스팅은 생략할 것. 이유는 자주 쓰기 때문 ArrayList를 List에 담아 쓰는 거처럼
		Parent parent2 = child; // 업캐스팅 생략

		parent1.parentMethod();
		parent2.parentMethod();

	}

}
