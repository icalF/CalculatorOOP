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
public class ExpressionTest {
    
    public ExpressionTest() {
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
     * Test of Assign method, of class Expression.
     */
    @Test
    public void testAssign() {
        System.out.println("Assign");
        Expression E1 = null;
        Expression instance = new Expression();
        Expression expResult = null;
        Expression result = instance.Assign(E1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetToken method, of class Expression.
     */
    @Test
    public void testGetToken() {
        System.out.println("GetToken");
        int i = 0;
        Expression instance = new Expression();
        Token expResult = null;
        Token result = instance.GetToken(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetLength method, of class Expression.
     */
    @Test
    public void testGetLength() {
        System.out.println("GetLength");
        Expression instance = new Expression();
        int expResult = 0;
        int result = instance.GetLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddToken method, of class Expression.
     */
    @Test
    public void testAddToken() {
        System.out.println("AddToken");
        Token T = null;
        Expression instance = new Expression();
        instance.AddToken(T);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
