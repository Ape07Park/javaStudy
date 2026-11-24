package chepter5.thread.control;

import static chepter5.util.MyLogger.*;

import chepter5.thread.start.HelloRunnable;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {

        Thread myThread = new Thread(new MyRunnable(), "myThread"); // main 스레드에 의해서 생성되었으니 부모 스레드는 main 스레드가 됨

        log("myThread.state1 = " + myThread.getState());
        log("myThread.start()");
        myThread.start();

        Thread.sleep(1000); // 3초간 sleep일 때 sleep 상태인 myThread를 1초 뒤에 main 스레드로 찍은 것
        log("myThread.state3 = " + myThread.getState()); // TIMED_WANTING

        Thread.sleep(4000); // 5초간 main 스레드 sleep시켜서 그 동안 myThread를 종료하고 상태를 찍은 것
        log("myThread.state5 = " + myThread.getState()); // TERMINATED
        log("end");

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState()); // RUNNABLE

                log("sleep() start");
                Thread.sleep(3000); // myThread
                log("sleep() end");

                log("myThread.state4 = " + Thread.currentThread().getState()); // RUNNABLE
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
