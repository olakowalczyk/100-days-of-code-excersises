package chapter10.FruitMarket;

public class Banana extends Fruit{

    public Banana(){
        setCalories(250);
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }
    public void peel(){
        System.out.println("Peel peeled");
    }
}
