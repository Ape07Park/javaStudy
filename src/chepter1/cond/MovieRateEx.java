package chepter1.cond;

import java.util.Scanner;

public class MovieRateEx {
    public static void main(String[] args) {

        String a = "어바웃 타임을 추천합니다";
        String b = "토이 스토리를 추천합니다";
        String c = "고질라를 추천합니다";

        double rate;
        Scanner scanner = new Scanner(System.in);

        rate = scanner.nextDouble();

        if (rate <= 9.0) {
            System.out.println(a);
        }

        if (rate <= 8.0) {
            System.out.println(b);
        }

        if (rate <= 7.0) {
            System.out.println(c);
        }

    }
}
