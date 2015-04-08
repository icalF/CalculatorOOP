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
 * @author    Satria Priambada
 * @version   1.2
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
     * @param _s masukkan string untuk konstruktor
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
     * @return EnumPerintah Kembalikan EnumPerintah dari Jenis Perintah tertentu
     */
    public EnumPerintah GetJenisPerintah(){
        return JenisPerintah;
    }

    /**
     * Fungsi toString

 Fungsi bantunan untuk mencetak Perintah Berfungsi menmbuat string dari
 Perintah
     *
     * @return string
     */
    
    @Override
    public String toString(){
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
