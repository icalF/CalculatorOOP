/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

import CalculatorCounter.Calculator;

/**
 *
 * @author Ibrohim
 */
public class CommandSet  extends Command {
    private int tipe;
    
    public CommandSet(int _tipe){
        tipe = _tipe;
    }
    
    @Override
    public void execute(){
        
        switch (tipe) 
        {
            case 0 : Calculator.getInstance().SetMathLogic(Penghitung.EnumMathLogic.math);break;
            case 1 : Calculator.getInstance().SetMathLogic(Penghitung.EnumMathLogic.logic);break;
            case 2 : Calculator.getInstance().SetJenisAngka(Bilangan.EnumBilangan.arab);break;
            case 3 : Calculator.getInstance().SetJenisAngka(Bilangan.EnumBilangan.romawi); break;
            case 4 : Calculator.getInstance().SetSintaks(Expression.EnumSintaks.prefix);break;
            case 5 : Calculator.getInstance().SetSintaks(Expression.EnumSintaks.infix);break;
            case 6 : Calculator.getInstance().SetSintaks(Expression.EnumSintaks.postfix);break;
        }
    }
}
