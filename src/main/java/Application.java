import domain.Ladder;
import utility.UserInput;
import view.View;

public class Application {
    public static void main(String[] args) {
        String names = UserInput.inputNames();
        int height = UserInput.inputHeight();

        Ladder ladder = new Ladder(names,height);
        View.showLadder(ladder);

    }
}
