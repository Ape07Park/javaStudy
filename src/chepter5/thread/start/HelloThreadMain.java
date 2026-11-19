package chepter5.thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {

        // main thread - 자바가 만들어주는 기본 thread
        System.out.println(Thread.currentThread().getName() + ": main() start"); // 현재 이 코드를 실행하는 thread 호출

        HelloThread helloThread = new HelloThread(); // 힙(Heap) 영역에 Thread 인스턴스 객체 생성. 아직 JVM이 OS 스레드 생성 X
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");

        helloThread.start(); // JVM이 OS 스레드 생성 요청을 하고 생성된 스레드에 스택 할당 및 run() 수행. 비동기적임

        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
