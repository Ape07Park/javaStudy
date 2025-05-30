package chepter1.scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {

       int a = 10;
       int b = 20;

       int temp = b;
       b = a;
       a = temp;

        System.out.println("a : " + a + " b : " + b);
    }
}
