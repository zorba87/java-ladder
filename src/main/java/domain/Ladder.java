package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    //    private LadderLine ladderLine;
    private List<Line> line;
    private int height;

    public int getHeight() {
        return height;
    }

    public Ladder(int countOfPerson, int height) {
        validateInputs(countOfPerson, height);
        this.height = height;


        makeLadder(countOfPerson, height);
    }

    private void validateInputs(int countOfPerson, int height) {

    }

    private void makeLadder(int countOfPerson, int height) {
        //todo : make Lines
        this.line = makeLines(countOfPerson, height);


        //todo :
    }

    private List<Line> makeLines(int countOfPerson, int height) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < countOfPerson; i++) {
            lines.add(new Line(i,height));

        }

        return lines;
    }

    public List<Line> getLine() {
        return line;
    }
}
