/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorCounter;

import ExpressionCalculator.PenghitungException;
import ExpressionCalculator.Penghitung;
import java.util.EmptyStackException;
import ExpressionCalculator.TokenizerException;
import ExpressionCalculator.Tokenizer;
import ExpressionCalculator.*;
import ExpressionCalculator.Bilangan.EnumBilangan;
import ExpressionCalculator.Expression.EnumSintaks;
import ExpressionCalculator.Penghitung.EnumMathLogic;
import ExpressionCalculator.Perintah.EnumPerintah;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Class Calculator
 *
 * Kelas utama kalkulator yang melakukan loop input-proses-output
 *
 * @author Satria Priambada
 * @version 0.1
 *
 */
public class Calculator {

private static Calculator instance;
private Penghitung.EnumMathLogic mode_mathLogic;
private Expression.EnumSintaks mode_sintaks;
private Bilangan.EnumBilangan mode_bilangan;
private Penghitung PenghitungCalculator = new Penghitung();
private Tokenizer TokenizerCalculator = new Tokenizer();
private final Scanner scanner = new Scanner(System.in);


    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek calculator dengan mode
     * default
     *
     */

    public Calculator(){
        PenghitungCalculator = new Penghitung();
        TokenizerCalculator = new Tokenizer();
        mode_bilangan = EnumBilangan.arab;
        mode_sintaks = EnumSintaks.infix;
        mode_mathLogic = EnumMathLogic.math;
        instance = this;
    }

    public static Calculator getInstance(){
        if (instance==null)
            instance = new Calculator();
        
        return instance;
    }
    
    //tidak diperlukan cctor dan opr= karena tidak pernah ada passing calculator
    //Setter

    /**
     * Prosedur SetSintaks
     *
     * Prosedur yang digunakan untuk mengubah Mode Sintaks
     *
     * @param S EnumSintaks
     */
    public void SetSintaks(Expression.EnumSintaks S){
        mode_sintaks = S;
	PenghitungCalculator.SetSintaks(S);
    }

    /**
     * Prosedur SetJenisAngka
     *
     * Prosedur yang digunakan untuk mengubah Mode Jenis Angka
     *
     * @param B EnumBilangan
     */
    public void SetJenisAngka(Bilangan.EnumBilangan B){
        mode_bilangan = B;
	TokenizerCalculator.SetModeBilangan(B);
    }
    
    /**
     * Prosedur SetMathLogic
     *
     * Prosedur yang digunakan untuk mengubah Mode Math atau Logic
     *
     * @param L Mode baru menjadi math atau logic
     */
    public void SetMathLogic(Penghitung.EnumMathLogic L){
        mode_mathLogic = L;
	PenghitungCalculator.SetMathLogic(L);
    }
    //Eksekusi

    /**
     * Prosedur Run
     *
     * Prosedur yang melakukan rutin input-proses-output
     *
     * @throws java.io.IOException saat terjadi kesalahan masukan
     * @throws ExpressionCalculator.PenghitungException saat terjadi kesalahan expresi dan perhitungan
     */
    public void Run() throws IOException, PenghitungException{
        //Default
	//Bilangan Arab
	mode_bilangan = Bilangan.EnumBilangan.arab;
	TokenizerCalculator.SetModeBilangan(Bilangan.EnumBilangan.arab);
	//Sintaks infix
	mode_sintaks = Expression.EnumSintaks.infix;
	PenghitungCalculator.SetSintaks(Expression.EnumSintaks.infix);

	String s = scanner.nextLine();

	while (!s.equals("exit")) {
            Expression e;
            if(s.length()>0)
            {
                try {
                    e = TokenizerCalculator.Tokenize(s);
                    if (e.GetLength() > 0)
                    {
                        Token firstToken = e.GetToken(0);
                        if (firstToken.GetType() == Token.EnumType.cmd) {
                            try {
                                    JalankanPerintah(e);
                            }
                            catch (CalculatorException E) {
                                    System.out.println(E.getMessage());
                            }
                        }
                        else {
                            try {				
                                double hasil = PenghitungCalculator.Calculate(e);
                                Bilangan hasilB;// = new Bilangan();
                                
                                if (mode_bilangan == Bilangan.EnumBilangan.romawi)
                                    hasilB = new BilRomawi(hasil);
                                else //if (mode_bilangan == Bilangan.EnumBilangan.arab)
                                    hasilB = new BilArab(hasil);
                                
                                if (mode_mathLogic == Penghitung.EnumMathLogic.math){
                                    System.out.println(hasilB.toString());
                                }else {//mode logic
                                    if (hasilB.GetValue() == 0){
                                        System.out.println("false");
                                    }else{//Hasil bukan 0 dianggap true
                                        System.out.println("true");
                                    }
                                }
                                
                            } catch (Exception E) {
                                    System.out.println(E.getMessage());
                            }
                        }
                    }
                } catch (TokenizerException E) {
                    System.out.println(E.getMessage());
                }		
            }
            s = scanner.nextLine();
	}
    }

