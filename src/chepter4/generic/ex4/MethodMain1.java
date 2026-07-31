package chepter4.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.getMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("타입 인자(Type Argument) 명시적 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);

        System.out.println("result = " + result);

        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        System.out.println("integerValue = " + integerValue);

        Double doubleValue = GenericMethod.<Double>numberMethod(10.5);
        System.out.println("doubleValue = " + doubleValue);

        Integer result1 = GenericMethod.genericMethod(i); // 인자 i 가 Integer라는 걸 통해 T 를 Integer로 추론
        Integer integerValue1 = GenericMethod.<Integer>numberMethod(10); // 인자 10 가 Integer라는 걸 통해 T 를 Integer로 추론
        Double doubleValue1 = GenericMethod.<Double>numberMethod(10.5); // // 인자 10.5 가 Double 걸 통해 T 를 Integer로 추론
    }
}
