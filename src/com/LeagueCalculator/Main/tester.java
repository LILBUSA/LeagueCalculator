package com.LeagueCalculator.Main;

import com.LeagueCalculator.Data.Champion.Champion;
import com.LeagueCalculator.Data.Stats;

import java.io.IOException;
import java.util.ArrayList;

public class tester {
    public static void main(String[] args) throws IOException {
        Stats stats = new Stats();
        ArrayList<Champion> top = stats.getTop();
        top = stats.sorter.sortPick(top);
        for (Champion champ:top) {
            System.out.println(champ.getName() + " Pick Rate: " + champ.getPickRate());
        }
        //com.LeagueCalculator.TokenCalculator.TokenCalculator.TokenCalculator tc = new com.LeagueCalculator.TokenCalculator.TokenCalculator.TokenCalculator();
    }
}
