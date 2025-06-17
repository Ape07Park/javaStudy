package chepter2.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 오류


        // final 지역변수2
        final int data2 = 10; // 값이 이미 할당됨
//        dat2 = 20; // 컴파일 오류

        method(10); // 10으로 param 고정됨
    }

    static void method(final int param) {
//        param = 20;  // param의 값이 이미 10으로 고정됨
    }


}
