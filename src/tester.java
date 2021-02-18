import java.io.IOException;

public class tester {
    public static void main(String[] args) throws IOException {
        Stats stats = new Stats();
        TokenCalculator tc = new TokenCalculator(stats);
    }
}
