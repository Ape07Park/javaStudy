package chepter2.ref.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = createOrder("두부", 2000, 2);

        orders[0] = order1;

        ProductOrder order2 = createOrder("김치", 5000, 1);


        orders[1] = order2;

        ProductOrder order3 = createOrder("콜라", 1500, 2);

        orders[2] = order3;

        printOrder(orders);

        int sum = sumOrder(orders);

        System.out.println("총 결제 금액 :" + sum);
    }

    // 주문 합계
    public static int sumOrder(ProductOrder[] orders) {

        int sum = 0;

        for (ProductOrder order : orders) {


            sum += order.price * order.quantity;
        }

        return sum;
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {

        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    public static void printOrder(ProductOrder[] orders) {

        for (ProductOrder order : orders) {
            System.out.println(order.productName + " " + order.quantity + " " + order.price);
        }
    }
}

