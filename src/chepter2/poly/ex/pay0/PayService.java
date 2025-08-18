package chepter2.poly.ex.pay0;

public class PayService extends AbstractPayLogic{


	public void processPay(String option, int amount) {

		boolean result;

		System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
			amount);

		// 결제 수단 분류 및 결제
		result = this.result(option, amount);

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}
}