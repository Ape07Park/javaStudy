package chepter4.collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {

                list.add(entry.getKey());
            }
        }

        System.out.println(list);

        // 코드 작성

        // int price = 1000;
        //
        // Set<String> keys = map.keySet();
        // List<String> names = new ArrayList<>();
        //
        // keys.forEach(key -> {
        //     int value = map.get(key);
        //
        //     if (value == price) {
        //         names.add(key);
        //
        //     }
        // });

        // System.out.println(names);
    }
}
