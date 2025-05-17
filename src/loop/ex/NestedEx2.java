package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {

        // 피라미드

        // * 개수가 i에 의해 결정됨

        // TODO 추후 다시 할 것

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
