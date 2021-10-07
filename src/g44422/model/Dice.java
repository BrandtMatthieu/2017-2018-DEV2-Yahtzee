/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g44422.model;

/**
 *
 * @author matth
 */
public class Dice {
    
    private int value;
    
    /**
     * Represents a dice
     * The dice is initialized with a value of 6
     */
    public Dice() {
        this.value = 6;
    }

    /**
     * Gets the value of the dice.
     * @return the value of the dice.
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Sets the dice to a random value betwwen 1 and 6.
     */
    public void roll() {
        this.value = Math.round((int)(Math.random()*5)+1);
    }
    
}
