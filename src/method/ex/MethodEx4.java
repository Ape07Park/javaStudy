package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {

        int balance = 0;

        int depositAmount = 0;

        int withdrawAmount = 0;


        int select = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("------------------------" +
                    "1.입금 | 2.출금 | 3.잔액 확인 | 4.종료" +
                    "------------------------");

            System.out.print("select : ");

            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    depositAmount = scanner.nextInt();

                    balance = deposit(balance, depositAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    withdrawAmount = scanner.nextInt();

                   balance = withdraw(balance, withdrawAmount);
                    break;
                case 3:
                    System.out.println("현재 잔액 :" + balance);
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    // main 메소드에서 탈출
                   return;

                   default:
                       System.out.println("잘못된 선택 입니다");
            }
        }


    }

    public static int deposit(int balance, int depositAmount) {

        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {

        if (balance >= withdrawAmount) {

            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " +
                    balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니 다.");
        }
        System.out.println("최종 잔액: " + balance + "원");

        return balance;
    }
}
