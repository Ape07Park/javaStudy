package chepter2.com.helloshop.order;

import chepter2.com.helloshop.product.Product;
import chepter2.com.helloshop.user.User;

public class OrderService {

    public void order() {

        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
