package chepter4.collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> immutableList = List.of(1, 2, 3);

        // 가변 리스트로 전환
        ArrayList<Integer> mutableList = new ArrayList<>(immutableList);
        mutableList.add(4);

        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        // 불변 리스트로 생성
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());

        // UnsupportedOperationException
        // unmodifiableList.add(4);
    }
}
