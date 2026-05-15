package chepter3.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        // 날짜 지정
        LocalDate ofDate = LocalDate.of(2021, 1, 1);
        System.out.println(ofDate);

        // 불변이라 반환값 필요
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
