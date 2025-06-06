package chepter1.variable;

public class Var8 {

    public static void main(String[] args) {

        /**
         * 많은 수를 담을 수 있는 만큼 더 많은 메모리 공간을 차지한다
         */

        // 정수

        // byte는 파일을 byte 단위로 다루기에 파일 전송, 복사 등에 사용된다.
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32768 ~ 32767
        // 21억
        int i = 2147483647; // -2147483648 ~ 2147483647

        long l = 9223372036854775807L; // -9223372036854775808 ~ 9223372036854775807

        //  실수
        float f = 10.0f;

        // double의 정밀도가 더 높다
        double d = 10.0;

        // 정수는 기본적으로 int를 사용한다. 다만 int 범위를 넘어서면 Long을 사용한다
        // 실수는 기본적으로 double을 사용한다. 이유는 float는 소수점 계산 시 오류가 많아서다
    }
}
