package tamrin5;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Soldier[] soldiers = new Soldier[30];
        ArrayList<String> ranks = new ArrayList<>();
        ranks.add(0, "Lieutenant");
        ranks.add(1, "Sergent");
        ranks.add(2, "Corporal");
        int n = 1;
        for (int i = 0; i < 30; i++)
            soldiers[i] = new Soldier(i + 1);
        int numberOfCorporals;
        for (int i = 0; i < 30; i++)
            soldiers[i].setInitialRank(ranks.get(2));
        do {
            for (int i = 0; i < 30; i++) {
                int[] bullets = new int[4];
                for (int j = 0; j < 4; j++)
                    bullets[j] = new Random().nextInt(11);
                soldiers[i].setBullet(bullets);
            }
            numberOfCorporals = 0;
            for (int i = 0; i < 30; i++) {
                int finalScore = 0;
                for (int j = 0; j < 4; j++)
                    finalScore += soldiers[i].getBullet()[j];
                soldiers[i].setFinalScore(finalScore);
                if (soldiers[i].getFinalScore() >= 28){
                    if (soldiers[i].getInitialRank() != "Corporal")
                        soldiers[i].setFinalRank(ranks.get(ranks.indexOf(soldiers[i].getInitialRank()) + 1));
                    else
                        soldiers[i].setFinalRank(soldiers[i].getInitialRank());
                }
                else {
                    if (soldiers[i].getInitialRank() != "Lieutenant")
                        soldiers[i].setFinalRank(ranks.get(ranks.indexOf(soldiers[i].getInitialRank()) - 1));
                    else
                        soldiers[i].setFinalRank(soldiers[i].getInitialRank());
                }
            }

            System.out.println("Shooting Test " + n);
            System.out.println("*******************************");
            for (int i = 0; i < 30; i++) {
                System.out.print("Soldier ID : " + soldiers[i].getId() + "\n");
                for (int j = 0; j < 4; j++)
                    System.out.print("Bullet " + j + " : " + soldiers[i].getBullet()[j] + "\n");
                System.out.print("Final Score : " + soldiers[i].getFinalScore() + "\nInitial Rank : " + soldiers[i].getInitialRank() + "\nFinal Rank : " + soldiers[i].getFinalRank() + "\n*************************************\n");
            }
            for (int i = 0; i < 30; i++) {
                if(soldiers[i].getFinalRank() == "Corporal")
                    numberOfCorporals += 1;
            }
            System.out.println("Shooting test " + n + " result: " + Soldier.personOfCorporals(numberOfCorporals) + "% of soldiers are Corporals.\n################################");
            for (int i = 0; i < 30; i++) {
                soldiers[i].setInitialRank(soldiers[i].getFinalRank());
            }
            n ++;
        }while (Soldier.personOfCorporals(numberOfCorporals) > 60);
    }
}
