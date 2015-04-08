/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;
/**
     * Class BilArab
     *
     * @author Satria Priambada
     * @version 1.2
     *
     */

public class BilArab extends Bilangan {
    
    private double Value;

    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek arab dengan nilai 0
     *
     */
    public BilArab() {
        Value = 0;
    }/* default constructor */


    /**
     * Constructor with parameter double
     *
     * Konstruktor yang digunakan untuk membuat Objek arab dengan nilai double
     * yang diberikan
     *
     * @param d double
     */

    public BilArab(double d){
        Value = d;
    }

    /**
     * Constructor with parameter string
     *
     * Konstruktor yang digunakan untuk membuat Objek arab dari nilai string
     * yang diberikan
     *
     * @param s string
     * @throws ExpressionCalculator.BilanganException saat bukan bilangan
     */
    public BilArab(String s) throws BilanganException{
        int val = 0;
        int digitDiBelakangKoma = 0;
        boolean bilMinus = false;
	int len = s.length();

	int i;
        //cek bagian terdepan string, bila merupakan bilangan minus maka set bilMinus true
        //Jika bukan merupakan - maka ambil char terdepan dan masukkan ke val
        if (s.charAt(0) == '-'){
            bilMinus = true;
            val = 0;
        } else if (s.charAt(0) == '+') {
            val = 0;
        } else {
            val = (s.charAt(0) - '0');
        }
        
        //untuk karakter kedua dan selanjutnya
	for (i = 1; (i < len); ++i)
	{
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    val = val*10 + (s.charAt(i) - '0');
            else
                    throw new BilanganException("Bilangan tidak dikenali.");
	}
        
        Value = val;
        //Cek apakah bilangan minus atau bukan
        if (bilMinus) {
            Value = -1 * (Value);
        }
    }/* constructor with parameter string */

               

    /**
     * Fungsi GetValue
     *
     * Fungsi untuk mendapatkan nilai dari Bilangan Arab
     *
     * @return double
     */

    @Override
    public double GetValue(){
        return Value;
    }

    /**
     * Fungsi toString

 Fungsi untuk mendapatkan string untuk ditampilkan

 param none
     * @return string
     */
    @Override
    public String toString(){
        return "" + Value;
    }
}
