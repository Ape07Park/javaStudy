package variable;

public class Var2 {

    public static void main(String[] args) {
        int a; // 변수 선언
        // 값 대입
        a = 10; //  변수 초기화: 값을 처음으로 대입해 저장하는 것

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        System.out.println(new Var1()); // 사용자 정의 자료형(클래스, 참조 자료형)는 주소값이 저장됨


    }

    /**
     * 궁금증: 자바의 기본 자료형에 변수에는 값 자체가 저장돤다.
     * 그럼 왜 객체(참조 자료형)는 주소값을 저장하지?
     * 답: JVM의 구조에서 스택에는 기본 자료형의 실제값과 힙에 있는 참조 자료형의
     * 주소값이 저장되어 있다. 즉 실제 객체는 힙 영역에 저장된다.
     * 스택은 작고 빠르다. 다만 데이터가 오래 유지되는 공간은 아니다.
     * 반면 힙은 크고 무겁다. 따라서 큰 데이터인 객체를 저장하기 좋다.
     * 결론: 스택에선 빠르게 데이터를 할당하고 해제할 수 있어서 스택에 주소값을 저장한다.
     *
     */
}
