/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressionCalculator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ibrohim
 */
public class CommandTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
    public CommandTest() {
    }

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
        //System.out.println("execute");
        Command instance = new CommandImpl();
        instance.execute();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals("Command", outContent.toString());
    }

    public class CommandImpl extends Command {

        @Override
        public void execute() {
            System.out.print("Command");
        }
    }
    
}
