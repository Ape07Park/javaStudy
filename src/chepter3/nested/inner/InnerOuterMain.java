package chepter3.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        // 내부 클래스의 경우 outer 의 주소값을 알아야 함. 이유는 outer의 구성요소 중 하나이기에
        InnerOuter.Inner inner = outer.new Inner(); // 참조값.nwe Inner()
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());

        // outer 참조값.nwe Inner()
        // new InnerOuter().new Inner().print();
    }
}
