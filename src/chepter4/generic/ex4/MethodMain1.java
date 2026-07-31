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
    }
}
