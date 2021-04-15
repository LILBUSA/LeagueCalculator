package com.LeagueCalculator.Data.Champion;

public class Champion {
    private String name;
    private String[] roles;
    private float winRate;
    private float banRate;
    private float pickRate;

    public Champion(String name, String[] roles, float winRate, float banRate, float pickRate) {
        this.name = name;
        this.roles = separateRoles(roles);
        this.winRate = winRate;
        this.banRate = banRate;
        this.pickRate = pickRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRoles() {
        return roles;
    }

    public float getWinRate() {
        return winRate;
    }

    public void setWinRate(float winRate) {
        this.winRate = winRate;
    }

    public float getBanRate() {
        return banRate;
    }

    public void setBanRate(float banRate) {
        this.banRate = banRate;
    }

    public float getPickRate() {
        return pickRate;
    }

    public void setPickRate(float pickRate) {
        this.pickRate = pickRate;
    }

    public String[] separateRoles(String[] roles) {
        String str = roles[0];
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                roles[num] = str.substring(i - 3, i);
                str = str.substring(i + 1, str.length());
                i = 0;
                num++;
            } else if (i == str.length() - 1) {
                roles[num] = str;
            }
        }
        for (int i = 0; i < roles.length; i++) {
            if (roles[i] == null) {
                roles[i] = "";
            }
        }
        return roles;
    }

    @Override
    public String toString() {
        if (getRoles()[1] == null) {
            return "Name:" + getName() + spaces(getName(), 16) + " Win Rate: " + getWinRate() + spaces(getWinRate() + "", 6) + " Ban Rate: " + getBanRate() + spaces(getBanRate() + "", 6) + " Pick Rate: " + getPickRate() + spaces(getPickRate() + "", 6) + " Roles: " + getRoles()[0];
        } else if (getRoles()[2] == null) {
            return "Name:" + getName() + spaces(getName(), 16) + " Win Rate: " + getWinRate() + spaces(getWinRate() + "", 6) + " Ban Rate: " + getBanRate() + spaces(getBanRate() + "", 6) + " Pick Rate: " + getPickRate() + spaces(getPickRate() + "", 6) + " Roles: " + getRoles()[0] + " " + getRoles()[1];
        } else {
            return "Name:" + getName() + spaces(getName(), 16) + " Win Rate: " + getWinRate() + spaces(getWinRate() + "", 6) + " Ban Rate: " + getBanRate() + spaces(getBanRate() + "", 6) + " Pick Rate: " + getPickRate() + spaces(getPickRate() + "", 6) + " Roles: " + getRoles()[0] + " " + getRoles()[1] + " " + getRoles()[2];
        }
    }

    public String spaces(String str, int spaces) {
        String out = "";
        spaces -= str.length();
        for (int i = 0; i < spaces; i++) {
            out += " ";
        }
        return out;
    }
}
