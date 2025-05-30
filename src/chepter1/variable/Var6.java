package chepter1.variable;

public class Var6 {

    public static void main(String[] args) {
        int a;

        // 에러 발생 이유
        // 컴퓨터 메모리는 여러 프로그램이 공용으로 사용한다.
//        그리고 특정 프로그램이 메모리 공간을 쓰다가 종료되면
//        그 공간의 값은 그대로 둔 채로 간다.
        // 그래서 새로 그 공간을 쓰는 프로그램 입장에선 어떤 값이
//        있을지 알 수 없다. 따라서 초기화가 필요하다.
//        System.out.println(a);
    }
}
