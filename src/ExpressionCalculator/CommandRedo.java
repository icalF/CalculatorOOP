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
public class CommandRedo {
    private int n;
    
    public CommandRedo(int _n){
        n = _n;
    }
    
    public void execute(){
        System.out.println("Redo");
    }
}
