package jungsuckbook.innerclass;

public class InnerEx6 {

	/**
	 * 익명 클래스
	 */

	Object iv = new Object() {
		void method() {}
	};

	static Object cv = new Object() {
		void method() {}
	};

	void myMethod() {
		Object lv = new Object() {
			void method() {}
		};
	}


}
