import java.io.IOException;
import java.util.ArrayList;

public class Stats {
    ExcelReader reader = new ExcelReader("C:\\Users\\bigta\\IdeaProjects\\Event Token Calculator\\assets\\championstats.xlsx");
    ArrayList<Champion> champions = new ArrayList<Champion>(Integer.parseInt(reader.readCellData(1, 4)));
    ArrayList<Champion> top = new ArrayList<>();
    ArrayList<Champion> jgl = new ArrayList<>();
    ArrayList<Champion> mid = new ArrayList<>();
    ArrayList<Champion> bot = new ArrayList<>();
    ArrayList<Champion> sup = new ArrayList<>();

    public Stats(ArrayList<Champion> champions) throws IOException {
        for(int i = 0; i <= champions.size(); i++) {
            champions.get(i).setName(reader.readCellData((i + 1), 0));
            champions.get(i).setWinRate(Integer.parseInt(reader.readCellData((i + 1), 1)));
            champions.get(i).setBanRate(Integer.parseInt(reader.readCellData((i + 1),2)));
            champions.get(i).setPickRate(Integer.parseInt(reader.readCellData((i + 1), 3)));
            System.out.println(champions.get(i).toString());
        }
        sortRoles();
    }

    public void sortRoles() {
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("top")) {
                top.add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("jgl")) {
                jgl.add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("mid")) {
                mid.add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("bot")) {
                bot.add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("sup")) {
                sup.add(champions.get(i));
            }
        }
    }

    public Champion pick(String role) {
        Champion picked;
        if (role.equals("top")) {

            return picked;
        } else if (role.equals("jgl")) {

        } else if (role.equals("mid")) {

        } else if (role.equals("bot")) {

        } else if (role.equals("sup")) {

        }
    }

}
