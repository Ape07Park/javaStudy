package chepter3.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 10));

    }

    private static MyInteger findValue(MyInteger[] arr, int target) {

        for (MyInteger i : arr) {
            if (i.getValue() == target) {
                return i;
            }
        }

        return null;
    }
}
