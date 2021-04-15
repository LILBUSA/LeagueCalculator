package com.LeagueCalculator.Data.Champion;

import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public ArrayList<Champion> sortName(ArrayList<Champion> champs) {
        ArrayList<String> names =  new ArrayList<>();
        for (int i = 0; i < champs.size(); i++) {
            names.add(champs.get(i).getName());
        }
        Collections.sort(names);
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < champs.size(); j++) {
                if (names.get(i).equals(champs.get(j).getName())) {
                    Champion temp = champs.get(i);
                    champs.set(i, champs.get(j));
                    champs.set(j, temp);
                }
            }
        }
        return champs;
    }

    public ArrayList<Champion> sortPick(ArrayList<Champion> champs) {
        ArrayList<Float> rates = new ArrayList<>();
        for (int i = 0; i < champs.size(); i++) {
            rates.add(champs.get(i).getPickRate());
        }
        Collections.sort(rates);
        for (int i = 0; i < rates.size(); i++) {
            for (int j = 0; j < champs.size(); j++) {
                if (rates.get(i) == (champs.get(j).getPickRate())) {
                    Champion temp = champs.get(i);
                    champs.set(i, champs.get(j));
                    champs.set(j, temp);
                }
            }
        }
        for(Champion champ: champs) {
            System.out.println(champ);
        }
        return champs;
    }

    public ArrayList<Champion> sortBan(ArrayList<Champion> champs) {
        ArrayList<Float> rates =  new ArrayList<>();
        for (int i = 0; i < champs.size(); i++) {
            rates.add(champs.get(i).getBanRate());
        }
        Collections.sort(rates);
        for (int i = 0; i < rates.size(); i++) {
            for (int j = 0; j < champs.size(); j++) {
                if (rates.get(i) == (champs.get(j).getBanRate())) {
                    Champion temp = champs.get(i);
                    champs.set(i, champs.get(j));
                    champs.set(j, temp);
                }
            }
        }
        return champs;
    }

    public ArrayList<Champion> sortWin(ArrayList<Champion> champs) {
        ArrayList<Float> rates =  new ArrayList<>();
        for (int i = 0; i < champs.size(); i++) {
            rates.add(champs.get(i).getWinRate());
        }
        Collections.sort(rates);
        for (int i = 0; i < rates.size(); i++) {
            for (int j = 0; j < champs.size(); j++) {
                if (rates.get(i) == (champs.get(j).getWinRate())) {
                    Champion temp = champs.get(i);
                    champs.set(i, champs.get(j));
                    champs.set(j, temp);
                }
            }
        }
        return champs;
    }
}
