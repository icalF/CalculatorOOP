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
public class PerintahTest {
    
    public PerintahTest() {
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
     * Test of GetJenisPerintah method, of class Perintah.
     */
    @Test
    public void testGetJenisPerintah() {
        System.out.println("GetJenisPerintah");
        Perintah instance = new Perintah();
        Perintah.EnumPerintah expResult = null;
        Perintah.EnumPerintah result = instance.GetJenisPerintah();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Perintah.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Perintah instance = new Perintah();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetType method, of class Perintah.
     */
    @Test
    public void testGetType() {
        System.out.println("GetType");
        Perintah instance = new Perintah();
        Token.EnumType expResult = null;
        Token.EnumType result = instance.GetType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
