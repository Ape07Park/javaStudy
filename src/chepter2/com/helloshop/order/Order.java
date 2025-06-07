package chepter2.com.helloshop.order;

import chepter2.com.helloshop.product.Product;
import chepter2.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
