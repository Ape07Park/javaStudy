package chepter3.enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        // 없는 등급
        DiscountService discountService = new DiscountService();
        int vip = discountService.discount("VIP", price);

        System.out.println("VIP : " + vip );

        // 오타
        int diamond = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD : " + diamond);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold : " + gold);
    }
}
