package chepter4.collection.set;

import chepter4.collection.set.member.Member;

public class MyHashSetV3Main {

    public static void main(String[] args) {

        MySet<String> set = new MyHashSetV3<>(10);

        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        String searchValue ="A";

        // 검색
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("set.remove(" + searchValue + ") = " + removeResult);
        System.out.println(set);

    }
}
