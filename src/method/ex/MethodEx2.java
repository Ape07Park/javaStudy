package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {

        String message = "Hello, world!";

        printMessage(message, 3);
    }

    public static void printMessage(String message, int length) {

        for (int i = 0; i < length; i++) {
            System.out.println(message);
        }
    }
}
