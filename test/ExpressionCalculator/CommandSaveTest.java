/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Ibrohim
 */
public class CommandSaveTest {
    
    public CommandSaveTest() {
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
    
    /**
     * Test of execute method, of class Command.
     */
    @Test
    public void testExecute() {
        Command instance = new CommandSave();
        
        instance.execute();
        
        assertEquals("Proses save" + System.getProperty("line.separator"), outContent.toString());
    }
    
}