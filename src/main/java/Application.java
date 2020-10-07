import domain.Players;
import domain.Rewards;
import utility.UserInput;
import view.View;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Players players = UserInput.createPlayers();
        Rewards rewards = UserInput.createRewards();
/*

        Ladder ladder = LadderFactory.createLadder(players.countOfPeople(),
                UserInput.getHeight());
        View.printLadder(players,ladder,rewards);

        MatchingResult matchingResult = ladder.play();
        LadderResult result = matchingResult.map(players,rewards);

        View.printResult(result);
*/
/*
        List<User> users = UserInput.inputUserNames();

        String result = UserInput.inputResult();
        String results[] = result.split(",");
        int height = UserInput.inputHeight();

        Ladder ladder = new Ladder();
        ladder.makeLines(users, height);

        View.showNames(users);
        View.showLadder(ladder);
        View.showLadderResult(results);

        ladder.startGame(users, results);

        View.showResult(users, UserInput.showNameWantToSee());
*/
    }
}
