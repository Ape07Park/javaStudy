package chepter4.collection.map.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
            {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();
        // 주어진 배열로부터 Map 생성 - 코드 작성

        for (int i = 0; i < productArr.length; i++) {

            String key = productArr[i][0];
            Integer value = Integer.valueOf(productArr[i][1]);

            map.put(key, value);

        }

        // Map의 모든 데이터 출력 - 코드 작성
        Set<String> keys = map.keySet();

        keys.forEach(v -> {
            System.out.println("제품: " + v + " 가격 : " + map.get(v));
        });

    }
}
