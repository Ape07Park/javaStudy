package chepter4.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer quentity) {

        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + quentity);

        // if (cartMap.isEmpty()) {
        //     cartMap.put(product, quentity);
        //
        // } else {
        //
        //     // 반복문 돌리기. 상품 내의 name이 일치하면 값만 더하기
        //     Set<Product> set = cartMap.keySet();
        //
        //     for (Product item : set) {
        //
        //         if (item.equals(product)) {
        //             cartMap.replace(item, quentity + cartMap.get(product));
        //         } else {
        //             cartMap.put(product, quentity);
        //         }
        //     }
        // }

    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");

        for(Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량 : " + entry.getValue());
        }

        // Set<Product> set = cartMap.keySet();
        //
        // for (Product itme : set) {
        //
        //     System.out.println("상품 : " + itme + " 수량: " + cartMap.get(itme));
        //
        // }

    }

    public void minus (Product product, Integer minusQuentity) {

        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuentity;

        if ( newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }


        // 반복문 돌리기. 상품 내의 name이 일치하면 값만 더하기
        // Set<Product> set = cartMap.keySet();
        //
        // for (Product itme : set) {
        //
        //     if (itme.equals(product)) {
        //
        //        Integer currentQuentity = cartMap.get(product);
        //        if (currentQuentity >= minusQuentity) {
        //
        //         cartMap.put(itme, currentQuentity - minusQuentity);
        //        } else {
        //            throw new RuntimeException("숫자 다시 지정");
        //        }
        //     }
        // }
    }

    // 코드 작성
}
