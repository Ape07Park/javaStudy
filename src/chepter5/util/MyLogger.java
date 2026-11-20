package chepter5.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    // String으로 해도 되지만 숫자 등을 못받음.
    // 반면 Object로 하면 여러 타입 받을 수 있고 거기에다가 toString이 자동으로 적용됨.
    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n" , time, Thread.currentThread().getName(), obj);
    }
}
