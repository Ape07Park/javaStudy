package chepter3.enumeration.ref3;

public enum Grade {

	BASIC(10),
	GOLD(20),
	DIAMOND(30);

	private final int discountPercent;

	Grade(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}
	
	// 할인율 계산을 위해 필드 discountPercent가 외부로 노출되는 건 객체지향 x
	// 따라서 캡슐화 원칙에 따라 스스로 할인율 계산 후 값만 리턴
	public int discount(int price) {
		return price * (discountPercent / 100);
	}
}
