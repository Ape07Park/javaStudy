package chepter3.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

	public static void main(String[] args) {

		Instant instant = Instant.now(); // UTC 기준

		System.out.println(instant);

		ZonedDateTime zdt = ZonedDateTime.now();
		Instant from = Instant.from(zdt); // ZonedDateTime -> Instant

		System.out.println(from);

		Instant epochStart = Instant.ofEpochSecond(0);
		System.out.println(epochStart);

		// 계산
		Instant later = epochStart.plusSeconds(3600);
		System.out.println("later = " + later);

		// epochSecond 조회
		long laterEpochSecond = later.getEpochSecond();
		System.out.println("laterEpochSecond = " + laterEpochSecond);

	}
}
