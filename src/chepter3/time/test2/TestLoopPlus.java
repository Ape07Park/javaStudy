package chepter3.time.test2;

import java.time.LocalDate;

public class TestLoopPlus {

    public static void main(String[] args) {

        LocalDate dt =  LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {

            System.out.println("날짜 " + i + " : " + dt);
            dt = dt.plusWeeks(2);
        }
    }

}
