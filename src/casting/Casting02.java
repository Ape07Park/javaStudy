package casting;

public class Casting02 {

    public static void main(String[] args) {
        int intValue = 0;
        double doubleValue = 1.5;

//       intValue = doubleValue; // 컴파일 오류 발생. 이유는 오버플로우 땜에 값이 잘리거나 변환되어 대입될 수 있음.
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // 1.5가 아닌 1 출력. 0.5 잘림
        System.out.println(doubleValue);

        int z = (int) 10.5;
        System.out.println(z);


    }
}
