/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorCounter;
import ExpressionCalculator.Expression;
import java.util.ArrayList;


/**
 * Class EksekutorPerintah
 *
 * Kelas yang digunakan untuk menyimpan list ekspresi, merupakan pembungkusan
 * vector of ekspression.
 * Pada destructor, semua token yang terdapat pada ekspresi dihapus.
 * @author Ibrohim Kholilul Islam
 * @version 0.1
 *
 */
public class EksekutorPerintah {
    //ctor

    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek Memori kosong
     *
     */
    EksekutorPerintah(){
        VectorOfExpression = new ArrayList<>(10);
    }


// memori bertanggung jawab atas penghapusan token
    // tidak diperlukan cctor dan opr= karena tidak pernah ada assignmen memori
    /**
     * prosedur AddExpressionToken
     *
     * Prosedur yang digunakan untuk menambahkan Expression ke akhir memori
     *
     */
    public void AddExpression(Expression E){
        System.out.println("Proses memasukkan ekspresi ke memori");
    }

	/**
	 * Fungsi GetExpression
	 *
	 * Fungsi yang mengembalikan Expression ke i dari memori
	 *
	 * @param i integer
	 */

public void GetExpression(int i){
    System.out.println("Proses show ekspresi memori ke - " + i);
}

    /**
     * Fungsi GetAllExpression
     *
     * Fungsi yang mengembalikan vector
     *
     */
    public void GetAllExpression(){
        System.out.println("Proses menampilkan seluruh memori");
    }

    /**
     * Fungsi GetLength
     *
     * Fungsi yang mengembalikan banyaknya ekspresi dari memori
     *
     * @return integer
     */
    public int GetLength(){
        return VectorOfExpression.size();
    }

    /**
     * Fungsi Undo
     *
     * Fungsi yang mengembalikan boolean apakah perintah undo berhasi
     *
     * @param n integer
     */
    public void Undo(int n){
        System.out.println("Proses undo memori sebanyak " + n);
    }

    /**
     * Fungsi Redo
     *
     * Fungsi yang mengembalikan Expresi hasil perintah redo
     *
     */
    public void Redo(){
        System.out.println("Proses redo");
    }

    /**
     * Prosedur Save
     *
     * Prosedur yang digunakan untuk menyimpan isi memori ke file
     *
     */
    public void Save(){
        System.out.println("Proses save ke file");
    }

    /**
     * Prosedur ShowMem
     *
     * Prosedur yang digunakan menampilkan n Ekspresi terakhir ke layar
     *
     * @param n integer
     */
    public void ShowMem(int n){
        System.out.println("Proses show memori sebanyak " + n);
    }

    /**
     * Prosedur ShowAll
     *
     * Prosedur yang digunakan menampilkan semua Ekspresi dari memori ke layar
     *
     */
    public void ShowAll(){
        System.out.println("Proses show all");
    }
    private ArrayList<Expression> VectorOfExpression;
    private int head;
    private int length;
}
