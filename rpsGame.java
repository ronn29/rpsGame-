

import java.util.Scanner;
import java.util.Random;

public class rpsGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int max = 3;
        String enemyWep = "ENEMY CHOOSE : ";
        String r = "ROCK";
        String s = "SCISSOR";
        String p = "PAPER";
        String tie = "Its a TIE !!!!";
        String lose = "You LOSEEE!!!!";
        String won = "You WON!!!!";



        System.out.println("ROCK, PAPER, SCISSOR GAME");

        System.out.print("CHOOSE YOUR WEAPON : ");
        String wep = scan.nextLine();

        if(wep.equalsIgnoreCase(r)){
            int rand = random.nextInt(max);
            if(rand == 0) {
                System.out.println(enemyWep + r);
                System.out.println(tie);
            }else if(rand == 1){
                System.out.println(enemyWep + s);
                System.out.println(won);
            }else if(rand == 2){
                System.out.println(enemyWep + p);
                System.out.println(lose);
            }

        }else if(wep.equalsIgnoreCase(s)){
            int rand = random.nextInt(max);
            if(rand == 0) {
                System.out.println(enemyWep + r);
                System.out.println(lose);
            }else if(rand == 1){
                System.out.println(enemyWep + s);
                System.out.println(tie);
            }else if(rand == 2){
                System.out.println(enemyWep + p);
                System.out.println(won);
            }

        }else if(wep.equalsIgnoreCase(p)){
            int rand = random.nextInt(max);
            if(rand == 0) {
                System.out.println(enemyWep + r);
                System.out.println(won);
            }else if(rand == 1){
                System.out.println(enemyWep + s);
                System.out.println(lose);
            }else if(rand == 2){
                System.out.println(enemyWep + p);
                System.out.println(tie);
            }

        }else{
            System.out.println("PLEASE CHOOSE A VALID WEAPON");
        }

    }
}
