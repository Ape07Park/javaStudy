package chepter2.poly.ex.paysample;

public class PayService {

	public void processPay(String option, int amount) {

		System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
			amount);

		/**
		 * 리팩토링 중간 중간 코드가 원하는 결과가 나오는지 확인할 것
		 *
		 * 페이 서비스는 현재 카카오 페이나 네이버 페이 같은 페이에 직접적으로 의존 따라서 다형성으로 풀 것
		 * 결제 수단 찾아서 선택 및 결제수단 pay 실행코드 중복
		 * 따라서 중복 수행하는 부분을 여러 개로 쪼개서 각 메서드로 만듦
		 * ex) 결제수단 찾기 및 선택 메서드와 결제수단 페이 메서드로 구분
		 */

		// Pay pay;

		// 결재수단 선택
		// 결제수단 선택이 하나의 덩어리임 따라서 메서드로 만들기
		// if (option.equals("kakao")) {
		// 	 pay = new KakaoPay();
		// } else if (option.equals("naver")) {
		// 	 pay = new NaverPay();
		// } else {
		// 	pay = null;
		// 	System.out.println("결제 수단이 없습니다.");
		// 	result = false;
		// }

		// 결재 수단 찾기

		// TODO 카카오페이, 네이버페이 그런 건 모르고 역할만 알고 있음 즉 Pay라는 역할에만 의존
		// PayStore가 서버 역할이고 service단은 클라이언트임
		Pay pay = PayStore.findPay(option);

		// null로 넘어오는 것이 불편
		// null 체크 등 귀찮음
		// 따라서 null Object pattern 사용: 결재수단이 없는 것도 하나의 객체로 생성


		// 결제하기
		boolean result = pay.pay(amount);

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}

	/**
	 * 결재수단을 넣으면 service 코드 변경 생김
	 * 그래서 PayStore 생성함
	 */

	// public  Pay findPay(String option) {
	//
	// 	if (option.equals("kakao")) {
	// 		return new KakaoPay();
	// 	} else if (option.equals("naver")) {
	// 		return new NaverPay();
	// 	} else {
	// 		System.out.println("결제 수단이 없습니다.");
	// 		return null;
	//
	// 	}
	// }

}
