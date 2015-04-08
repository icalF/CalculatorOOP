/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorCounter;
import ExpressionCalculator.Command;
import ExpressionCalculator.Expression;
import java.util.ArrayList;


/**
 * Class EksekutorPerintah
 *
 * Kelas yang digunakan untuk menyimpan list ekspresi, merupakan pembungkusan
 * vector of ekspression.
 * Pada destructor, semua token yang terdapat pada ekspresi dihapus.
 * @author Ibrohim Kholilul Islam
 * @version 0.1
 *
 */
public class EksekutorPerintah {
    //ctor

    /**
     * Constructor default
     *
     */
    
    public EksekutorPerintah(){
    }
    
    private static EksekutorPerintah instance;
    
    public void runCommand(Command _c){
        _c.execute();
    }
    
    public static EksekutorPerintah getInstance(){
        if (instance==null)
            instance = new EksekutorPerintah();
        
        return instance;
    }
    
    
    // memori bertanggung jawab atas penghapusan token
    // tidak diperlukan cctor dan opr= karena tidak pernah ada assignmen memori
    
}
