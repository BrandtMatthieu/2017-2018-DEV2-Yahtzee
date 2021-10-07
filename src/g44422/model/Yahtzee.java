package g44422.model;

import java.util.List;

public class Yahtzee {

    DiceBucket bucket;
    int nbMoves;

    /**
     * Créé un nouveau jeu de Yathzee
     */
    public Yahtzee() {
        this.bucket = new DiceBucket();
        this.nbMoves = 1;
    }

    /**
     * Renvoit une liste des dés actifs
     *
     * @return une liste des dés actifs
     */
    public List <Dice> getActives() {
        return bucket.getActives();
    }

    /**
     * Renvoit une liste des dés mis de côté
     *
     * @return une liste des dés mis de côté
     */
    public List <Dice> getAsides() {
        return bucket.getAsides();
    }

    /**
     * Détermine si la partie est finie ou non
     *
     * @return vrai si la partie est finie
     */
    public boolean isOver() {
        return (this.getNbMoves() > 3 || bucket.isEmpty());
    }

    /**
     * Mélange tous les dés encore actifs
     */
    public void roll() {
        this.bucket.roll();
    }

    /**
     * Met un dé actif spécifié de côté
     *
     * @param index l'index du dé à mettre de côté
     * @throws YahtzeeException une exception quand l'index du dé à mettre de côté n'est pas bon
     */
    public void putAside(int index) throws YahtzeeException {
        if(index < 0 || index > this.bucket.actives.size()) {
            throw new YahtzeeException("L'index du dé n'est pas bon");
        }
        this.bucket.putAside(index);
    }

    /**
     * Met tous les dés actifs de côté
     */
    public void putAllAside() {
        this.bucket.putAllAside();
    }

    /**
     * Retourne le nombre de mouvements déjà effectués
     *
     * @return le nombre de mouvements déjà effectués
     */
    public int getNbMoves() {
        return nbMoves;
    }

    public void nextMove() {
        this.nbMoves++;
    }

    /**
     * Retourne le score du joueur
     *
     * @return le socre du joueur
     */
    public int getScore() {
        int score = 0;
        for(Dice dice : this.bucket.asides) {
            score += dice.value;
        }
        return score;
    }
}
