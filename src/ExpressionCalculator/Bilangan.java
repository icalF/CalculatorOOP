/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 * Class Bilangan
 * 
 * Kelas Abstrak yang digunakan untuk merepresentasikan bilangan
 * 
 * @class     Bilangan Bilangan.h "Bilangan.h"
 * @package   ExpressionCalculator
 * @brief     Kelas Abstrak yang digunakan untuk merepresentasikan bilangan
 * @author    Satria Priambada
 * @version   0.1
 * @date      April 2015
 * @warning   -
 * 
 */

public abstract class Bilangan extends Token{
    
    public static enum EnumBilangan {
        arab,
        romawi
    }
    /**
     * Fungsi Display
     *
     * Fungsi untuk mendapatkan string Bilangan Arab untuk ditulis
     *
     * @param none
     * @return std::string
     */

    public abstract String Display();

    /**
     * Fungsi GetType
     *
     * Fungsi untuk tipe polimorf token
     *
     * @param none
     * @return EnumType
     */
    public EnumType GetType(){
        return EnumType.bil;
    }

    /**
     * Fungsi GetValue
     *
     * Fungsi untuk mendapatkan nilai dari Bilangan Arab
     *
     * @param none
     * @return double
     */
    public abstract double GetValue(); //deffered
}
