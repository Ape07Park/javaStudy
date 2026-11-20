package chepter5.thread.start.test;

import static chepter5.util.MyLogger.*;

import java.util.Scanner;

public class StartTest4Main {


     // TODO 주석 하단에 내가한 거 있음

    // public static void main(String[] args) {
    //
    //     PrintWork runnableA = new PrintWork("A", 1000);
    //     PrintWork runnableB = new PrintWork("B", 500);
    //
    //     Thread threadA = new Thread(runnableA, "Thread-A");
    //     Thread threadB = new Thread(runnableB, "Thread-B");
    //
    //     threadA.start();
    //     threadB.start();
    //
    // }
    //
    // static class PrintWork implements Runnable {
    //
    //     private String objValue;
    //     private long sleepMillis;
    //
    //     public PrintWork(String objValue, long sleepMillis) {
    //         this.objValue = objValue;
    //         this.sleepMillis = sleepMillis;
    //     }
    //
    //     @Override
    //     public void run() {
    //
    //         while (true) {
    //
    //             log(objValue);
    //             try {
    //                 Thread.sleep(sleepMillis);
    //             } catch (InterruptedException e) {
    //                 throw new RuntimeException(e);
    //             }
    //         }
    //
    //     }
    // }

    public static void main(String[] args) {

        RunnableA runnableA = new RunnableA();
        RunnableB runnableB = new RunnableB();

        Thread threadA = new Thread(runnableA,"Thread-A");
        Thread threadB = new Thread(runnableB, "Thread-B");

        Scanner scanner = new Scanner(System.in);


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
