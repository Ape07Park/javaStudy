package chepter2.ref;

public class NullMain2 {
    public static void main(String[] args) {

        Data data = null;
        data.value = 10; // A "NullPointerException" could be thrown; "data" is nullable here.

        System.out.println("data.value = " + data.value);
    }
}
