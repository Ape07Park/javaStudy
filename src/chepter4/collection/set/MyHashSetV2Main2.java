package chepter4.collection.set;

import chepter4.collection.set.member.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("\"hi\".hashCode() = " + "hi".hashCode());
        System.out.println("\"JPA\".hashCode() = " + "JPA".hashCode());
        System.out.println("\"java\".hashCode() = " + "java".hashCode());
        System.out.println("\"spring\".hashCode() = " + "spring".hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);

        System.out.println(set);

        Member searchValue = new Member("JPA");

        // 검색
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("set.remove(" + searchValue + ") = " + removeResult);
        System.out.println(set);

    }
}
