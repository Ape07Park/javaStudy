package chepter3.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); // 0.0d - 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBool = random.nextBoolean();
        System.out.println("randomBool = " + randomBool);

        // 범위 조회
        int randomRange1 = random.nextInt(10); // 0 - 9까지

    }
}
