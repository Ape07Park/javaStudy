package chepter1.scope;

public class Scope2 {
    public static void main(String[] args) {

        int m = 10; // m 생존 시작

        for (int i = 0; i < 2; i++) { // 블록 내부, for문 ㅐ
            System.out.println("for m = " + m); // 블록 내부에선 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료

//        System.out.println("main i = " + i); // x에 접근 불가
        System.out.println("main m = " + m);
    } // m 생존 종료
}
