/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * All code and works here are created by Satria Priambada and team
 * You are free to use and distribute the code
 * We do not take responsibilities for any damage caused by using this code
 */
package TryDriver;

/**
 *
 * @author Satria
 */

import ExpressionCalculator.PenghitungException;
import CalculatorCounter.*;
import java.io.IOException;
public class DriverCalculator {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws ExpressionCalculator.PenghitungException
     */
    public static void main(String[] args) throws IOException, PenghitungException {
        Calculator C1;
        C1 = new Calculator();
        C1.Run();
    }
    
}
