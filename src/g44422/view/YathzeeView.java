/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g44422.view;

import g44422.model.*;

/**
 *
 * @author matth
 */
public class YathzeeView {
    
    Yahtzee jeu;
    
    public void main() {
        jeu = new Yahtzee();
        while(!jeu.isOver()) {
            horizontalRule();
            displayTour();
            jeu.roll();
            if(askToKeep()) {
                
            }
        }
    }
    
    public boolean askToKeep() {
        System.out.println("Voulez-vous garder un dé?");
    }
    
    public void displayTour() {
        horizontalRule();
        System.out.prinln("Tour numéro "+jeu.)
    }
    
    public void horizontalRule() {
        for(int i=0;i<6;i++) {
            System.out.print("-----");
        }
        System.out.println("-----");
    }
    
}
