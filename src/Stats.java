import java.io.IOException;
import java.util.ArrayList;

public class Stats {
    ExcelReader reader = new ExcelReader("C:\\Users\\bigta\\IdeaProjects\\Event Token Calculator\\assets\\championstats.xlsx");
    ArrayList<Champion> champions = new ArrayList<Champion>(Integer.parseInt(reader.readCellData(1, 4)));

    public Stats(ArrayList<Champion> champions) throws IOException {
        for(int i = 0; i <= champions.size(); i++) {
            champions.get(i).setName(reader.readCellData((i + 1), 0));
            champions.get(i).setWinRate(Integer.parseInt(reader.readCellData((i + 1), 1)));
            champions.get(i).setBanRate(Integer.parseInt(reader.readCellData((i + 1),2)));
            champions.get(i).setPickRate(Integer.parseInt(reader.readCellData((i + 1), 3)));
            System.out.println(champions.get(i).toString());
        }
    }

    public Champion pick(String role) {
        if (role.equals("top")) {

        } else if (role.equals("jgl")) {

        } else if (role.equals("mid")) {

        } else if (role.equals("bot")) {

        } else if (role.equals("sup") {

        }
    }

}
