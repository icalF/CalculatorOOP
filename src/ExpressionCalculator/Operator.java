/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 * Class Operator
 *
 * Kelas yang digunakan untuk merepresentasikan token operator
 * 
 * @class     Operator Operator.h "Operator.h"
 * @package   ExpressionCalculator
 * @brief     Kelas yang digunakan untuk merepresentasikan token operator
 * @author    Satria Priambada
 * @version   0.1
 * @date      April 2015
 * @warning   -
 * 
 */
public class Operator extends Token{
    
    public static enum EnumOperator {
        Plus,
	Minus,
	bagi,
	kali,
	Div,
	Mod,
	And,
	Or,
	Not,
	Xor,
	kurungBuka,
	kurungTutup,
        equal,
        ge,
        le,
        greater,
        less,
        nequal,
        unknown
    }
    
    /**
     * Static Data Member
     */
    public static String KarakterOperator[] = {"+", "-", "/", "*", "Div", "Mod", "&&", "||", "!", "^", "(", ")", "==", ">=", "<=", ">","<","!=","?"};
    
    private EnumOperator JenisOperator;
    
    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek Operator
     *
     */

    public Operator() {
        JenisOperator = EnumOperator.unknown;
    }/*default constructor*/


    /**
     * Constructor with parameter string
     *
     * Konstruktor yang digunakan untuk membuat Objek operator dari nilai string
     * yang diberikan
     *
     * @param s string
     * @pre s terdefinisi
     */

    public Operator(String _s){
        boolean ditemukan = false;

        EnumOperator[] ArrayEnumOperator;
        ArrayEnumOperator = EnumOperator.values();
        
	for (int i = 0; (i < KarakterOperator.length) && (!ditemukan); ++i)
		if (_s.equals(KarakterOperator[i])) {
			JenisOperator = ArrayEnumOperator[i];
			ditemukan = true;
		}

	assert(ditemukan);
    }/*consturctor with parameter string*/

    //cctor dan operator= tidak dibutuhkan karena tidak akan dilakukan assignment antar operator
    
    /**
     * Fungsi GetJenisOperator
     *
     * @param none return EnumOperator
     */
    public EnumOperator GetJenisOperator(){
        return (EnumOperator)JenisOperator;
    }

    /**
     * Fungsi Display
     *
     * Fungsi untuk mendapatkan string untuk ditampilkan
     *
     * @return string
     */
    
    @Override
    public String Display(){
        return KarakterOperator[JenisOperator.ordinal()];
    }

    /**
     * Fungsi GetType
     *
     * Fungsi untuk tipe polimorf token
     *
     * @param none
     * @return EnumType
     */
    @Override
    public EnumType GetType(){
        return EnumType.opr;
    }
}
