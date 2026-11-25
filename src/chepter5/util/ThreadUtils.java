package chepter5.util;

import static chepter5.util.MyLogger.*;

public class ThreadUtils {

   public static void sleep(long millis) {

       try {
           Thread.sleep(millis);
       } catch (InterruptedException e) {
            log("인터럽트 발생, " + e.getMessage());
           throw new RuntimeException(e); // 체크 예외를 언체크 예외로 변경해서 던짐
       }
   }
}
