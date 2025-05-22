package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            System.out.print("음식 가격 입력 (-1 입력 시 종료): ");
            int foodPrice = scanner.nextInt();
            
            if (foodPrice == -1) {
                System.out.println("종료");
                break;
            }

            System.out.print("음식 수량 입력:");
            int foodQuntity = scanner.nextInt();
            scanner.nextLine(); // \n 는 읽고 버리기 위해

            int totalPrice = foodPrice * foodQuntity;

            System.out.println(foodQuntity + " 개" + " 총 주문" + "가격은 " + totalPrice);
        }

    }
}
