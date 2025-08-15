package chepter2.poly.ex.pay0;

public abstract class AbstractPayLogic {

	// Pay를 받아서 pay 메서드 실행

	public boolean result(String option, int amount) {

		switch (option) {
			case "kakao" -> {
				Pay kakaoPay = new KakaoPay();
				return kakaoPay.pay(amount);
			}
			case "naver" -> {
				NaverPay naverPay = new NaverPay();
				return naverPay.pay(amount);

			}
			case "toss" -> {
				Pay tossPay = new TossPay();
				return tossPay.pay(amount);

			}

			case "cupang" -> {
				Pay cupangPay = new CupangPay();
				return cupangPay.pay(amount);

			}
			default -> {
				return new DefaultPay().pay(amount);
			}
		}
	}

}
