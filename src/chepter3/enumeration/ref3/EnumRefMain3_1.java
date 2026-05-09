package chepter3.enumeration.ref3;

import chepter3.enumeration.ex3.DiscountService;
import chepter3.enumeration.ex3.Grade;

public class EnumRefMain3_1 {


    public static void main(String[] args) {

        int price = 10000;

        chepter3.enumeration.ex3.DiscountService discountService = new DiscountService();

        int basic = discountService.discount(chepter3.enumeration.ex3.Grade.BASIC, price);
        int gold = discountService.discount(chepter3.enumeration.ex3.Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println(basic + ", " + gold + ", " + diamond);
    }
}
