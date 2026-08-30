package chepter4.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }

        System.out.println("출력");

        int sum = sum(list);
        System.out.println("sum = " + sum);
        double average = average(list);
        System.out.println("average = " + average);
        


        scanner.close();

    }


    // 합계 메기기

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    private static double average(List<Integer> list) {
        return (double) sum(list) / list.size();
    }


    // 평균 메기기


}
