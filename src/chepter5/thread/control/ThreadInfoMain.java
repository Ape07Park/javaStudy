package chepter5.thread.control;

import static chepter5.util.MyLogger.*;

import chepter5.thread.start.HelloRunnable;

public class ThreadInfoMain {

    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId()=" + mainThread.threadId());
        log("mainThread.getName()=" + mainThread.getName());
        log("mainThread.getPriority()=" + mainThread.getPriority());
        log("mainThread.getThreadGroup()=" + mainThread.getThreadGroup());
        log("mainThread.getState()=" + mainThread.getState());

        System.out.println();

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread"); // main 스레드에 의해서 생성되었으니 부모 스레드는 main 스레드가 됨
        log("myThread = " + myThread);
        log("myThread.threadId()=" + myThread.threadId());
        log("myThread.getName()=" + myThread.getName());
        log("myThread.getPriority()=" + myThread.getPriority());
        log("myThread.getThreadGroup()=" + myThread.getThreadGroup());
        log("myThread.getState()=" + myThread.getState());


    }
}
