package chepter4.collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaIterableMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.iterator());

        foreach(list);

        // Iterator<Integer> listIterator = list.iterator();
        // while (listIterator.hasNext()) {
        //     System.out.println( listIterator.next());
        // }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Iterator<Integer> setIterator = list.iterator();
        // while (setIterator.hasNext()) {
        //     System.out.println( setIterator.next());
        // }
        printAll(list.iterator());

        foreach(set);
    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable = " + iterable.getClass());

        // Iterable
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    // private static void foreach(Set<Integer> set) {
    //     // Iterable
    //     for (Integer i : set) {
    //         System.out.println(i);
    //     }
    // }
    //
    // private static void foreach(List<Integer> list) {
    //     // Iterable
    //     for (Integer i : list) {
    //         System.out.println(i);
    //     }
    // }

    private static void printAll(Iterator<Integer> iterator) {

        System.out.println("iterator = " + iterator.getClass());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
