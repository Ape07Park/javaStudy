package chepter3.time.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

	public static void main(String[] args) {

		LocalDateTime seoulDateTime = LocalDateTime.of(2020, Month.JANUARY, 1, 9, 0, 0);

		ZonedDateTime seoulZonedDateTime = ZonedDateTime.of(seoulDateTime, ZoneId.of("Asia/Seoul"));
		ZonedDateTime londonZonedDateTime = ZonedDateTime.of(seoulDateTime, ZoneId.of("Europe/London"));
		ZonedDateTime newyorkZonedDateTime = ZonedDateTime.of(seoulDateTime, ZoneId.of("America/New_York"));

		System.out.println(seoulZonedDateTime);
		System.out.println(londonZonedDateTime);
		System.out.println(newyorkZonedDateTime);

	}
}
