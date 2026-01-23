package chepter3.nested.nested.test;

public class OuterClass2Main {

	public static void main(String[] args) {

		OuterClass2 oc = new OuterClass2();

		OuterClass2.InnerClass ic = oc.new InnerClass();

		ic.hello();

	}
}
