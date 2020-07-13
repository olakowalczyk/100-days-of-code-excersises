package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main (String args[]){

        int spaces = 20;
        int rolls = 5;
        int space = 0;
        Random random = new Random();

        for (int i=0; i<rolls; i++) {
            int die = random.nextInt(6) + 1;
            space = space + die;
            if ((spaces - space) >= 0){
                System.out.println("Roll #" + (i + 1) + ": You have rolled " + die + ". You are now on space " + space + " and have " + (spaces - space) + " more to go.");
                if (space == spaces) {
                    System.out.println("You're on space 20. Congrats, you win!");
                    break;
                }
            }
            else{
                System.out.println("On Roll #" + (i+1) + " you have rolled " + die + " and you have exceeded 20 space, hence you lose.");
                break;
            }
        }
        if (space < spaces) {
            System.out.println("Sorry, you lose. After 5 rolls you did not reach 20th space.");
        }
    }
}
