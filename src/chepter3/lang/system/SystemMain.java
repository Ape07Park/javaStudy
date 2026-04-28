package chepter3.lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {

        // 현재 시간(밀리초) 가져오기
        long currentTimeMillis = System.currentTimeMillis();

        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초) 가져오기
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수(운영체제)
        System.out.println("get env = " + System.getenv());

        // 시스템 속성(자바가 사용하는 거)
        System.out.println("properties = " + System.getProperties());

        System.out.println("java.version = " + System.getProperty("java.version"));


        char[] origin = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] copy = new char[5];

        // 배열 고속 복사, loop 도는 게 아니라 한번에 도장 찍듯이 복사
        // 운영채제 및 하드웨어 단에서 처리
        System.arraycopy(origin, 0, copy, 0, origin.length);

        System.out.println("copy = " + copy);
        System.out.println("Arrays.toString = " + Arrays.toString(copy));

        // 프로그램 종료
        System.exit(0);
    }
}
