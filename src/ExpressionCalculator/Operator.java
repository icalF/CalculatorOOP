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
 * @author    Satria Priambada
 * @version   0.1
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
        unknown,
        unerPlus,
        unerMinus,
    }
    
    /**
     * Static Data Member
     */
    public static String KarakterOperator[] = {"+", "-", "/", "*", "div", "mod", "and", "or", "not", "xor", "(", ")", "=", ">=", "<=", ">", "<", "<>", "?", "[+]", "[-]"};
    
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
     * @param _s string masukan konstruktor 
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
    
    /**
     * Constructor with enum parameter
     *
     * Konstruktor yang digunakan untuk membuat Objek operator dari nilai string
     * yang diberikan
     *
     * @param _e enumOperator konstruktor 
     */

    public Operator(EnumOperator _e){
        JenisOperator = _e;
    }/*consturctor with parameter string*/

    //cctor dan operator= tidak dibutuhkan karena tidak akan dilakukan assignment antar operator
    
    /**
     * Fungsi GetJenisOperator
     *
     * @return urutan dari EnumOperator
     */
    public EnumOperator GetJenisOperator(){
        return (EnumOperator)JenisOperator;
    }

    /**
     * Fungsi toString

 Fungsi untuk mendapatkan string untuk ditampilkan
     *
     * @return string
     */
    
    @Override
    public String toString(){
        return KarakterOperator[JenisOperator.ordinal()];
    }

    /**
     * Fungsi GetType
     *
     * Fungsi untuk tipe polimorf token
     *
     * @return EnumType dari operator
     */
    @Override
    public EnumType GetType(){
        return EnumType.opr;
    }
}
