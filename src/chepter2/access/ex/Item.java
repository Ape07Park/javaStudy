package chepter2.access.ex;

public class Item {

    private final String name;
    private final int price;
    private final int count;

    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    // 자기 데이터를 자기가 사용해서 특정 기능(메소드)을 만드는 것이 객체지향적임
    // 속성과 기능이 근처에 있는 것을 쓰는 것이 좋은 객체지향적 코드
    // 이유는 이 파일만 수정하면 돼서.
    public int getTotalPrice() {
        return price * count;
    }

    /*
    Item 클래스에 getTotalPrice() 메서드를 만드는 것이 더 캡슐화 원칙을 잘 지키고, 객체지향적으로 더 적절

이유 설명:
책임 분리 (SRP, Single Responsibility Principle)
Item이 자신의 총 가격(price * count)을 계산하는 책임을 가지는 것이 자연스럽습니다.
외부(ShoppingCart)에서 price와 count를 가져와서 계산하는 것은 캡슐화를 깨뜨립니다.

캡슐화 (Encapsulation)
내부 데이터(price, count)는 외부에서 직접 꺼내와 계산하기보단, Item 내부에서 계산해서 결과를 넘겨주는 게 맞습니다.
이렇게 하면 만약 Item의 내부 계산 방식이 바뀌어도(할인 적용 등) 외부(ShoppingCart)는 변경할 필요가 없습니다.
     */
}
