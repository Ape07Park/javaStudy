package chepter1.loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {

//        int count = 2;

//        while (count <= 20) {
//            if (count % 2 == 0) {
//                System.out.println(count);
//            }
//            count++;
//        }
//
//        System.out.println("while 끝");
//
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }

        System.out.println("while 끝");

        num = 2;

        for (int i = 1; i <= 10; i += 1) {
            System.out.println(num);
            num += 2;
        }

//        for (int i = 2, j = 1; j <= 10; i += 2, j++) {
//            System.out.println(i);
//        }
    }
}
