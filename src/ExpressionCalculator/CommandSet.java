/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 *
 * @author Ibrohim
 */
public class CommandSet {
    private int tipe;
    
    public CommandSet(int _tipe){
        tipe = _tipe;
    }
    
    public void execute(){
        System.out.println("Set");
    }
}
