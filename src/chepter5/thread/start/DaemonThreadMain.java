package chepter5.thread.start;

public class DaemonThreadMain {

    public static void main(String[] args) {
        // main thread - 자바가 만들어주는 기본 thread
        System.out.println(Thread.currentThread().getName() + ": main() start"); // 현재 이 코드를 실행하는 thread 호출
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부
        daemonThread.start();


        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");

            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}
