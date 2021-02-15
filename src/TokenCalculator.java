/* name: Taylor Blade
 * date: 10-9-20
 *
 * Program that calculates the amount of tokens you need per day
 * and games per day in a league event
 */
import java.io.IOException;

public class TokenCalculator implements Calculator {
    Stats stats = new Stats();
    int win = 10;
    int loss = 5;
    int tokensNeeded;
    int tokensLeft;
    int currentTokens;
    int days;
    float dailyGoal;
    float wr;
    int calculations;


    public TokenCalculator() throws IOException {
        int earned = 0;
        for (int i = 0; i < calculations; i++) {
            for (int j = 0; earned >= tokensLeft; j++) {
                for (int k = 0; k < dailyGoal/win; k++) {
                    int daily = 0;

                }
            }
        }
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

    public void playGame() {

    }
}

