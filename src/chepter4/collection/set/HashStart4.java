package chepter4.collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        // [null, 1, 2, null, null, 5, null, null, 8, ..., 14, ..., 99]

        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArr = new Integer[CAPACITY];
        add(inputArr, 1);
        add(inputArr, 2);
        add(inputArr, 5);
        add(inputArr, 8);
        add(inputArr, 14);
        add(inputArr, 99);

        System.out.println("inputArr = " + Arrays.toString(inputArr));

        // 검색: 검색 시에도 hash index로 구함
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArr[hashIndex];
        System.out.println("result = " + result);

    }

    private static void add(Integer[] inputArr, int value) {
        int hashIndex = hashIndex(value);
        inputArr[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
