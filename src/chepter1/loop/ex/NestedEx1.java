package chepter1.loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        // 2중 반복문
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        System.out.println("구구단 종료");

    }
}
