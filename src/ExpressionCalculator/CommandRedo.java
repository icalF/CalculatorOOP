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
public class CommandRedo  extends Command {
    private int n;
    
    public CommandRedo(int _n){
        n = _n;
    }
    
    /**
     * Fungsi Redo
     *
     * Fungsi yang mengembalikan Expresi hasil perintah redo
     *
     */
    @Override
    public void execute(){
        System.out.println("Proses redo " + n);
    }
}
