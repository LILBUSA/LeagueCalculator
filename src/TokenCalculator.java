/* name: Taylor Blade
 * date: 10-9-20
 *
 * Program that calculates the amount of tokens you need per day
 * and games per day in a league event
 */
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TokenCalculator implements Calculator {
    int win = 10;
    int loss = 5;
    int tokensNeeded;
    int tokensLeft;
    int currentTokens;
    int days;
    float dailyGoal = (float)tokensLeft/days;
    float wr;
    int calculations;


    public TokenCalculator() {
        out();
        for (int i = 0; i < calculations; i++) {
            int earned = 0;
            for (int j = 0; earned <= tokensLeft; j++) {
                System.out.print("Day " + (j+1) + ":");
                int dailyEarned = 0;
                int games = 0;
                for (int k = 0; dailyEarned < dailyGoal; k++) {
                     if (playGame()) {
                         dailyEarned += win;
                         earned += win;
                     } else if (!(playGame())){
                         dailyEarned += loss;
                         earned += loss;
                     }
                     games = k;
                }
                System.out.println();
                System.out.println("\tGames Played: " + games);
                System.out.println("\tDaily Tokens Earned: " + dailyEarned);
                System.out.println("\tEarned Tokens: " + earned);
                System.out.println("\tTotal Tokens: " + (currentTokens+earned));
                System.out.println("\tRemaining Tokens: " + (tokensLeft-earned));
            }
        }
    }

    public TokenCalculator(Stats stats) throws IOException {

    }

    @Override
    public void out() {
        System.out.println("How many tokens do you need?");
        tokensNeeded = scan.nextInt();
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("How many tokens do you have now?");
        currentTokens = scan.nextInt();
        tokensLeft = tokensNeeded - currentTokens;
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("Current Tokens: " + currentTokens + " tokens");
        System.out.println("How many days left of the event?");
        days = scan.nextInt();
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("Current Tokens: " + currentTokens + " tokens");
        System.out.println("Days: " + days);
        dailyGoal = (float)tokensLeft/days;
        System.out.println("Tokens needed per day: " + dailyGoal + " tokens");
        System.out.println("What is your winrate?");

        wr = scan.nextFloat();
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("Current Tokens: " + currentTokens + " tokens");
        System.out.println("Days: " + days);
        System.out.println("Tokens per day: " + (tokensLeft / days) + " tokens");
        System.out.println("Win Rate: " + (wr * 100) + "%");
        System.out.println("How many calculations?");
        calculations = scan.nextInt();
    }

    public boolean playGame() {
        double rand = Math.random();
        if (wr > .50) {
            if (rand < wr) {
                System.out.print(" W +10 |");
                return true;
            } else if (rand > wr) {
                System.out.print(" L +5 |");
                return false;
            }
        } else if (wr < .50) {
            if (rand < wr) {
                System.out.println(" L +5 |");
                return false;
            } else if (rand > wr) {
                System.out.println(" W +10 |");
                return true;
            }
        }
        return false;
    }

//    public boolean playGame(Stats stats) {
//
//    }

    public Champion pickTop(Stats stats) {
        ArrayList<Champion> top = stats.getTop();
        for (int i = 0; i < stats.getTop().size(); i++) {

        }
    }
}

