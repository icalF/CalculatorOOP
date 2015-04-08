/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

import java.util.Arrays;

/**
 * Class BilRomawi
 *
 * Kelas yang digunakan untuk merepresentasikan bilangan romawi
 *
 * @author Satria Priambada
 * @version 0.1
 *
 */
public class BilRomawi extends Bilangan{

    private int Value;
    
    /**
     * Konstruktor default
     *
     * Konstruktor tanpa parameter
     */
    public BilRomawi() {
        Value = 1;
    }

    /**
     * Konstruktor dengan parameter nilai
     *
     * Konstruktor dengan masukan nilai yang akan dibuat Bilangan Romawinya
     *
     * @param d bilangan double untuk konstruk angka romawi
     */
    public BilRomawi(int d) {
        Value = d;
    }

    /**
     * Konstruktor dengan parameter string
     *
     * Konstruktor dengan masukan string dari Romawi terkait
     *
     * @param s string untuk konstruktor
     * @throws ExpressionCalculator.BilanganException  saat string bukan bilangan
     */
    public BilRomawi(String s) throws BilanganException {
        int[] rom_to_int = new int[255];
        Arrays.fill(rom_to_int, 0);

        rom_to_int['I'] = 1;
        rom_to_int['V'] = 5;
        rom_to_int['X'] = 10;
        rom_to_int['L'] = 50;
        rom_to_int['C'] = 100;
        rom_to_int['D'] = 500;
        rom_to_int['M'] = 1000;
        rom_to_int['v'] = 5000;
        rom_to_int['x'] = 10000;
        rom_to_int['l'] = 50000;
        rom_to_int['c'] = 100000;
        rom_to_int['d'] = 500000;
        rom_to_int['m'] = 1000000;

        int sum = 0;
        char prev = '%';
        for (int i = (s.length() - 1); i >= 0; i--) {
            if (rom_to_int[s.charAt(i)] == 0) {
                throw new BilanganException("Bilangan tidak dikenali.");
            }

            char curChar = s.charAt(i);
            
            if (rom_to_int[curChar] < sum && (curChar != prev)) {
                sum -= rom_to_int[curChar];
                prev = curChar;
            } else {
                sum += rom_to_int[curChar];
                prev = curChar;
            }
        }

        Value = sum;
    }

    /* cctor dan operator= tidak pernah dipakai karena tidak mungkin instansiasi */
    /**
     * Fungsi GetValue
     *
     * Fungsi untuk mendapat nilai dari Romawi
     *
     * @return double
     */
    
    @Override
    public int GetValue() {
        return Value;
    }

    /**
     * Fungsi toString

 Fungsi bantunan untuk mencetak Romawi Berfungsi menmbuat string dari
 Romawi
     *
     * @return string
     */
    
    @Override
    public String toString() {
        int val = (int) Value;
        String hasil = "";
        
        String[][] MatrixRomawi = {
            { "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"},
            { "", "x", "xx", "xxx", "xv", "v", "vx", "vxx", "vxxx", "xc"},
            { "", "M", "MM", "MMM", "Mv", "v", "vM", "vMM", "vMMM", "Mx"},
            { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}
        };
        
        // tambah M hingga dibawah 1000000
        while (val >= 1000000) {
            hasil += 'm';
            val -= 1000000;
        }
        
        // Add each of the correct elements, adjusting as we go.
        int pembagi = 100000;
        for (int i = 0; i < 6; i++) {
            hasil += MatrixRomawi[i][val / pembagi];
            val = val % pembagi;
            pembagi /= 10;
        }

        return hasil;
    }
}
