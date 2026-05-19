package chepter3.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {

        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println(nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println(zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030,1,1,13,30,50,0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        // zone 변경
        ZonedDateTime utcZone = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZone = " + utcZone);

        zdt2.withZoneSameInstant(ZoneId.of("America/New_York"));


    }
}
