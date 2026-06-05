package chepter3.nested;

public class ShodowingMain {

    public int value = 1;

    class Inner {

        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value); // 나의 instance의 value
            System.out.println("ShodowingMain.value = " + ShodowingMain.this.value); // 나의 instance의 value
        }
    }

    public static void main(String[] args) {
        ShodowingMain main = new ShodowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
