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
 * @class Token Token.h "Token.h"
 * @package ExpressionCalculator
 * @brief Kelas abstrak yang digunakan untuk merepresentasikan token
 * @author Satria Priambada
 * @version 0.1
 * @date April 2015
 * @warning -
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
     * @param none
     * @return EnumType
     */

    public abstract EnumType GetType();
		
    /**
     * Fungsi Display
     * 
     * Fungsi bantunan untuk mencetak Token
     * Berfungsi menmbuat string dari Token
     * 
     * @param none
     * @return string
     */
		 
    public abstract String Display();
}
