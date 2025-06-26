package chepter2.extends1.access.child;

import chepter2.extends1.access.parent.Parent;

public class Child extends Parent {

	public void call() {
		// 상속으로 인해 부모 필드 사용 O

		publicValue = 1;
		protectedValue = 1; // 상속 OR 같은 페키지

		// defaultValue = 1; 다른 패키지 접근 x
		// privateValue = 1; 접근 불가, 컴파일 오류

		publicMethod();
		protectedMethod(); // 상속 관계 or 같은 패키지
		// defaultMethod(); 다른 패키지 접근 불가
		// privateMethod(); 접근 불가

		printParent();


	}
}
