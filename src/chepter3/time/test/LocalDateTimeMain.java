package chepter3.time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();

        // 지정
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println(nowDt);
        System.out.println(ofDt);

        // LocalDateTime은 LocalDate와 LocalTime을 결합 따라서 각 부분만 return
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);

        // 날짜, 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        // 불변 계산이라 return 값 받아서 변수에 저장
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println(ofDtPlus);

        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println(ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt));

        // 시간적으로 같은지 여부 판별
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 같은가? " + nowDt.isEqual(ofDt));

    }
}
