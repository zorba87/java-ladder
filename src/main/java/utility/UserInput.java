package utility;

import domain.Player;
import domain.Players;
import domain.Rewards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.View.*;

public class UserInput {
    public static Scanner SC = new Scanner(System.in);

    private UserInput() {
    }

    public static int getHeight() {
        System.out.println(HEIGHT);
        int height = SC.nextInt();
        SC.nextLine();

        System.out.println(RESULT_LADDER);
        return height;
    }

    public static String inputResult() {
        System.out.println(RESULT_INPUT);
        String input = SC.nextLine();
        return input;
    }

    public static String showNameWantToSee() {
        System.out.println(RESULT_WANT);
        String input = SC.nextLine();

        return input;
    }

    public static Players createPlayers() {
        System.out.println(NAMES);
        String input = SC.nextLine();
        String users[] = input.split(",");

        List<Player> playerList = new ArrayList<>();

        for (String userName : users) {
            playerList.add(new Player(userName));
        }
        Players players = new Players(playerList);

        return players;
    }

    public static Rewards createRewards() {
        System.out.println(RESULT_INPUT);
        String result = SC.nextLine();
        String results[] = result.split(",");

        List<String> rewardList = new ArrayList<>();

        for (String reward : results) {
            rewardList.add(reward);
        }
        Rewards rewards = new Rewards(rewardList);

        return rewards;
    }
}
