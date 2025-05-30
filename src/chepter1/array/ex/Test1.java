package chepter1.array.ex;

public class Test1 {

    public static void main(String[] args) {

        int total = 0;
        int [] arr = new int[5];

        arr[0] = 90;
        arr[1] = 80;
        arr[2] = 70;
        arr[3] = 60;
        arr[4] = 50;

        for(int score : arr) {
            System.out.println(score);
            total += score;
        }


        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);


    }
}
