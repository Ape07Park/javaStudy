package chepter3.enumeration.ref1;

public class ClassGrade {

	public static final ClassGrade BASIC = new ClassGrade(10);
	public static final ClassGrade GOLD = new ClassGrade(20);
	public static final ClassGrade DIAMOND = new ClassGrade(30);


	private final int discountPercent;

	// 외부에서 생성자 사용 차단
	private ClassGrade(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

}
