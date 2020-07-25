package chapter14.CoinTossGame;
import java.util.Random;

public class Coin {

    private String side;
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";
    Random random = new Random();

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        String side = new Random().nextBoolean() ? HEADS : TAILS;
        setSide(side);
        System.out.println("Coin is flipping..." + side + " fell out");
        return getSide();
    }
}
