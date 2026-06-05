package chepter3.nested.local;

public class LocalOuterV3 {

    private int outInstanceValue = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스 변수는 지역 변수보다 더 오래 생존
                System.out.println("localVal = " + localVar); // 지역변수 접근 O
                System.out.println("paramVar = " + paramVar); // 매개변수도 지역 변수의 한 종류
                System.out.println("outInstanceValue = " + outInstanceValue); // 바깥 클래스의 인스턴스 소속이기에 접근 O
            }
        }

        // 지역 클래스 생성
        LocalPrinter localPrinter = new LocalPrinter();
        // localPrinter.print() 를 여기서 실행하지 않고 Printer 인스턴스만 반환
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 outer = new LocalOuterV3();
        Printer printer = outer.process(2);
        //  printer.print() 를 나중에 실행. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }
}
