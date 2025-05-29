package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int sum = add(a, b, c);
        double average = average(sum);

        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;
        sum = add(x, y, z);
        average = average(sum);
        System.out.println("평균값: " + average);
    }

    public static int add(int a, int b, int c) {

        return a + b + c;
    }

    public static double average(double sum) {

        return sum / 3;
    }
}
