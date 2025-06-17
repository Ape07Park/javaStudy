package chepter2.final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");

        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        // 다 같은 10으로 초기화됨
//        System.out.println(fieldInit1.value);
//        System.out.println(fieldInit2.value);
//        System.out.println(fieldInit3.value);

        // 상수
        // 위의 주석 코드 없이 상수 필드를 사용하면 불필요한 중복과 메모리 낭비를 막을 수 있음
        System.out.println("상수");
        // static + final이 붙은 걸 상수라고 부름
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);

//        System.out.println(fieldInit.value);
//        System.out.println(fieldInit.CONST_VALUE);
    }
}
