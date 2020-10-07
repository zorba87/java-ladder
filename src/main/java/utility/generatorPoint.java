package utility;

import java.util.Random;

public class generatorPoint {

    private generatorPoint(){}

    public static boolean generationPoint() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
