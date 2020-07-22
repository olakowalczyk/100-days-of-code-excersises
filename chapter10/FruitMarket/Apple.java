package chapter10.FruitMarket;

public class Apple extends Fruit{

    public Apple(){
        setCalories(150);
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public void removeSeeds(){
        System.out.println("Seeds are removed");
    }
}
