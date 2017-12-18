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
public class TokenizerException extends Exception {

    /**
     * Creates a new instance of <code>ParserException</code> without detail
     * message.
     */
    public TokenizerException() {
    }

    /**
     * Constructs an instance of <code>ParserException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TokenizerException(String msg) {
        super(msg);
    }
}
