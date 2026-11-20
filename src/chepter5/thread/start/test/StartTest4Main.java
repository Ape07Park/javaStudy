package chepter5.thread.start.test;

import static chepter5.util.MyLogger.*;

public class StartTest4Main {

    public static void main(String[] args) {

        RunnableA runnableA = new RunnableA();
        RunnableB runnableB = new RunnableB();

        Thread threadA = new Thread(runnableB,"Thread-A");
        Thread threadB = new Thread(runnableB, "Thread-B");

        threadA.start();
        threadB.start();

    }

    static class RunnableA implements Runnable {
        @Override
        public void run() {

            log("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    static class RunnableB implements Runnable {
        @Override
        public void run() {

            log("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
