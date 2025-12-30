package chepter3.time.test;

import java.time.LocalDateTime;

public class TestPlus {

	public static void main(String[] args) {

		LocalDateTime time = LocalDateTime.of(2024, 1, 1, 0, 0);

		System.out.println(time);

		LocalDateTime plusTime = time.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

		System.out.println(plusTime);
	}
}
