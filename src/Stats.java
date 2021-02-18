import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stats {
    ExcelReader reader = new ExcelReader("C:\\Users\\bigta\\IdeaProjects\\Event Token Calculator\\assets\\championstats.xlsx");
    int numChamps = 154;
    ArrayList<Champion> champions = new ArrayList<Champion>();
    ArrayList<Champion> top = new ArrayList<>();
    ArrayList<Champion> jgl = new ArrayList<>();
    ArrayList<Champion> mid = new ArrayList<>();
    ArrayList<Champion> bot = new ArrayList<>();
    ArrayList<Champion> sup = new ArrayList<>();

    public Stats() throws IOException {
        for(int i = 0; i < numChamps; i++) {
            String name = reader.readCellData((i + 1), 0);
            float wr = Float.parseFloat(reader.readCellData((i + 1), 1));
            float br = Float.parseFloat(reader.readCellData((i + 1), 2));
            float pr = Float.parseFloat(reader.readCellData((i + 1), 3));
            String[] roles = new String[3];
            roles[0] = reader.readCellData((i + 1), 4);
            champions.add(new Champion(name, roles, wr, br, pr));
            //System.out.println(champions.get(i).toString());
        }
        sortRoles();
    }

    public void sortRoles() {
        for (int i = 0; i < champions.size(); i++) {
            Champion champ = champions.get(i);
            for (String str:champ.getRoles()) {
                if (str.equals("top")) {
                    getTop().add(champ);
                } else if (str.equals("jgl")) {
                    getJgl().add(champ);
                } else if (str.equals("mid")) {
                    getMid().add(champ);
                } else if (str.equals("bot")) {
                    getBot().add(champ);
                } else if (str.equals("sup")) {
                    getSup().add(champ);
                }
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

    public void champList() {
        for(Champion champ:getChampions()) {
            System.out.println(champ.toString());
        }

    }
}
