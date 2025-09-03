package jungsuckbook.innerclass.ex;


class Outer {
	static class Inner {
		int iv = 100;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		System.out.println(inner.iv);
	}


}
