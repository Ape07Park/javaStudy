package chepter1.operator;

public class Comp2 {

    public static void main(String[] args) {

        // 문자열 상수 풀에 저장. 즉 같은 주소값 가짐. 그 이유는 메모리 효율적으로 사용하기 위함
        String str1 = "Hello1";
        String str2 = "Hello2";

        boolean result1 = "hello".equals("hello"); // 리터럴끼리 비교
        System.out.println(result1);

        boolean result2 = str1.equals("Hello1"); // 문자열 변수와 리터럴 비교
        System.out.println(result2);

        boolean result3 = str2.equals(str1); // 문자열 변수와 문자열 변수를 비교
        System.out.println(result3);

        System.out.println("-----------------");

        /**
         * 예외
         * 문자열을 == 으로 비교하면 맞을 때가 있는데 그 이유는 == 은 주소값을 보고 같은지를 판단한다.
         * .equals()는 문자열 내용 자체가 같은지(아스키 코드가 같은지)를 본다. 즉 "hello" "hello"가 주소값이 달라도
         * 내용이 같으면 같다고 한다.
         */

        // 객체로 선언하여 주소값이 다르다
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // 주소값 비교
        System.out.println(str3 == str4); // false
        // 내용 자체를 비교
        System.out.println(str3.equals(str4)); // true






    }
}
