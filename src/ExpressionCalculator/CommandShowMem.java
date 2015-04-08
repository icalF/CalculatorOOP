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
public class CommandShowMem  extends Command {
    
    private int n;
    
    public CommandShowMem(int _n){
        n = _n;
    }
    
    /**
     * Prosedur Execute
     *
     * Prosedur yang digunakan menampilkan n Ekspresi terakhir ke layar
     *
     */
    @Override
    public void execute(){
        System.out.println("Proses show memori sebanyak " + n);
    }
    
}
