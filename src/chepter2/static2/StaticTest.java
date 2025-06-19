package chepter2.static2;

public class StaticTest {

    static int x = 0;
    static int sum = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            x++;
            sum += func();
        }

        System.out.println("x = " + x);       // main의 static x
        System.out.println("sum = " + sum); // func의 누적 결과
    }

    static int func() {

        // func 함수 내부 static 변수 (딱 한 번만 초기화됨)
        // 자바에서는 지역 변수에 static 못 씀 → static 지역변수 불가 (컴파일 에러)
        // 대신 이렇게 클래스 변수로 바꿔야 함
        return getStaticValue();
    }

    static int func_x = 0; // func 함수용 static 변수처럼 사용

    static int getStaticValue() {
        func_x += 2;
        return func_x;
    }
}
