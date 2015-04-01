/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 * Class Parser
 *
 * Kelas yang digunakan untuk melakukan proses parsing string
 *
 * @class Parser parser.h "parser.h"
 * @package Parser
 * @brief Kelas yang digunakan untuk melakukan proses parsing string
 * @author Satria Priambada
 * @version 0.1
 * @date Maret 2015
 * @warning -
 *
 */
public class Parser {

    private Bilangan.EnumBilangan ModeB;
    
    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek Operator
     *
     */
    public Parser() {
        ModeB = Bilangan.EnumBilangan.arab;
    }/*default constructor*/

    //operator= dan dan cctor tidak diperlukan karena tidak akan ada inisialisasi objek parser ke parser lain

    /**
     * Prosedur SetModeBilangan
     *
     * Prosedur yang digunakan untuk mengubah Mode Bilangan
     *
     * @param B EnumBilangan
     */
    public void SetModeBilangan(Bilangan.EnumBilangan B) {
        ModeB = B;
    }
        
    /**
     * Fungsi Parse
     *
     * Fungsi yang digunakan untuk parsing string
     *
     * @throws ParserException
     * @param s String
     * @return Expression
     */
    public Expression Parse(String s) throws ParserException{
        String tempStr;
        Expression tempExpression = new Expression();
        Token CurToken = null;

        int PanjangS = s.length();
        int i = 0;

        char tempChar = s.charAt(0);
        while (i < PanjangS) {
            tempStr = "";

            while ((tempChar == ' ') && (i < PanjangS)) {
                tempChar = s.charAt(++i);
            }

            while ((tempChar != ' ') && (i < PanjangS)) {
                tempStr += s.charAt(i);
                i = i + 1;
                try {
                    tempChar = s.charAt(i);
                } catch (Exception E) {}
            }

            //Keluar loop bila menemukan spasi
            int banyak_perintah = Perintah.KarakterPerintah.length;
            int banyak_operator = Operator.KarakterOperator.length;

            boolean ditemukan = false;
            //Cari apakah tempString merupakan perintah. Bila iya maka construct Perintah
            for (int k = 0; (k < banyak_perintah) && (!ditemukan); ++k) {
                if (tempStr.equals(Perintah.KarakterPerintah[k])) {
                    CurToken = new Perintah(tempStr);
                    ditemukan = true;
                }
            }
            String SpecialEnum[] = {"math"
            , "logic", "arab", "romawi", "prefix", "infix", "postfix"};
            int banyak_special_enum = SpecialEnum.length;

            for (int k = 0; (k < banyak_special_enum) && (!ditemukan); ++k) {
                if (tempStr.equals(SpecialEnum[k])) {
                    CurToken = new Arab(k);
                    ditemukan = true;
                }
            }

            //tempString bukan perintah. Bila operator construct Operator
            for (int k = 0; (k < banyak_operator) && (!ditemukan); ++k) {
                if (tempStr.equals(Operator.KarakterOperator[k]) ) {
                    CurToken = new Operator(tempStr);
                    ditemukan = true;
                }
            }

            try {
                //Bila bukan operator maupun perintah maka bentuk bilangan
                if (ditemukan == false) {
                    //System.out.println(tempStr);
                    if (ModeB == Bilangan.EnumBilangan.arab) {
                        CurToken = new Arab(tempStr);
                    } else if (ModeB == Bilangan.EnumBilangan.romawi) {
                        CurToken = new Romawi(tempStr);
                    }
                }
                //tempStr = "";
            } catch (BilanganException E){
                    System.out.println("Parser Error (126): " + E.getMessage());
                    // chained exception
                    throw new ParserException("Terdapat kesalahan pada ekspresi.");
            }

                if (CurToken != null) {
                    //System.out.println(CurToken.Display());
                    tempExpression.AddToken(CurToken);
                }
            }
            //Keluar loop bila i >= dari PanjangS atau menemukan char '\0'
            return tempExpression;
        }
}
