/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * All code and works here are created by Satria Priambada and team
 * You are free to use and distribute the code
 * We do not take responsibilities for any damage caused by using this code
 */
package CalculatorCounter;

import ExpressionCalculator.Bilangan;
import ExpressionCalculator.Expression;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static java.lang.System.out;
import java.nio.charset.StandardCharsets;
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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of SetSintaks method, of class Calculator.
     */
    @Test
    public void testSetSintaks() {
        System.out.println("SetSintaks");
        Expression.EnumSintaks S = Expression.EnumSintaks.infix;
        Calculator instance = new Calculator();
        instance.SetSintaks(S);
        // TODO review the generated test code and remove the default call to fail.
        //assertEqual("mode_sintaks",S, instance);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetJenisAngka method, of class Calculator.
     */
    @Test
    public void testSetJenisAngka() {
        System.out.println("SetJenisAngka");
        Bilangan.EnumBilangan B = null;
        Calculator instance = new Calculator();
        instance.SetJenisAngka(B);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Run method, of class Calculator.
     * @throws java.lang.Exception
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("Run");
        Calculator instance = new Calculator();
        
        //Masukkan string input
        String exampleString = "2 + 2\n"
                + "2 + 4\n";
        InputStream in = new ByteArrayInputStream(exampleString.getBytes(StandardCharsets.UTF_8));
        //buat output
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));


  instance.Run(in, out);
  assertEquals(false, out.toString().contains("3.0\n"));
  
  // optionally, reset System.in to its original
    System.setIn(System.in);
    System.setOut(stdout);
  //assertThat(output.toString(), contains("Proses selsai")););
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of JalankanPerintah method, of class Calculator.
     * @throws java.lang.Exception
     */
    @Test
    public void testJalankanPerintah() throws Exception {
        System.out.println("JalankanPerintah");
        Expression E = null;
        Calculator instance = new Calculator();
        //instance.JalankanPerintah(E);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
