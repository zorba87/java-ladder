<<<<<<< HEAD
import domain.Ladder;
import utility.UserInput;
import view.View;

public class Application {
    public static void main(String[] args) {
        String names = UserInput.inputNames();
        int height = UserInput.inputHeight();
        int countOfPerson = UserInput.countPerson(names);
        View.showNames(names);

        Ladder ladder = new Ladder(countOfPerson,height);
        View.showLadder(ladder);

    }
}
