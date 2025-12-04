package jungsuckbook.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx2 {

	public static void main(String[] args) {
		LocalDate newYear = LocalDate.parse("2024-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

		LocalDate date = LocalDate.parse("2001-01-01");
		LocalTime time = LocalTime.parse("12:34:56");
		LocalDateTime dt = LocalDateTime.parse("2001-01-01T12:34:56");

		System.out.println(newYear);
		System.out.println(date);
		System.out.println(time);
		System.out.println(dt);

		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		LocalDateTime endOfYear = LocalDateTime.of(2024, 12, 31, 23, 59, 59);

		System.out.println(endOfYear.format(pattern));

		System.out.println(LocalDateTime.parse("2024-12-31 23:59:59", pattern));
	}
}
