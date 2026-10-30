package chepter4.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======== 단어 입력 단계========= ");

        Map<String, String> map = new HashMap<>();

        while (true) {

            System.out.print("영어 단어를 입력하세요 (종료는 q): ");

            String key = scanner.nextLine();

            if (key.equals("q")) {
                break;
            }

            System.out.print("한글 뜻를 입력하세요 (종료는 q): ");

            String value = scanner.nextLine();

            if (value.equals("q")) {
                break;
            }

            if (!key.isEmpty() && !value.isEmpty()) {
                map.put(key, value);
            }
        }

        System.out.println(map);

        System.out.println("======== 단어 검색 단계========= ");

        while (true) {

            System.out.print("찾을 영어 단어를 입력하세요 (종료는 q): ");

            String sentence = scanner.nextLine();

            if (sentence.equals("q")) {
                break;
            }

            if (map.containsKey(sentence)) {
            System.out.println(sentence + " 의 뜻 :" +map.get(sentence) );

            } else {
                System.out.println("존재하지 않습니다. 다시 입력");
            }



        }


    }

}
