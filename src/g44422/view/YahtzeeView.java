package g44422.view;

import g44422.model.Dice;

import java.util.List;
import java.util.Scanner;

public class YahtzeeView {

    public void displayTour(int actualTour) {
        printLine();
        System.out.println("               Tour numero " + actualTour + " sur " + 3);
        printLine();
    }

    private void printLine() {
        System.out.println("---------------------------------------------");
    }

    public void displayScore(int score) {
        System.out.println("Le score est actuelement de " + score + "\n");
    }

    public void displayActives(List <Dice> actives) {
        System.out.print("Dés en jeu : ");
        for(Dice de : actives) {
            System.out.print(de.getValue() + " ");
        }
        System.out.print("\n");
    }

    public void displayAsides(List <Dice> asides) {
        System.out.print("Dés mis de côté: ");
        for(Dice de : asides) {
            System.out.print(de.getValue() + " ");
        }
        System.out.print("\n");
    }

    public boolean askAside() {
        String answer;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Voulez-vous mettre un dé de côté? [oui/non]");
            answer = sc.nextLine();
            switch(answer) {
                case "oui":
                case "o":
                case "y":
                case "yes":
                    return true;
                case "non":
                case "n":
                case "no":
                case "nn":
                    return false;
                default:
                    System.out.println("Réponse non valide.");
            }
        }
    }

    public int askAsideIndex(int countActives) {
        Scanner sc = new Scanner(System.in);
        int answer;
        while(true) {
            System.out.println("Entrez le numéro du dé que vous voulez mettre de côté [1 ... " + countActives + "]");
            answer = sc.nextInt();
            if(answer > 0 && answer <= countActives) {
                return answer - 1;
            } else {
                System.out.println("Réponse non-valide, entrez un nombre entier entre 1 et " + countActives);
            }
        }
    }

    public void displayEnd(int score, List <Dice> actives, List <Dice> asides) {
        printLine();
        System.out.println("               Partie terminée");
        printLine();
        System.out.println("Votre score final est de " + score);
        System.out.print("Dés en jeu: ");
        for(Dice de : actives) {
            System.out.print(de.getValue() + " ");
        }
        System.out.print("\n");
        System.out.print("Dés de côté: ");
        for(Dice de : asides) {
            System.out.print(de.getValue() + " ");
        }
        System.out.print("\n");
        printLine();
    }

}
