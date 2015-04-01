/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 * Class Perintah
 *
 * Kelas yang digunakan untuk merepresentasikan token perintah
 * 
 * @class     Perintah Perintah.h "Perintah.h"
 * @package   ExpressionCalculator
 * @brief     Kelas yang digunakan untuk merepresentasikan token perintah
 * @author    Satria Priambada
 * @version   0.1
 * @date      April 2015
 * @warning   -
 * 
 */
public class Perintah extends Token{
    
    public static enum EnumPerintah{
        set,
	undo,
	redo,
	showmem,
	showall,
	save,
        unknown
    }
    
    /**
     * KarakterPerintah
     *
     * Daftar perintah yang tersedia
     *
     * @enum string
     */
    public static String KarakterPerintah[] = {"set", "undo", "redo", "showmem", "showall", "save", "?"};

    private EnumPerintah JenisPerintah;
    
    /**
     * Konstruktor default
     *
     * Konstuktor tanpa parameter
     */
    
    public Perintah() {
        JenisPerintah = EnumPerintah.unknown;
    } /*default constructor*/


    /**
     * Konstruktor dengan parameter string
     *
     * Konstruktor yang mengubah string masukan menjadi perintah yang sesuai
     *
     * @param string
     */

    public Perintah(String _s){
	
	boolean ditemukan = false;

        EnumPerintah[] ArrayEnumPerintah = EnumPerintah.values();
        int BanyakPerintah = KarakterPerintah.length;
	for (int i = 0; (i < BanyakPerintah) && (!ditemukan); ++i)
		if (_s == null ? KarakterPerintah[i] == null : _s.equals(KarakterPerintah[i])){
			JenisPerintah = ArrayEnumPerintah[i];
			ditemukan = true;
		}

	assert(ditemukan);
    }/*constructor with parameter string*/


    /* cctor dan operator= tidak dibutuhkan karena tidak akan dilakukan assignment antar operator */
    /**
     * Fungsi GetJenisPerintah
     *
     * Mendapatkan tipe perintah dari kelas Perintah yang sudah ada
     *
     * @param none
     * @return EnumPerintah
     */
    public EnumPerintah GetJenisPerintah(){
        return JenisPerintah;
    }

    /**
     * Fungsi Display
     *
     * Fungsi bantunan untuk mencetak Perintah Berfungsi menmbuat string dari
     * Perintah
     *
     * @param none
     * @return string
     */
    
    @Override
    public String Display(){
        return KarakterPerintah[JenisPerintah.ordinal()];
    }

    /**
     * Fungsi GetType
     *
     * Fungsi yang mendapatkan tipe Token, yaitu Perintah
     *
     * @return EnumType
     */
    @Override
    public EnumType GetType(){
        return EnumType.cmd;
    }
}
