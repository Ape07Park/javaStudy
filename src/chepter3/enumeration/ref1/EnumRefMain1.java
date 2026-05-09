package chepter3.enumeration.ref1;



public class EnumRefMain1 {

	public static void main(String[] args) {

		int price = 10000;

		DiscountService discountService = new DiscountService();

		int basic = discountService.discount(ClassGrade.BASIC, price);
		int gold = discountService.discount(ClassGrade.GOLD, price);
		int diamond = discountService.discount(ClassGrade.DIAMOND, price);

		System.out.println(basic + ", " + gold + ", " + diamond);
	}
}
