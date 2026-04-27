package chepter3.lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();

        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        System.out.println("get env = " + System.getenv());

        System.out.println("properties = " + System.getProperties());

        System.out.println("java.version = " + System.getProperty("java.version"));


        char[] origin = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] copy = new char[5];

        System.arraycopy(origin, 0, copy, 0, origin.length);

        System.out.println("copy = " + copy);
        System.out.println("Arrays.toString = " + Arrays.toString(copy));

        System.exit(0);
    }
}
