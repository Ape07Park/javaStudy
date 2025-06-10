package chepter2.access.ex;

public class ShoppingCart {

    private final Item[] items = new Item[10];

    private int count;

    private int total;

    public void addItem(Item item) {

        if (count > 10) {
            System.out.println("장바구니가 가득 참");
        } else {
            items[count] = item;
            count++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < count; i++) {
            System.out.println("상품 명 " + items[i].getName() + "합계 :" + items[i].getPrice() * items[i].getCount());
            total += items[i].getPrice() * items[i].getCount();
        }
        System.out.println("전체 가격 합: " + total);
    }

}
