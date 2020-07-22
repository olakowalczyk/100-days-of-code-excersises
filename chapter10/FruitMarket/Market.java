package chapter10.FruitMarket;

public class Market {

    public static void main(String[] args){
        Apple juice1 = new Apple();
        juice1.removeSeeds();
        juice1.makeJuice();

        Fruit juice2 = new Apple();
        ((Apple) juice2).removeSeeds();
        juice2.makeJuice();
        pour(juice2);

        Fruit juice3 = new Banana();
        ((Banana) juice3).peel();
        juice3.makeJuice();
        pour(juice3);
    }

    public static void pour(Fruit fruit){
        if(fruit instanceof Apple){
            System.out.println("Fills a large glass");
        }
        else if(fruit instanceof Banana){
            System.out.println("Fills a small glass");
        }
    }
}
