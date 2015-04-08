/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 *
 * @author Afrizal Fikri
 */
public class PenghitungException extends Exception {

    /**
     * Creates a new instance of <code>PenghitungException</code> without detail
     * message.
     */
    public PenghitungException() {
    }

    /**
     * Constructs an instance of <code>PenghitungException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PenghitungException(String msg) {
        super(msg);
    }
}
