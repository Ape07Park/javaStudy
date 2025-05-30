package chepter1.scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("첫 숫자 입력:");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자 입력:");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            int[] arr = checkNum(num1, num2);

            int smaller = arr[0];
            int bigger = arr[1];

            // 사이 숫자 출력
            // 두 숫자 사이의 모든 정수:2,3,4

            // TODO for문으로도 해보기
            while (smaller <= bigger) {

                if (smaller == bigger) {
                    System.out.print(smaller);
                } else {
                    System.out.print(smaller + "," + " ");
                }
                smaller++;
            }
            System.out.println();
            System.out.println("다시 숫자 입력");

        }
    }

    public static int[] checkNum(int num1, int num2) {

        int[] arr = new int[2];

        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        arr[0] = num1;
        arr[1] = num2;

        System.out.println("checkNum : "+"num1 : " + arr[0] + " num2 : " + arr[1]);

        return arr;
    }
}
