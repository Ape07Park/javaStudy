package jungsuckbook.innerclass;

class Outer {

	// instance inner class
	class InstanceInner {
		int iv = 100;
	}

	// static inner class
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}


	void myMethod() {
		// local inner class
		class LocalInner {
			int lv = 400;
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {

		// 인스턴스 클래스는 결국 Outer에 속해있어서
		// 반드시 Outer를 생성해야 함
		Outer outer = new Outer();
		Outer.InstanceInner ii = outer.new InstanceInner();

		System.out.println( ii.iv);
		System.out.println( Outer.StaticInner.cv);

		// static 클래스는 외부 클래스 생성 x 해도 가능
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.iv);
	}
}
