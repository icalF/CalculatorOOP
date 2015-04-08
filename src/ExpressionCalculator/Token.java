/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 * Class Token
 *
 * Kelas abstrak yang digunakan untuk merepresentasikan token
 *
 * @author Satria Priambada
 * @version 1.2
 *
 */
public abstract class Token {

    public static enum EnumType {
        bil,
        opr,
        cmd
    }
    
    /**
     * Fungsi GetType
     *
     * Fungsi untuk mendapat tipe token
     *
     * @return EnumType
     */

    public abstract EnumType GetType();
		
    /**
     * Fungsi toString
     *   Fungsi bantunan untuk mencetak Token
     *   Berfungsi menmbuat string dari Token
     * 
     * @return string
     */
		 
    @Override
    public abstract String toString();
}
