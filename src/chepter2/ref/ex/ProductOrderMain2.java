package chepter2.ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.print("입력할 주문의 개수를 입력하세요:");
        input = scanner.nextInt();

        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[input];

        int stopCount = 0;

       for (int i = 0; i < orders.length; i++) {

            System.out.print( i + 1 +" 번째 상품명을 입력하세요 :");
            String productName = scanner.next();

            System.out.print( i + 1 +" 번째 상품 가격을 입력하세요 :");
            int price = scanner.nextInt();

            System.out.print(  i + 1 +" 번째 상품 개수를 입력하세요 :");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);

        }

        printOrder(orders);

        int sum = sumOrder(orders);

        System.out.println("총 결제 금액 :" + sum);

        scanner.close();

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

