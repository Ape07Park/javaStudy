package chepter4.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        // 코드 작성


        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words){
            Integer count = map.get(word);

            // 카운트가 없으면 0으로 세팅
            if (count == null) {
                count = 0;
            }

            count++;
            map.put(word, count);

        }



        // 뛰어져 있는 거 기준으로 카운트 해서 넣기

        // List<String> list = Arrays.asList(text.split(" "));
        // System.out.println(list);
        //
        // // 반복문 돌면서 겹치는 거 카운트 저장 후 key, value로 해서 저장
        //
        // Set<String> set = Set.of("orange", "banana", "apple");
        //
        //
        // for (String key : set) {
        //     int value = 0;
        //
        //     for (String element : list) {
        //         if (Objects.equals(key, element)) {
        //             value += 1;
        //         }
        //
        //     }
        //     map.put(key,value);
        //
        // }
        //
        // System.out.println(map);




    }
}
