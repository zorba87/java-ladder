package utility;

import java.util.Random;

public class LadderPointGenerator {
    public static boolean generatePoint(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
