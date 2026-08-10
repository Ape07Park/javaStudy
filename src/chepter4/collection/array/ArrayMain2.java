package chepter4.collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        // 배열의 첫번째 위치를 index로 바로 찾을 수 있어서 빠른 연산임
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n/2) or O(n)");

        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;

        addAtIndex(arr, index, value);
        
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int newValue) {

        // 한칸씩 오른쪽으로 이동시킴
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue;


    }

    private static void addFirst(int[] arr, int newValue) {
        // 한칸씩 오른쪽으로 이동시킴
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
