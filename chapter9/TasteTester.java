package chapter9;

public class TasteTester {
    public static void main(String[] args){
        Cake cake = new Cake("vanilla");
        System.out.println("Cake flavor is " + cake.getFlavor());
        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor());
        WeddingCake weddingCake = new WeddingCake();
        System.out.println("Wedding cake flavor is " + weddingCake.getFlavor());
    }
}
