package chapter13.DividingByZero;

public class DividingByZero extends Throwable {
    public static void main(String[] args){
        divide();
    }

    public static void divide(){
        try{
            int result = 30/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Dividing by zero is not allowed");
        }
        finally {
            System.out.println("Division is fun!");
        }
    }
}
