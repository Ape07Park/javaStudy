package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {



        int totalPrice = 0;
        String productName;
        int productPrice = 0;
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("test");

        while (true){
            scanner.next();
            int input = scanner.nextInt();


            if (input == 3){
                System.out.println("end");
                break;
            } else if (input == 2) {
                // 결제 및 출력
                System.out.println(totalPrice);
                // 초기화
                totalPrice = 0;
                System.out.println("cash");
            } else if (input == 1) {

                String inputProductName = scanner.next();
                int inputProductPrice = scanner.nextInt();
                int inputProductCount = scanner.nextInt();
                scanner.next();

                productName = inputProductName;
                productPrice = inputProductPrice;
                productCount = inputProductCount;

                System.out.println(productPrice * productCount);

                totalPrice += productPrice * productCount;

            }
        }



    }
}
