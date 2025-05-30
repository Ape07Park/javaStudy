package chepter1.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {

        int totalPrice = 0;
        String productName;
        int productPrice = 0;
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("1은 물건 구매, 2는 결제, 3은 종료");

            int input = scanner.nextInt();

            if (input == 3) {
                System.out.println("end");
                break;
            } else if (input == 2) {
                System.out.println("결제를 시작");
                // 결제 및 출력
                System.out.println(totalPrice);
                // 초기화
                totalPrice = 0;
                System.out.println("cash");
            } else if (input == 1) {
                scanner.nextLine();

                System.out.println("물건 구매를 시작");

                System.out.println("물건 명 입력");

                productName = scanner.nextLine();
                System.out.println("가격을 입력");
                productPrice = scanner.nextInt();

                System.out.println("물건 수량을 입력");
                productCount = scanner.nextInt();

                System.out.println(productName + (productPrice * productCount));

                totalPrice += productPrice * productCount;

            } else {
                System.out.println("올바른 숫자를 입력하시오");
            }

        }


    }
}
