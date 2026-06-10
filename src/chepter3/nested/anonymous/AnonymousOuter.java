package chepter3.nested.anonymous;

import chepter2.access.a.Test;
import chepter3.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // class LocalPrinter implements Printer {
        //     int value = 0;
        //
        //     @Override
        //     public void print() {
        //         System.out.println("value = " + value);
        //         System.out.println("localVal = " + localVar); // 지역변수 접근 O
        //         System.out.println("paramVar = " + paramVar); // 매개변수도 지역 변수의 한 종류
        //         System.out.println("outInstanceValue = " + outInstanceValue); // 바깥 클래스의 인스턴스 소속이기에 접근 O
        //     }
        // }
        //
        // // 지역 클래스 생성
        // LocalPrinter localPrinter = new LocalPrinter();

        Printer printer = new Printer() {

            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVar); // 지역변수 접근 O
                System.out.println("paramVar = " + paramVar); // 매개변수도 지역 변수의 한 종류
                System.out.println("outInstanceValue = " + outInstanceValue); // 바깥 클래스의 인스턴스 소속이기에 접근 O
            }
        };

        printer.print();

        // localPrinter.print();
        System.out.println("printer.getClass() = " + printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
