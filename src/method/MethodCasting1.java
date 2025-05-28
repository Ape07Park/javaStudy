package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;

//        pringNumber(number); // double을 int에 대입을 할려고 해서 에러남
        pringNumber((int) number); // double -> int 로 명시적 형변환
    }

    public static void pringNumber(int n) {
        System.out.println("숫자: " + n);
    }

}
