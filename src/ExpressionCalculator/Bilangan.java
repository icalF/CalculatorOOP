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
 * @author    Satria Priambada
 * @version   0.1
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

    /**
     * Fungsi toString

 Fungsi untuk mendapatkan string Bilangan Arab untuk ditulis
     * @return std::string
     */
    @Override
    public abstract String toString();

    /**
     * Fungsi GetType
     *
     * Fungsi untuk tipe polimorf token
     *
     * @return EnumType
     */
    @Override
    public EnumType GetType(){
        return EnumType.bil;
    }

    /**
     * Fungsi GetValue
     *
     * Fungsi untuk mendapatkan nilai dari Bilangan Arab
     *
     * @return double
     */
    public abstract int GetValue(); //deffered
}
