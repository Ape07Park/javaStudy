package chepter1.array.ex;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        int totalPrice = 0;

        String[] productNames = new String[10];
        int [] productPrices = new int[10];
        int  productCount = 0;

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("1은 물건 등록, 2는 물건 목록, 3은 종료");


            System.out.print("메뉴 선택: ");
            int input = scanner.nextInt();

            if (input == 3) {
                System.out.println("end");
                break;
            } else if (input == 2) {
                // 물건 목록 출력
                System.out.println("물건 목록 출력");

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " " + productPrices[i]);
                }

            } else if (input == 1) {

                if (productCount >= 10) {
                    System.out.println("물건 등록 불가");
                    continue;
                }

                scanner.nextLine();

                System.out.println("물건 등록을 시작");

                System.out.print("물건 명 입력 :");

                String productName = scanner.nextLine();

                System.out.println();

                productNames[productCount] = productName;

                System.out.print("물건 가격을 입력 :");

                int productPrice = scanner.nextInt();

                productPrices[productCount] = productPrice;

                productCount++;

            } else {
                System.out.println("올바른 숫자를 입력하시오");
            }

        }


    }
}
