package chepter1.loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 50;
        int endNum = 100;

        while (i <= endNum) {

            sum = sum + i;
            System.out.println("i= " + i + " sum = " + sum);
            i++;

        }
    }
}