package chepter4.collection.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        // [null, 1, 2, null, null, 5, null, null, 8, ..., 14, ..., 99]
        Integer[] inputArr = new Integer[100];
        inputArr[1] = 1;
        inputArr[2] = 2;
        inputArr[5] = 5;
        inputArr[8] = 8;
        inputArr[14] = 14;
        inputArr[99] = 99;

        System.out.println("inputArr = " + Arrays.toString(inputArr));

        int searchValue = 99;
        Integer result = inputArr[searchValue]; // O(1)
        System.out.println("result = " + result);

    }
}
