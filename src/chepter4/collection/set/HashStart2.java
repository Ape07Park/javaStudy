package chepter4.collection.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        // 입력: 1, 2, 5, 8
        // [null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArr = new Integer[10];
        inputArr[1] = 1;
        inputArr[2] = 2;
        inputArr[5] = 5;
        inputArr[8] = 8;
        System.out.println("inputArr = " + Arrays.toString(inputArr));

        int searchValue = 8;
        Integer result = inputArr[searchValue]; // O(1)
        System.out.println("result = " + result);

    }
}
