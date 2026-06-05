package chepter3.nested.local;

public class LocalOuterV1 {

    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVar); // 지역변수 접근 O
                System.out.println("paramVar = " + paramVar); // 매개변수도 지역 변수의 한 종류
                System.out.println("outInstanceValue = " + outInstanceValue); // 바깥 클래스의 인스턴스 소속이기에 접근 O
            }
        }

        // 지역 클래스 생성
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 outer = new LocalOuterV1();
        outer.process(2);
    }
}
