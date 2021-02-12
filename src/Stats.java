import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stats {
    ExcelReader reader = new ExcelReader("C:\\Users\\bigta\\IdeaProjects\\Event Token Calculator\\assets\\championstats.xlsx");
    ArrayList<Champion> champions = new ArrayList<Champion>(Integer.parseInt(reader.readCellData(1, 4)));
    ArrayList<Champion> top = new ArrayList<>();
    ArrayList<Champion> jgl = new ArrayList<>();
    ArrayList<Champion> mid = new ArrayList<>();
    ArrayList<Champion> bot = new ArrayList<>();
    ArrayList<Champion> sup = new ArrayList<>();

    public Stats() throws IOException {
        for(int i = 0; i <= champions.size(); i++) {
            champions.get(i).setName(reader.readCellData((i + 1), 0));
            champions.get(i).setWinRate(Integer.parseInt(reader.readCellData((i + 1), 1)));
            champions.get(i).setBanRate(Integer.parseInt(reader.readCellData((i + 1),2)));
            champions.get(i).setPickRate(Integer.parseInt(reader.readCellData((i + 1), 3)));
            champions.get(i).setRole(reader.readCellData((i + 1), 4));
            System.out.println(champions.get(i).toString());
        }
        sortRoles();
    }

    public void sortRoles() {
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("top")) {
                getTop().add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("jgl")) {
                getJgl().add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("mid")) {
                getMid().add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("bot")) {
                getBot().add(champions.get(i));
            }
        }
        for (int i = 0; i < champions.size(); i++) {
            if (champions.get(i).getRole().equals("sup")) {
                getSup().add(champions.get(i));
            }
        }
    }

//    public Champion pick(String role) {
//        Champion picked;
//        if (role.equals("top")) {
//
//            return picked;
//        } else if (role.equals("jgl")) {
//
//        } else if (role.equals("mid")) {
//
//        } else if (role.equals("bot")) {
//
//        } else if (role.equals("sup")) {
//
//        }
//    }

    public ArrayList<Champion> getChampions() {
        return champions;
    }

    public ArrayList<Champion> getTop() {
        return top;
    }

    public ArrayList<Champion> getJgl() {
        return jgl;
    }

    public ArrayList<Champion> getMid() {
        return mid;
    }

    public ArrayList<Champion> getBot() {
        return bot;
    }

    public ArrayList<Champion> getSup() {
        return sup;
    }

}
