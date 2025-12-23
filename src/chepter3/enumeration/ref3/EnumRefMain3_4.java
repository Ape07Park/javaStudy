package chepter3.enumeration.ref3;

import chepter3.enumeration.ex2.DiscountService;

public class EnumRefMain3_4 {

	public static void main(String[] args) {
		int price = 10000;
		Grade[] grades = Grade.values();
		for (Grade grade : grades) {
			printDiscount(grade, price);
		}

	}

	private static void printDiscount(Grade grade, int price) {
		System.out.println("등급 이름 : " + grade.name() + " 등릅의 할인 금액: " + grade.discount(price));
	}
}
