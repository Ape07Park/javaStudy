package chepter4.collection.set.member;

import chepter4.collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        Member member1 = new Member("A");
        Member member2 = new Member("A");

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

        System.out.println("member1.equals(member2) = " + member1.equals(member2));

        set.add(member1);
        set.add(member2);
        System.out.println(set);

        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println(set.contains(searchValue));

    }

}
