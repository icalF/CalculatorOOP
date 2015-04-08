/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

/**
 * Class Tokenizer
 *
 * Kelas yang digunakan untuk melakukan proses parsing string
 *
 * @author Satria Priambada
 * @version 0.1
 *
 */
public class Tokenizer {

    private Bilangan.EnumBilangan ModeB;
    
    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek Operator
     *
     */
    public Tokenizer() {
        ModeB = Bilangan.EnumBilangan.arab;
    }/*default constructor*/

    //operator= dan dan cctor tidak diperlukan karena tidak akan ada inisialisasi objek Tokenizer ke Tokenizer lain

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
     * Fungsi Tokenize
     *
     * Fungsi yang digunakan untuk parsing string
     *
     * @throws TokenizerException saat bukan token
     * @param s String
     * @return Expression
     */
    public Expression Tokenize(String s) throws TokenizerException{
        String tempStr;
        boolean bilMinus = false;
        Expression tempExpression = new Expression();
        Token CurToken = null;
        int PanjangS = s.length();
        int i = 0;

        char tempChar = s.charAt(0);
        
        //loop untuk seluruh panjang string
        while (i < PanjangS) {
            tempStr = "";
            
            boolean probablyUner = false;
            
            //Ignore spasi
            while ((tempChar == ' ') && (++i < PanjangS)) {
                tempChar = s.charAt(i);
            }
            bilMinus = false;
            
            while ((tempChar != ' ' && tempChar != '(' && tempChar != ')') && (i < PanjangS)) {
                tempStr += s.charAt(i);
                i = i + 1;
                try {
                    tempChar = s.charAt(i);
                } catch (Exception E) {}
            }
            
            probablyUner = (tempChar!=' ') && (i < PanjangS-1);
            
            if ((tempChar == '(' || tempChar == ')') && tempStr.length() == 0){
                tempStr = "" + tempChar;
                i = i + 1;
                try {
                    tempChar = s.charAt(i);
                } catch (Exception E) {}
            }

            if (tempStr.length()>0)
            {            
                //Keluar loop bila menemukan spasi
                int banyak_perintah = Perintah.KarakterPerintah.length;
                int banyak_operator = Operator.KarakterOperator.length;

                boolean ditemukan = false;
<<<<<<< HEAD
=======

                //System.out.println(probablyUner);
>>>>>>> origin/CalculatorJavav1.0
                
                if (probablyUner)
                {
                    String UnaryOperator[] = {"+", "-"};
                    Operator.EnumOperator EnumUnaryOperator[] = {
                        Operator.EnumOperator.unerPlus,
                        Operator.EnumOperator.unerMinus
                    };
                    int banyak_unary_operator = UnaryOperator.length;

                    //Cari apakah tempString merupakan operator uner. Bila iya maka construct Perintah
                    for (int k = 0; (k < banyak_unary_operator) && (!ditemukan); ++k) {
                        if (tempStr.equals(UnaryOperator[k])) {
                            CurToken = new Operator(EnumUnaryOperator[k]);
                            ditemukan = true;
                        }
                    }
                }
                
                //Cari apakah tempString merupakan perintah. Bila iya maka construct Perintah
                for (int k = 0; (k < banyak_perintah) && (!ditemukan); ++k) {
                    if (tempStr.equals(Perintah.KarakterPerintah[k])) {
                        CurToken = new Perintah(tempStr);
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
                
                String SpecialEnum[] = {"math", "logic", "arab", "romawi", "prefix", "infix", "postfix"};
                int banyak_special_enum = SpecialEnum.length;

                for (int k = 0; (k < banyak_special_enum) && (!ditemukan); ++k) {
                    if (tempStr.equals(SpecialEnum[k])) {
                        CurToken = new BilArab(k);
                        ditemukan = true;
                    }
                }

                String SpecialEnumTF[] = {"false", "true"};
                int banyak_TF = SpecialEnumTF.length;

                for (int k = 0; (k < banyak_TF) && (!ditemukan); ++k) {
                    if (tempStr.equals(SpecialEnumTF[k])) {
                        CurToken = new BilArab(k);
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

                        if (ModeB == Bilangan.EnumBilangan.arab) {
                            //Masukkan nilai minus pada string
                            if (bilMinus){
                                tempStr = "-" + tempStr;
                            }

                            //Construct bilangan Arab berdasarkan string tempStr
                            CurToken = new BilArab(tempStr);
                        } else if (ModeB == Bilangan.EnumBilangan.romawi) {
                            //Masukkan nilai minus pada string
                            if (bilMinus){
                                tempStr = "-" + tempStr;
                            }
                            //Construct bilangan Arab berdasarkan string tempStr
                            CurToken = new BilRomawi(tempStr);
                        }
                    }
                    //tempStr = "";
                } catch (BilanganException E){
                        System.out.println("Tokenizer Error (126): " + E.getMessage());
                        // chained exception
                        throw new TokenizerException("Terdapat kesalahan pada ekspresi.");
                }

                if (CurToken != null) {
                    //System.out.println(CurToken.toString());
                    tempExpression.AddToken(CurToken);
                }
            }
        }
<<<<<<< HEAD
        
=======
//        
//        for (int k=0; k<tempExpression.GetLength(); k++) {
//            System.out.print(tempExpression.GetToken(k).toString());
//        }
//        System.out.println();
>>>>>>> origin/CalculatorJavav1.0
        
        //Keluar loop bila i >= dari PanjangS atau menemukan char '\0'
        return tempExpression;
    }
}
