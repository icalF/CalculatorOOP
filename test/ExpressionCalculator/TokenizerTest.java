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
public class TokenizerTest {
    
    public TokenizerTest() {
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
     * Test of SetModeBilangan method, of class Tokenizer.
     */
    @Test
    public void testSetModeBilangan() {
        System.out.println("SetModeBilangan");
        Bilangan.EnumBilangan B = null;
        Tokenizer instance = new Tokenizer();
        instance.SetModeBilangan(B);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Parse method, of class Tokenizer.
     */
    @Test
    public void testParse() throws Exception {
        System.out.println("Parse");
        String s = "";
        Tokenizer instance = new Tokenizer();
        Expression expResult = null;
        Expression result = instance.Tokenize(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
