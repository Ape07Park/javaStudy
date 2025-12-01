package jungsuckbook.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class NewTimeEx2 {

	public static void main(String[] args) {


		LocalDate date = LocalDate.of(2024,12,31);
		LocalTime time = LocalTime.of(12,34,56);

		LocalDateTime dt = LocalDateTime.of(date, time);

		System.out.println(dt);
		System.out.println(dt.plus(1, ChronoUnit.DAYS));

		ZoneId systemDefaultZid = ZoneId.systemDefault();
		System.out.println(dt.atZone(systemDefaultZid)); // 2024-12-31T12:34:56+09:00[Asia/Seoul]

		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
		System.out.println(zdt); // 2024-12-31T12:34:56+09:00[Asia/Seoul]
		String strZid = zdt.getZone().getId();
		System.out.println(strZid); // Asia/Seoul

		ZonedDateTime seoulTime = ZonedDateTime.now(zid);
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = seoulTime.withZoneSameInstant(nyId);
		System.out.println(nyTime); // 2025-12-01T18:45:37.481409-05:00[America/New_York], 일광절약시간에 따라 -05:00는 달라짐

		// 서로 다른 시간대의 컴퓨터간 통신에 사용. UTC 기준으로 얼마나 떨어져 있나 ex) 서울은 +9 뉴욕은 -5(일광절약시간에 따라 달라짐)
		OffsetDateTime odt = zdt.toOffsetDateTime();
		System.out.println(odt);

	}
}
