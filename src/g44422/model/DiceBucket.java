package g44422.model;

import java.util.ArrayList;
import java.util.List;

public class DiceBucket {

    List <Dice> actives;
    List <Dice> asides;

    /**
     * Un goblet contenant des dés.
     * 5 dés créés à la création d'un goblet.
     */
    public DiceBucket() {
        actives = new ArrayList <Dice>();
        asides = new ArrayList <Dice>();
        for(int i = 0; i < 5; i++) {
            actives.add(new Dice());
        }
    }

    /**
     * Renvoit une liste des dés actifs
     *
     * @return une liste des dés actifs
     */
    public List <Dice> getActives() {
        return actives;
    }

    /**
     * Renvoit une liste des dés mis de côté
     *
     * @return une liste des dés mis de côté
     */
    public List <Dice> getAsides() {
        return asides;
    }

    /**
     * Mélange tous les dés actifs du goblet.
     */
    public void roll() {
        for(int i = 0; i < actives.size(); i++) {
            actives.get(i).roll();
        }
    }

    /**
     * Met le dé spécifé de côté.
     *
     * @param index le dé à mettre de côté.
     */
    public void putAside(int index) {
        asides.add(actives.get(index));
        actives.remove(index);
    }

    /**
     * Met tous les dés actifs de côté.
     */
    public void putAllAside() {
        while(actives.size() > 0) {
            this.putAside(0);
        }
    }

    /**
     * Donne le nombre de dés mis de coté ayant la valeur spécifiée.
     *
     * @param valeur la valeur spécifiée.
     * @return le nombre de dés ayant cette valeur.
     */
    public int getNbAside(int valeur) {
        int count = 0;
        for(int i = 0; i < asides.size(); i++) {
            if(asides.get(i).value == valeur) {
                count++;
            }
        }
        return count;
    }

    /**
     * Retourne le nombre de dés ecore actifs.
     *
     * @return le nombre de dés encore actifs.
     */
    public int getNbActives() {
        return actives.size();
    }

    /**
     * Retourne vrai si le goblet a encore des dés actifs.
     *
     * @return vrai si le goblet comporte encore des dés actifs.
     */
    public boolean isEmpty() {
        return actives.size() > 0;
    }

}
