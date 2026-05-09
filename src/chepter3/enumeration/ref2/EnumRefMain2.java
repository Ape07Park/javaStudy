package chepter3.enumeration.ref2;

import chepter3.enumeration.ex3.DiscountService;
import chepter3.enumeration.ex3.Grade;

public class EnumRefMain2 {

	public static void main(String[] args) {

		int price = 10000;

		DiscountService discountService = new DiscountService();

		int basic = discountService.discount(Grade.BASIC, price);
		int gold = discountService.discount(Grade.GOLD, price);
		int diamond = discountService.discount(Grade.DIAMOND, price);

		System.out.println(basic + ", " + gold + ", " + diamond);
	}
}
