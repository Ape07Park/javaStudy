package chepter3.time.test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 9,0);

        ZonedDateTime Seoul = ZonedDateTime.of(dt, ZoneId.of("Asia/Seoul"));

        ZonedDateTime london = Seoul.withZoneSameInstant(ZoneId.of("Europe/London"));

        ZonedDateTime newyork =Seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println(Seoul);
        System.out.println(london);
        System.out.println(newyork);

    }
}
