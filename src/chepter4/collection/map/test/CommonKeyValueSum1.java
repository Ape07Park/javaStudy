package chepter4.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C" , 3);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성

        Set<String> keys1 = map1.keySet();
        Set<String> keys2 = map2.keySet();

        Map<String, Integer> cross = new HashMap<>();

        keys1.forEach(key ->{

            if (keys2.contains(key)){
                cross.put(key, map1.get(key) + map2.get(key));
            }

        });

        System.out.println(cross);
    }
}
