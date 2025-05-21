package scanner.ex;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름에 종료를 입력하면 프로그램 종료");
        while (true) {

            System.out.print("이름을 입력:");
            String name = scanner.nextLine();

            System.out.print("나이 입력:");
            int age = scanner.nextInt();

            if (name.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }
//
//                int sum = num1 + num2;
            System.out.println("이름: " + name + " 나이 " + age);

        }
    }
}
