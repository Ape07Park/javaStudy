package chepter1.loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        int max = 10;

        while (count <= max) {
            System.out.println(count);
            sum += count;
            System.out.println(sum);
            count++;
        }

        System.out.println("while 끝");

        sum = 0;

        for (int i = 1; i <=max; i++) {
            System.out.println(i);
            sum += i;
            System.out.println(sum);
        }

    }
}
