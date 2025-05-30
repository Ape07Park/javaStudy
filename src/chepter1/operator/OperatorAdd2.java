package chepter1.operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위(prefix) 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a; // a를 1 증가시키고 b에 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("---------------");

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; // a의 현재값을 b에 먼저 대입 후 a는 1 증가
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

    }
}
