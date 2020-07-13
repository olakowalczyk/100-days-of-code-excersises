package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main (String args[]) {

        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int winningResult = 100;

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int numOfPennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int numOfNickels = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int numOfDimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int numOfQuarters = scanner.nextInt();
        scanner.close();

        int result = (numOfPennies * penny) + (numOfNickels * nickel) + (numOfDimes * dime) + (numOfQuarters * quarter);

        if (result == winningResult){
            System.out.println("Congratulations! You win! It is exactly 1$");
        }
        else if (result > winningResult){
            int tooMuch = result - winningResult;
            System.out.println("Oops! It is over 1$, about " + tooMuch + " cents.");
        }
        else{
            int tooLittle = winningResult - result;
            System.out.println("Oops! It is less than 1$. It is short of " + tooLittle + " cents.");
        }
    }
}
