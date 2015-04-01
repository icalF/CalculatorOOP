/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;
import java.util.ArrayList;

/**
 * Class Expression
 * 
 * Kelas yang digunakan untuk merepresentasikan ekspresi, merupakan 
 * pembungkusan vector of (pointer to token).
 *
 * @class     Expression Expression.h "Expression.h"
 * @package   ExpressionCalculator
 * @brief     Kelas yang digunakan untuk merepresentasikan ekspresi,
 *            merupakan pembungkusan vector of (pointer to token).
 * @author    Ibrohim Kholilul Islam
 * @version   0.1
 * @date      April 2015
 * @warning   semua pointer token yang diberikan dapat ditunjuk oleh lebih dari 1 ekspresi.
 * @warning   destructor tidak bertangung jawab kepada token yang diberikan.
 * 
 */
public class Expression {

    public static enum EnumSintaks {
        postfix,
        prefix,
        infix
    }
    
    private ArrayList<Token> VectorOfToken = new ArrayList<>();

    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek Expression kosong
     *
     */
    public Expression() {
    }

    /**
     * Copy Constructor
     *
     * Konstruktor yang digunakan untuk membuat Objek Expression dari Objek
     * Expression lain.
     *
     * @param E1
     */
    public Expression(Expression E1){
        int PanjangExpresi = E1.GetLength();
	for (int i = 0; i < PanjangExpresi; ++i)
	{
            VectorOfToken.add(E1.GetToken(i));
	}
    }

    /**
     * Operator assignment
     *
     * Fungsi yang digunakan untuk menyalin objek ekspresi dari objek ekspresi
     *
     */
    public Expression Assign (Expression E1){
        VectorOfToken.clear();
	int PanjangExpresi = E1.GetLength();
	
	for (int i = 0; i < PanjangExpresi; ++i)
	{
		VectorOfToken.add(E1.GetToken(i));
	}

        return this;
    }

	/**
	 * Fungsi GetToken
	 *
	 * Fungsi yang mengembalikan pointer token ke i
	 *
	 * @param i integer
	 * @return pointer to Token
	 */ 

public Token GetToken(int i){
    return VectorOfToken.get(i);
}

	/**
	 * Fungsi GetLength
	 *
	 * Fungsi yang mengembalikan panjang ekspresi
	 *
	 * @param none
	 * @return integer
	 */ 

    public int GetLength(){
        return VectorOfToken.size();
    }

	/**
	 * prosedur AddToken
	 *
	 * Prosedur yang digunakan untuk menambahkan Token ke akhir ekspresi
	 *
	 * @param T Pointer to Token
	 */

    public void AddToken(Token T){
        VectorOfToken.add(T);
    }
}
