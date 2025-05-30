package chepter1.method;

public class MethodValue3 {

    public static void main(String[] args) {

        int number1 = 5;
        System.out.println("1. changeNumber 호출 전, number1: " + number1);
        number1 = changeNumber(number1);
        System.out.println("2. changeNumber 호출 후, number2: " + number1);
    }

    public static int changeNumber(int number) {

        return number * 2;
    }
}