    /**
     * Prosedur JalankanPerintah
     *
     * Prosedur yang melakukan expresi perintah
     *
     * @param E Expression
     * @throws CalculatorCounter.CalculatorException bila kalkulator error
     */
    public void JalankanPerintah(Expression E) throws CalculatorException{
        Token Tperintah;
	String strToken;

	Tperintah = E.GetToken(0);
	EnumPerintah cmdToken = ((Perintah) Tperintah).GetJenisPerintah();
	switch (cmdToken){
            case set : 
                {
                    if (E.GetLength()==2)
                    {
                        Token TokenParam = E.GetToken(1);
                        if (TokenParam.GetType() != Token.EnumType.bil) throw new CalculatorException("[syntax error]");

                        Bilangan bilParam = (Bilangan) TokenParam;
                        int setParam = (int)bilParam.GetValue();

                        EksekutorPerintah.getInstance().runCommand(new CommandSet(setParam));
                    }
                    else
                        throw new CalculatorException("[syntax error]");
                }
                break;
            case undo : 
                {
                    int undoParam = 1;

                    if (E.GetLength()==2)
                    {
                            Token TokenParam = E.GetToken(1);
                            if (TokenParam.GetType() != Token.EnumType.bil) throw new CalculatorException("[syntax error]");

                            Bilangan bilParam = (Bilangan) TokenParam;
                            undoParam = (int)bilParam.GetValue();
                    }
                    else if (E.GetLength() > 2)
                            throw new CalculatorException("[syntax error]");

                    EksekutorPerintah.getInstance().runCommand(new CommandUndo(undoParam));
                }
                break;
            case redo :
                {
                    int redoParam = 1;

                    if (E.GetLength()==2)
                    {
                        Token TokenParam = E.GetToken(1);
                        //Jika argumen bukan bilangan maka throw execption
                        if (TokenParam.GetType() != Token.EnumType.bil) throw new CalculatorException("[syntax error]");

                        Bilangan bilParam = (Bilangan) TokenParam;
                        redoParam = (int)bilParam.GetValue();
                    }
                    else if (E.GetLength() > 2)
                        throw new CalculatorException("[syntax error]");

                    
                    EksekutorPerintah.getInstance().runCommand(new CommandRedo(redoParam));
                }
                break;
            case showmem :
                {
                    if (E.GetLength()==2)
                    {
                        Token TokenParam = E.GetToken(1);
                        if (TokenParam.GetType() != Token.EnumType.bil) throw  new CalculatorException("[syntax error]");

                        Bilangan bilParam = (Bilangan) TokenParam;
                        int showMemParam = (int)bilParam.GetValue();

                        EksekutorPerintah.getInstance().runCommand(new CommandShowMem(showMemParam));
                    }
                    else
                        throw new CalculatorException("[syntax error]");
                }
                break;
            case showall :
                {
                    EksekutorPerintah.getInstance().runCommand(new CommandShowAll());
                }
                break;
            case save :
                {
                    EksekutorPerintah.getInstance().runCommand(new CommandSave());
                }
                break;
	}
    }
    
    Object Run(InputStream in, PrintStream output) throws PenghitungException {
        Scanner keyboard = new Scanner(in);
        String s = keyboard.nextLine();

	//while (!s.equals("exit")) {
            Expression e;
            if(s.length()>0)
            {
                try {
                    e = TokenizerCalculator.Tokenize(s);
                    if (e.GetLength() > 0)
                    {
                        Token firstToken = e.GetToken(0);
                        if (firstToken.GetType() == Token.EnumType.cmd) {
                            try {
                                    JalankanPerintah(e);
                            }
                            catch (CalculatorException E) {
                                    System.out.println(E.getMessage());
                            }
                        }
                        else {
                            try {				
                                double hasil = PenghitungCalculator.Calculate(e);
                                Bilangan hasilB;// = new Bilangan();
                                
                                if (mode_bilangan == Bilangan.EnumBilangan.romawi)
                                    hasilB = new BilRomawi(hasil);
                                else //if (mode_bilangan == Bilangan.EnumBilangan.arab)
                                    hasilB = new BilArab(hasil);
                                    
                                if (mode_mathLogic == Penghitung.EnumMathLogic.math){
                                    System.out.println(hasilB.toString());
                                    output.println(hasilB.toString());
                                }else {//mode logic
                                    if (hasilB.GetValue() == 0){
                                        System.out.println("false");
                                    }else{//Hasil bukan 0 dianggap true
                                        System.out.println("true");
                                    }
                                }
                                
                            } catch (EmptyStackException E) {
                                    throw new PenghitungException("Stack kosong");
                            } catch (PenghitungException E) {
                                    System.out.println(E.getMessage());
                            }
                        }
                    }
                } catch (TokenizerException E) {
                    System.out.println(E.getMessage());
                }		
            }
            s = keyboard.nextLine();
	//}
    output.println("proses selesai");  
    return 1;  
    }
}

