package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름 입력:");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격 입력:");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량 입력:");
        int foodQuntity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuntity;

        System.out.println(foodName + " " + foodQuntity + " 개" + " 총 주문" + "가격은 " + totalPrice);
    }
}
