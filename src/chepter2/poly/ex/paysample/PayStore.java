package chepter2.poly.ex.paysample;


/**
 * 결재수단을 보관하는 곳
 */
public abstract class PayStore {

	// 변하는 부분
	public static Pay findPay(String option) {

		if (option.equals("kakao")) {
			return new KakaoPay();
		} else if (option.equals("naver")) {
			return new NaverPay();
		} else if (option.equals("toss")) {
			return new TossPay();
		} else {
			return new DefaultPay();

		}
	}
}
