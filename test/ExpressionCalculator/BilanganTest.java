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
public class BilanganTest {
    
    public BilanganTest() {
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
     * Test of toString method, of class Bilangan.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Bilangan instance = new BilanganImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetType method, of class Bilangan.
     */
    @Test
    public void testGetType() {
        System.out.println("GetType");
        Bilangan instance = new BilanganImpl();
        Token.EnumType expResult = null;
        Token.EnumType result = instance.GetType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetValue method, of class Bilangan.
     */
    @Test
    public void testGetValue() {
        System.out.println("GetValue");
        Bilangan instance = new BilanganImpl();
        double expResult = 0.0;
        double result = instance.GetValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BilanganImpl extends Bilangan {

        public String toString() {
            return "";
        }

        public double GetValue() {
            return 0.0;
        }
    }
    
}
