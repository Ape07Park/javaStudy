package chepter1.operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열 + 문자열 1
        String result = "Hello " + " World";
        System.out.println(result);

        // 문자열 + 문자열 2
        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열 + 숫자 1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열 + 숫자 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
