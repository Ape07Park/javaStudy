package chepter3.wrapper;

public class MyIntegerMain1 {

    public static void main(String[] args) {


        MyInteger value = new MyInteger(10);

        int val = value.getValue();

        System.out.println(value.compareTo(5));

        System.out.println(value.compareTo(10));

        System.out.println(value.compareTo(20));
    }
}
