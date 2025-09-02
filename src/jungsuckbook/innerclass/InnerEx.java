package jungsuckbook.innerclass;

public class InnerEx {

	// instance inner class
	class InstanceInner {

	int iv = 100;
	static int cv = 100; // static 변수는 jdk 16부터 허용
	final static int CONST = 100;

	}

	// static inner class
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스는 static 변수 선언 O
	}

	// local class
	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300; //  static 변수는 jdk 16부터 허용
			final static int CONST = 300; // 상수는 허용
		}

		LocalInner li = new LocalInner();
		System.out.println(li.iv);
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

		InnerEx ie = new InnerEx();
		ie.myMethod();
	}


}


