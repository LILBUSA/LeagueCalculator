/* name: Taylor Blade
 * date: 10-9-20
 *
 * Program that calculates the amount of tokens you need per day
 * and games per day in a league event
 */
package com.LeagueCalculator.TokenCalculator;
import com.LeagueCalculator.Data.Stats;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TokenCalculator implements Calculator {
    private int win = 10;
    private int loss = 5;
    private int tokensNeeded;
    private int tokensLeft;
    private int currentTokens;
    private int days;
    private int dailyGoal = roundUp(tokensLeft/days);
    private float wr;
    private int calculations;

    private int totalGames = 0;
    private int totalTokens = 0;
    private float avgDailyT = 0;
    private float avgDailyG = 0;

    public int roundUp(float num) {
        String str = "" + num;
        if (str.indexOf('.') != -1) {
            str = str.substring(str.indexOf('.'), str.length() - 1);
            float diff = .10f - Float.parseFloat(str);
            return (int)(num + diff);
        } else {
            return (int)num;
        }
    }

    public float calcAvg(int total, int number) {
        return total/number;
    }

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

    public TokenCalculator(int tokensNeeded, int currentTokens, int days, float wr, int calculations) {
        setTokensNeeded(tokensNeeded);
        setCurrentTokens(currentTokens);
        setDays(days);
        setWR(wr);
        setCalculations(calculations);
        calculate();
    }

    public TokenCalculator(Stats stats) throws IOException {

    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getTokensNeeded() {
        return tokensNeeded;
    }

    public void setTokensNeeded(int tokensNeeded) {
        this.tokensNeeded = tokensNeeded;
    }

    public int getTokensLeft() {
        return tokensLeft;
    }

    public void setTokensLeft(int tokensLeft) {
        this.tokensLeft = tokensLeft;
    }

    public int getCurrentTokens() {
        return currentTokens;
    }

    public void setCurrentTokens(int currentTokens) {
        this.currentTokens = currentTokens;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public float getWR() {
        return wr;
    }

    public void setWR(float wr) {
        this.wr = wr;
    }

    public int getCalculations() {
        return calculations;
    }

    public void setCalculations(int calculations) {
        this.calculations =  calculations;
    }

    public int getDailyGoal() {
        return dailyGoal;
    }
    @Override
    public void out() {
        System.out.println("How many tokens do you need?");
        tokensNeeded = Calculator.scan.nextInt();
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("How many tokens do you have now?");
        currentTokens = Calculator.scan.nextInt();
        tokensLeft = tokensNeeded - currentTokens;
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("Current Tokens: " + currentTokens + " tokens");
        System.out.println("How many days left of the event?");
        days = Calculator.scan.nextInt();
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("Current Tokens: " + currentTokens + " tokens");
        System.out.println("Days: " + days);
        System.out.println("Tokens needed per day: " + dailyGoal + " tokens");
        System.out.println("What is your winrate?");

        wr = Calculator.scan.nextFloat();
        System.out.println();
        System.out.println("Tokens Needed: " + tokensNeeded + " tokens");
        System.out.println("Current Tokens: " + currentTokens + " tokens");
        System.out.println("Days: " + days);
        System.out.println("Tokens per day: " + (tokensLeft / days) + " tokens");
        System.out.println("Win Rate: " + (wr * 100) + "%");
        System.out.println("How many calculations?");
        calculations = Calculator.scan.nextInt();
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

    public int playDay(int daily, int tokens) {
        if (tokens == daily) {
            return 0;
        } else {
            if (playGame()) {
                totalTokens += 10;
                return 1 + playDay(daily, tokens + 10);
            } else {
                totalTokens += 5;
                return 1 + playDay(daily, tokens + 5);
            }
        }
    }

    public void calculate() {
        int d = 0;
        totalTokens = currentTokens;
        while(totalTokens < tokensNeeded) {
            int t = totalTokens;
            int g = totalGames;
            totalGames += playDay(getDailyGoal(), 0);
            d++;
            g -= totalGames;
            
        }
    }

//    public boolean playGame(com.LeagueCalculator.Data.Stats stats) {
//
//    }

//    public com.LeagueCalculator.Data.Champion.Champion pickTop(com.LeagueCalculator.Data.Stats stats) {
//        ArrayList<com.LeagueCalculator.Data.Champion.Champion> top = stats.getTop();
//        for (int i = 0; i < top.size(); i++) {
//            for (int j = 0; j < top.size() - i - 1; j++) {
//                if (top.get(j).getPickRate() > top.get(j + 1).getPickRate()) {
//                    com.LeagueCalculator.Data.Champion.Champion champ = top.get(j);
//                    top.set(j, top.get(j + 1));
//                    top.set((j + 1), champ);
//                }
//            }
//        }
//
//    }
}

