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
public class CommandShowAll extends Command{
    
    public CommandShowAll(){
        // nothing
    }
    
    /**
     * Prosedur ShowAll
     *
     * Prosedur yang digunakan menampilkan semua Ekspresi dari memori ke layar
     *
     */
    @Override
    public void execute(){
        System.out.println("Proses show all");
    }

}