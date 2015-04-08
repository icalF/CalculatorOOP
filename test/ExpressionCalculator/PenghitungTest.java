/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * All code and works here are created by Satria Priambada and team
 * You are free to use and distribute the code
 * We do not take responsibilities for any damage caused by using this code
 */
package ExpressionCalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Satria
 */
public class PenghitungTest {
    
    public PenghitungTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Calculate method, of class Penghitung.
     */
    @Test
    public void testCalculate() throws Exception {
        System.out.println("Calculate");
        Expression E = null;
        Penghitung instance = new Penghitung();
        double expResult = 0.0;
        double result = instance.Calculate(E);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetSintaks method, of class Penghitung.
     */
    @Test
    public void testSetSintaks() {
        System.out.println("SetSintaks");
        Expression.EnumSintaks Mode = null;
        Penghitung instance = new Penghitung();
        instance.SetSintaks(Mode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateAtom method, of class Penghitung.
     */
    @Test
    public void testCalculateAtom() throws Exception {
        System.out.println("CalculateAtom");
        double a = 0.0;
        double b = 0.0;
        Operator o = null;
        Penghitung instance = new Penghitung();
        double expResult = 0.0;
        double result = instance.CalculateAtom(a, b, o);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculatePostfix method, of class Penghitung.
     */
    @Test
    public void testCalculatePostfix() throws Exception {
        System.out.println("CalculatePostfix");
        Expression E = null;
        Penghitung instance = new Penghitung();
        double expResult = 0.0;
        double result = instance.CalculatePostfix(E);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertPrefix method, of class Penghitung.
     */
    @Test
    public void testConvertPrefix() {
        System.out.println("ConvertPrefix");
        Expression prefix = null;
        Penghitung instance = new Penghitung();
        Expression expResult = null;
        Expression result = instance.ConvertPrefix(prefix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertInfix method, of class Penghitung.
     */
    @Test
    public void testConvertInfix() throws Exception {
        System.out.println("ConvertInfix");
        Expression E = null;
        Penghitung instance = new Penghitung();
        Expression expResult = null;
        Expression result = instance.ConvertInfix(E);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
