package Cricket;

import java.util.Random;

public class RandomGenerator {
     private static Random random = new Random();

    public static int getRandomNumber(int bound) {
        return random.nextInt(bound) + 1;
    }
}
