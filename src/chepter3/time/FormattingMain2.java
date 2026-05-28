package chepter3.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // formatting : 날짜, 시간 -> 문자

        LocalDateTime now = LocalDateTime.of(2024,12,31,13,30,59); // IOS
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");

        String formatted = now.format(formatter);
        System.out.println(formatted);


        // parsing: 문자 -> 날짜, 시간
        String input = "2030-11-31 13:12:33";
        LocalDateTime parsed = LocalDateTime.parse(input, formatter);
        System.out.println(parsed);

    }
}
