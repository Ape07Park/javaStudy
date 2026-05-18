package chepter3.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {

            // 지역 정보(Asia/Seoul)
            System.out.println("availableZoneId = " + availableZoneId);

            ZoneId zoneId = ZoneId.of(availableZoneId);

            // offset
            System.out.println("zoneId = " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();

        System.out.println();


    }
}
