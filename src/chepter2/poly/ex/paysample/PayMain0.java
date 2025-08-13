package chepter2.poly.ex.paysample;

import java.util.Scanner;

public class PayMain0 {

	public static void main(String[] args) {

		PayService payService = new PayService();

		Scanner scanner = new Scanner(System.in);

		boolean isContinue = true;

		while (true) {

			System.out.print("결재 수단 입력(exit) 입력 시 종료: ");
			String payOption = scanner.next();

			if (payOption.equals("exit")) {
				System.out.println("결제 시스템 종료");
				scanner.close();
				return;
			}

			System.out.print("결재 금액 입력: ");
			int amount = scanner.nextInt();

			payService.processPay(payOption, amount);

		}

		// //kakao 결제
		// String payOption1 = "kakao";
		// int amount1 = 5000;
		// payService.processPay(payOption1, amount1);
		// //naver 결제
		// String payOption2 = "naver";
		// int amount2 = 10000;
		// payService.processPay(payOption2, amount2);
		//
		// //잘못된 결제 수단 선택
		// String payOption3 = "bad";
		// int amount3 = 15000;
		// payService.processPay(payOption3, amount3);
		//
		//
		// //toss 결제
		// String payOption4 = "toss";
		// int amount4 = 40000;
		// payService.processPay(payOption4, amount4);
	}
}
