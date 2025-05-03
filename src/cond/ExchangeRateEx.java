package cond;

import java.util.Scanner;

public class ExchangeRateEx {

    public static void main(String[] args) {

        int dollor;
        Scanner scanner = new Scanner(System.in);

        dollor = scanner.nextInt();

        if (dollor < 0) {
            System.out.println("잘못된 금액");
        } else if (dollor == 0) {
            System.out.println("환전 금액 x");
        }  else {
            int won = dollor * 1300;
            System.out.println("환전 금액은 " + won + "입니다");
        }
    }
}
