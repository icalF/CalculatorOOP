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
public class OperatorTest {
    
    public OperatorTest() {
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
     * Test of GetJenisOperator method, of class Operator.
     */
    @Test
    public void testGetJenisOperator() {
        System.out.println("GetJenisOperator");
        Operator instance = new Operator();
        Operator.EnumOperator expResult = null;
        Operator.EnumOperator result = instance.GetJenisOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Operator.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Operator instance = new Operator();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetType method, of class Operator.
     */
    @Test
    public void testGetType() {
        System.out.println("GetType");
        Operator instance = new Operator("*");
        Token.EnumType expResult = null;
        Token.EnumType result = instance.GetType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
