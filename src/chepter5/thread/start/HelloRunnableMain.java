package chepter5.thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start");

        // 작업과 Thread를 분리하기 위해 작업은 Runnable에서 정의 후 Thread에 넣음
        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);

        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
