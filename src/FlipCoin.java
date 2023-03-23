import java.util.Random;

public class FlipCoin {
    public static int flipCoin() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
