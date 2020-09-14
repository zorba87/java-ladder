package utility;

import java.util.Scanner;

import static view.View.Q_HEIGHT;
import static view.View.Q_NAMES;

public class UserInput {
    private static Scanner SC = new Scanner(System.in);

    private UserInput(){}

    public static String inputNames() {
        System.out.println(Q_NAMES);
        String names = SC.nextLine();
        return names;
    }

    public static int inputHeight() {
        System.out.println(Q_HEIGHT);
        return SC.nextInt();
    }
}
