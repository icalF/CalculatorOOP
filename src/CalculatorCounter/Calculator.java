/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorCounter;

import java.util.EmptyStackException;
import ExpressionCalculator.ParserException;
import ExpressionCalculator.Parser;
import ExpressionCalculator.*;
import ExpressionCalculator.Perintah.EnumPerintah;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class Calculator
 *
 * Kelas utama kalkulator yang melakukan loop input-proses-output
 *
 * @class Calculator Calculator.h "Calculator.h"
 * @package CalculatorCounter
 * @brief Kelas utama kalkulator yang melakukan loop input-proses-output
 * @author Satria Priambada
 * @version 0.1
 * @date April 2015
 * @warning -
 *
 */
public class Calculator {

private Expression.EnumSintaks mode_sintaks;
private Bilangan.EnumBilangan mode_bilangan;
private EksekutorPerintah EksekutorCalculator = new EksekutorPerintah();
private Penghitung PenghitungCalculator = new Penghitung();
private Parser ParserCalculator = new Parser();
private final Scanner scanner = new Scanner(System.in);


    /**
     * Constructor default
     *
     * Konstruktor yang digunakan untuk membuat Objek calculator dengan mode
     * default
     *
     * @param none
     * @return double
     */

    public Calculator(){
        EksekutorCalculator = new EksekutorPerintah();
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
	EksekutorCalculator = new EksekutorPerintah();
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
	ParserCalculator.SetModeBilangan(B);
        EksekutorCalculator = new EksekutorPerintah();
    }
    //Eksekusi

    /**
     * Prosedur Run
     *
     * Prosedur yang melakukan rutin input-proses-output
     *
     * @throws java.io.IOException
     */
    public void Run() throws IOException, PenghitungException{
        //Default
	//Bilangan Arab
	mode_bilangan = Bilangan.EnumBilangan.arab;
	ParserCalculator.SetModeBilangan(Bilangan.EnumBilangan.arab);
	//Sintaks infix
	mode_sintaks = Expression.EnumSintaks.infix;
	PenghitungCalculator.SetSintaks(Expression.EnumSintaks.infix);

	String s = scanner.nextLine();

	while (!s.equals("exit")) {
		Expression e;

		try {
			
			e = ParserCalculator.Parse(s);
			
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
							hasilB = new Romawi(hasil);
						else //if (mode_bilangan == Bilangan.EnumBilangan.arab)
							hasilB = new Arab(hasil);
						System.out.println(hasilB.Display());

						EksekutorCalculator.AddExpression(e);
					} catch (EmptyStackException E) {
						throw new PenghitungException("Stack kosong");
					} catch (PenghitungException E) {
						System.out.println(E.getMessage());
					} 
                                        
				}
			}
		} catch (ParserException E) {
			System.out.println(E.getMessage());
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

					switch (setParam) 
					{
						case 0 : break;
						case 1 : break;
						case 2 : SetJenisAngka(Bilangan.EnumBilangan.arab);break;
						case 3 : SetJenisAngka(Bilangan.EnumBilangan.romawi); break;
						case 4 : SetSintaks(Expression.EnumSintaks.prefix);break;
						case 5 : SetSintaks(Expression.EnumSintaks.infix);break;
						case 6 : SetSintaks(Expression.EnumSintaks.postfix);break;

					}
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

				EksekutorCalculator.Undo(undoParam);
			break;
                        }
		case redo :
			{
				int redoParam = 1;

				if (E.GetLength()==2)
				{
					Token TokenParam = E.GetToken(1);
					if (TokenParam.GetType() != Token.EnumType.bil) throw new CalculatorException("[syntax error]");

					Bilangan bilParam = (Bilangan) TokenParam;
					redoParam = (int)bilParam.GetValue();
				}
				else if (E.GetLength() > 2)
					throw new CalculatorException("[syntax error]");

				for (int i = 0; i < redoParam; ++i) {
					EksekutorCalculator.Redo();
				}
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

					EksekutorCalculator.ShowMem(showMemParam);
				}
				else
					throw new CalculatorException("[syntax error]");
			}
			break;
		case showall :
			{
				EksekutorCalculator.ShowAll();
			}
			break;
		case save :
			{
				EksekutorCalculator.Save();
			}
			break;
	}
    System.out.println("Kejamnya dunia");
    }
    
}

