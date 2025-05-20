package casting;

public class Casting03 {

    public static void main(String[] args) {

        long maxIntValue = 2147483647; // int 최고값, long으로 자동 캐스팅되어 들어감
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        // maxIntValue에 사용자 입력으로 어떤 값이 들어올 줄 알 수 없다.
        // 따라서 long을 int에 맞추기 위해 하위 타입으로 캐스팅해야 함.
        intValue = (int) maxIntValue; // 형변환
        System.out.println(intValue); // 2147483647


        // 오버플로우 발생: 시계가 60분 이후엔 1분으로 가듯 int의 가장 작은 범위부터 시작
        intValue = (int) maxIntOver; // 형변환

        // int의 가장 작은 범위부터 시작
        System.out.println(intValue); // -2147483648



    }
}
