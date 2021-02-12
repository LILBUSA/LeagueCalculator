/* name: Taylor Blade
 * date: 10-9-20
 *
 * Program that calculates the amount of tokens you need per day
 * and games per day in a league event
 */
import java.io.IOException;
import java.util.Scanner;

public class TokenCalculator {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Stats stats = new Stats();
        int tokensNeeded;
        int tokensLeft;
        int currentTokens;
        int days;
        float wr;



//        System.out.print("How many tokens do you need?: ");
//        tokensNeeded = scan.nextInt();
//        System.out.println();
//        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
//        System.out.print("How many tokens do you have now?: ");
//        currentTokens = scan.nextInt();
//        tokensLeft = tokensNeeded - currentTokens;
//        System.out.println();
//        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
//        System.out.println("Current Tokens: " + currentTokens + " tokens");
//        System.out.print("How many days left: ");
//        days = scan.nextInt();
//        System.out.println();
//        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
//        System.out.println("Current Tokens: " + currentTokens + " tokens");
//        System.out.println("Days: " + days);
//        System.out.println("Tokens needed per day: " + (tokensLeft/days) + " tokens");
//        System.out.print("Win Rate?: ");
//        wr = scan.nextFloat();
//        System.out.println();
//        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
//        System.out.println("Current Tokens: " + currentTokens + " tokens");
//        System.out.println("Days: " + days);
//        System.out.println("Tokens per day: " + (tokensLeft/days) + " tokens");
//        System.out.print("Win Rate: " + (wr*100) + "%");

    }

    public static void playGame(int gameNum) {
        System.out.print("Game " + gameNum);
    }
}

