/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 *
 * @author Satria
 */
public class BilanganException extends Exception {

    /**
     * Creates a new instance of <code>BilanganException</code> without detail
     * message.
     */
    public BilanganException() {
    }

    /**
     * Constructs an instance of <code>BilanganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public BilanganException(String msg) {
        super(msg);
    }
}
