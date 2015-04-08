/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * All code and works here are created by Satria Priambada and team
 * You are free to use and distribute the code
 * We do not take responsibilities for any damage caused by using this code
 */
package CalculatorCounter;

import ExpressionCalculator.Expression;
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
public class EksekutorPerintahTest {
    
    public EksekutorPerintahTest() {
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
     * Test of AddExpression method, of class EksekutorPerintah.
     */
    @Test
    public void testAddExpression() {
        System.out.println("AddExpression");
        Expression E = null;
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.AddExpression(E);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetExpression method, of class EksekutorPerintah.
     */
    @Test
    public void testGetExpression() {
        System.out.println("GetExpression");
        int i = 0;
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.GetExpression(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllExpression method, of class EksekutorPerintah.
     */
    @Test
    public void testGetAllExpression() {
        System.out.println("GetAllExpression");
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.GetAllExpression();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetLength method, of class EksekutorPerintah.
     */
    @Test
    public void testGetLength() {
        System.out.println("GetLength");
        EksekutorPerintah instance = new EksekutorPerintah();
        int expResult = 0;
        int result = instance.GetLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Undo method, of class EksekutorPerintah.
     */
    @Test
    public void testUndo() {
        System.out.println("Undo");
        int n = 0;
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.Undo(n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Redo method, of class EksekutorPerintah.
     */
    @Test
    public void testRedo() {
        System.out.println("Redo");
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.Redo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Save method, of class EksekutorPerintah.
     */
    @Test
    public void testSave() {
        System.out.println("Save");
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.Save();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ShowMem method, of class EksekutorPerintah.
     */
    @Test
    public void testShowMem() {
        System.out.println("ShowMem");
        int n = 0;
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.ShowMem(n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ShowAll method, of class EksekutorPerintah.
     */
    @Test
    public void testShowAll() {
        System.out.println("ShowAll");
        EksekutorPerintah instance = new EksekutorPerintah();
        instance.ShowAll();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
