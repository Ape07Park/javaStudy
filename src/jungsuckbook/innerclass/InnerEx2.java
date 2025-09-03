package jungsuckbook.innerclass;

public class InnerEx2 {

	// 인스턴스 클래스
	class InstanceInner { }

	// static 클래스
	static class StaticInner { }

	InstanceInner iv = new InstanceInner();
	StaticInner sv = new StaticInner();

	// static 메서드엔 static이 붙은 거만 접근 가능
	static void staticMethod() {

		// Non-static field 'outerIv' cannot be referenced from a static context
		// InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();

		//  InstanceInner가 InnerEx2에 속한 것이라 InnerEx2 인스턴스 생성하고 그것을 통해 인스턴스 클래스 생성
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}

	void instanceMethod() {

		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();

		// 범위 벗어남
		// LocalInner li = new LocalInner();
	}

	// 지역 클래스는 자기 범위 벗어나면 생성 불가
	void myMethod() {
		class LocalInner { }
		LocalInner lv = new LocalInner();
	}

}
