package chepter3.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        // formatting : 날짜 -> 문자
        LocalDate date = LocalDate.of(2024,12,31); // ISO 표준
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        // parsing: 문자 -> 날짜
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println(parsedDate);

    }
}
