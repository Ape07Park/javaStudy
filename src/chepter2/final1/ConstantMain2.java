package chepter2.final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        // 상수 덕분에 값을 하나로 관리할 수 있다. 그리고 매직넘버 문제도 해결
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 :" + currentUserCount);

        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록");
        } else {
            System.out.println("게임에 참여");
        }
    }
}
