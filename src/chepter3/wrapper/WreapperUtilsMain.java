package chepter3.wrapper;

public class WreapperUtilsMain {

    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10); // 숫자 -> 래퍼 객체
        Integer i2 = Integer.valueOf("10"); // 문자열 -> 래퍼 객체
        int i3 = Integer.parseInt("10"); // 문자열에만 사용, 문자열 -> 기본형

        // 비교
       int compareToResult =  i1.compareTo(20);
       System.out.println(compareToResult);

       // 산술 연산
        System.out.println(Integer.sum(10, 20));
        System.out.println(Integer.min(10, 20));
        System.out.println(Integer.max(10, 20));

    }
}
