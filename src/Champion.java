import java.io.IOException;

public class Champion {
    private String name;
    private float winRate;
    private float banRate;
    private float pickRate;

    public Champion(String name, float winRate, float banRate, float pickRate) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Name: " + getName() + " Win Rate: " + getWinRate() + " Ban Rate: " + getBanRate() + " Pick Rate: " + getPickRate();
    }

}
