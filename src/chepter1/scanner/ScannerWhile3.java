package chepter1.scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("정수를 입력하세요. 단 0을 입력하면 프로그램 종료");
        while (true) {

            System.out.print("숫자 입력:");
            int num = scanner.nextInt();

            if (num == 0 ) {
                System.out.println("프로그램 종료");
                break;
            }

            sum += num;
            System.out.println("숫자의 합: " + sum);
        }
    }
}
