/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;
/**
     * Class Arab
     *
     * Kelas yang digunakan untuk merepresentasikan bilangan arab
     *
     * cctor dan operator= tidak pernah dipakai
     *
     * @class Arab Arab.h "Arab.h"
     * @package ExpressionCalculator
     * @brief Kelas yang digunakan untuk merepresentasikan bilangan arab
     * @author Satria Priambada
     * @version 0.1
     * @date April 2015
     * @warning -
     *
     */

public class Arab extends Bilangan {

    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek arab dengan nilai 0
     *
     */
    public Arab() {
        Value = 0;
    }/* default constructor */


    /**
     * Constructor with parameter double
     *
     * Konstruktor yang digunakan untuk membuat Objek arab dengan nilai double
     * yang diberikan
     *
     * @param d double
     * @pre d terdefinisi
     */

    public Arab(double d){
        Value = d;
    }

    /**
     * Constructor with parameter string
     *
     * Konstruktor yang digunakan untuk membuat Objek arab dari nilai string
     * yang diberikan
     *
     * @param s string
     * @throws ExpressionCalculator.BilanganException
     * @pre s terdefinisi
     */
    public Arab(String s) throws BilanganException{
        int val = 0;
	int frac = 0;

	int len = s.length();

	int i;

	for (i = 0; (i < len) && (s.charAt(i) != '.'); ++i)
	{
		if (s.charAt(i)>='0' && s.charAt(i)<='9')
			val = val*10 + (s.charAt(i) - '0');
		else
			throw new BilanganException("Bilangan tidak dikenali.");
	}

	for (int j = i+1; j<len; j++)
	{
		if (s.charAt(i)>='0' && s.charAt(i)<='9')
			frac = frac*10 + (s.charAt(i) - '0');
		else
			throw new BilanganException("Bilangan tidak dikenali.");
	}

	int pembagi=1;

	for (i = 0; i < (len-i-2); ++i)
		pembagi = pembagi*10;

	if (i<len-1)
		Value = val +(frac/pembagi);
	else
		Value = val;
    }/* constructor with parameter string */

               

    /**
     * Fungsi GetValue
     *
     * Fungsi untuk mendapatkan nilai dari Bilangan Arab
     *
     * @param none
     * @return double
     */

    public double GetValue(){
        return Value;
    }

    /**
     * Fungsi Display
     *
     * Fungsi untuk mendapatkan string untuk ditampilkan
     *
     * param none
     * @return string
     */
    public String Display(){
        return " " + Value + " ";
    }

    private double Value;
}
