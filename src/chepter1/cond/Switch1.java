package chepter1.cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;

        if (grade == 1) {
            System.out.println("쿠폰 1000");
        } else if (grade == 2) {
            System.out.println("쿠폰 2000");
        } else if (grade == 3) {
            System.out.println("쿠폰 3000");
        } else {
            System.out.println("쿠폰 500");
        }
    }
}
