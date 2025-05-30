package chepter1.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름에 종료를 입력하면 프로그램 종료");
        while (true) {

            System.out.print("이름을 입력:");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("나이 입력:");
            int age = scanner.nextInt(); // 10\n : int라 10만 읽고 \n은 사용자 입력으로 남아있음.
            // 그래서 반복문 다시 돌때 이름은 \n으로 입력한 걸로 인식
            scanner.nextLine(); // \n 는 읽고 버리기 위해

            System.out.println("이름: " + name + " 나이 " + age);

        }
    }
}
