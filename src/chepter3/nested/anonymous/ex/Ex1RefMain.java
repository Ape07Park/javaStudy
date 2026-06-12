package chepter3.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {

    public static void test() {

        // 변하는 부분 시작
        Print print = new Print() {

            @Override
            public void print() {

                System.out.println("프로그램 시작");

                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
                System.out.println("프로그램 종료");
            }
        };

        // 변하는 부분 시작
        Print print2 = new Print() {

            @Override
            public void print() {

                System.out.println("프로그램 시작");

                for (int i = 0; i < 3; i++) {

                    System.out.println("i = " + i);
                }
                System.out.println("프로그램 종료");
            }
        };

        print.print();

        print2.print();

    }

    public static void main(String[] args) {

        // 변하는 부분 시작
        test();

        // Print print = new Print() {
        //
        //     @Override
        //     public void print() {
        //         System.out.println("프로그램 시작");
        //
        //         int randomValue = new Random().nextInt(6) + 1;
        //         System.out.println("주사위 = " + randomValue);
        //
        //         System.out.println("프로그램 종료");
        //
        //         System.out.println();
        //
        //         System.out.println("프로그램 시작");
        //
        //         for (int i = 0; i < 3; i++) {
        //
        //             System.out.println("i = " + i);
        //         }
        //
        //         System.out.println("프로그램 종료");
        //
        //     }
        // };
        //
        // print.print();

    }
}
