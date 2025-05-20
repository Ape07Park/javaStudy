package casting;

public class Casting04 {

    public static void main(String[] args) {

        // 타입이 제약의 끝판왕
//        int value = "백원";
//        int z = true;

        int div1 = 3 / 2;
        System.out.println(div1); // 1

        double div2 = 3 / 2;
        System.out.println(div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println(div3); // 1.5

        double div4 = (double) 3 / 2;
        System.out.println(div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // a를 double로 캐스팅 후 나누기 연산
        System.out.println(result); // 1.5
    }
}
