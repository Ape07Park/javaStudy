package jungsuckbook.innerclass.ex;

public class Ex1 {

	public class Inner {
		int i = 10;
	}

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		Ex1.Inner inner = ex1.new Inner();
		System.out.println(inner.i);
	}
}
