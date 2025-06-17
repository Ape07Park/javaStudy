package chepter2.final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        // 1000 -> 2000 변경 시 두 군데를 수정해야함

        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 :" + currentUserCount);

        if (currentUserCount > 1000) { // 1000이라는 숫자의 의미를 모르겠다. 메직넘버 문제
            System.out.println("대기자로 등록");
        } else {
            System.out.println("게임에 참여");
        }
    }
}
