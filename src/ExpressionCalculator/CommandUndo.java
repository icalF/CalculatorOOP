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
public class CommandUndo extends Command {
    
    private int n;
    
    public CommandUndo(int _n){
        n = _n;
    }
    
    /**
     * Prosedur Execute 
     *
     * Fungsi yang melakukan perintah Undo.
     *
     */
    
    @Override
    public void execute(){
        System.out.println("Proses undo memori sebanyak " + n);
    }
}
