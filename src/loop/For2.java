package loop;

public class For2 {

    public static void main(String[] args) {
        // 값 누적
        int sum = 0;
        int endNum = 10;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i= " + i + " sum = " + sum);
        }


    }
}
