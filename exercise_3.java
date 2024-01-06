
// EXERCICES GIVEN BY HARRY

import java.util.Scanner;
import java.util.Random;

class Game {

    int number;
    int input_num;
    int noofguesses = 0;

    public int getnoofguesses() {
        return noofguesses;
    }

    public void setnoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    Game() {
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }

    void takeuserinout() {
        System.out.println("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        input_num = sc.nextInt();
    }

    boolean is_correct_num() {
        noofguesses++;
        if (input_num == number) {
            System.out.format("Yahhh...!  You guess Right number .number is %d.And you done  %d  attempt ", number,noofguesses);
            return true;
        } else if (input_num < number) {
            System.out.println("Less number....");
        } else if (input_num > number) {
            System.out.println("High number....");
        }
        return false;
    }
}

public class exercise_3 {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeuserinout();
            b = g.is_correct_num();
        }
    }
}