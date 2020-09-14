package view;

import domain.Ladder;
import domain.Line;

import java.util.List;

public class View {
    public static final String Q_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String Q_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    public static final String SPACE = "    ";
    public static final String RESULT = "실행결과\n";
    public static final String LINE = "|";
    public static final String BRIDGE = "-----";

    public static void showLadder(Ladder ladder) {
        List<Line> lines = ladder.getLine();

        int height = ladder.getHeight();
        int people= lines.size();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < people-1; j++) {
                System.out.print(LINE);
                System.out.print(BRIDGE);
            }
            System.out.println();
        }


    }

    public static void showNames(String names) {
        System.out.println(RESULT);
        String inputs[] = names.split(",");
        for (String name : inputs) {
            System.out.print(name);
            System.out.print(SPACE);
        }
        System.out.println();
    }
}
