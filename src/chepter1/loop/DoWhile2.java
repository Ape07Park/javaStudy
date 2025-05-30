package chepter1.loop;

public class DoWhile2 {

    public static void main(String[] args) {

        int i = 10;

        // 앞에 한번은 무조건 실행하고 그 다음에 조건 검사
        // 조건 참이면 do 안의 코드 실행
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);
    }
}
