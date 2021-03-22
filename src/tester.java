import java.io.IOException;
import java.util.ArrayList;

public class tester {
    public static void main(String[] args) throws IOException {
        Stats stats = new Stats();
        ArrayList<Champion> top = stats.getTop();
        for (int i = 0; i < top.size(); i++) {
            for (int j = 0; j < top.size() - i - 1; j++) {
                if (top.get(j).getPickRate() > top.get(j + 1).getPickRate()) {
                    Champion champ = top.get(j);
                    top.set(j, top.get(j + 1));
                    top.set((j + 1), champ);
                }
            }
        }
        for (Champion champ:top) {
            System.out.println(champ.getPickRate());
        }
        //TokenCalculator tc = new TokenCalculator();
    }
}
