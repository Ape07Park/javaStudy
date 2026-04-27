package chepter3.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {

        int iterations = 1_000_000_000;    // 반복횟수, 10억

        long startTime, endTime;

        // 기본형 long
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("Primitive : " + sumPrimitive);
        System.out.println("Primitive : " + (endTime - startTime) + "ms" );

        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++){
            sumWrapper += i; // 오토 박싱, 불변이라 기존 누적합을 다른 변수에 담고서 + i
        }

        endTime = System.currentTimeMillis();

        System.out.println("Wrapper : " + sumWrapper);
        System.out.println("Wrapper : " + (endTime - startTime) + "ms" );


    }



}
