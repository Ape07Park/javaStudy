package chepter4.collection.list.test;

import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {

        List<Integer> students = List.of(90, 80, 70, 60, 50);

        int total = 0;

       for (int student : students) {
           total += student;
       }

        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
