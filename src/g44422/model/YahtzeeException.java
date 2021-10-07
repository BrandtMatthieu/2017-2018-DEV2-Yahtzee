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
public class YahtzeeException extends Exception {

    /**
     * Creates a new instance of <code>YahtzeeException</code> without detail
     * message.
     */
    public YahtzeeException() {
    }

    /**
     * Constructs an instance of <code>YahtzeeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public YahtzeeException(String msg) {
        super(msg);
    }
}
