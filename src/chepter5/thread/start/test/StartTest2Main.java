package chepter5.thread.start.test;

import static chepter5.util.MyLogger.*;

public class StartTest2Main {

    public static void main(String[] args) {

        CounterRunnable counterRunnable = new CounterRunnable();

        Thread counter = new Thread(counterRunnable, "counter");
        counter.start();
    }



    static class CounterRunnable implements Runnable{
        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

}
