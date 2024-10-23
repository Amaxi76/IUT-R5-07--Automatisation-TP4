package TP4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testAddition() {
        App app = new App();
        assertEquals(5.0, app.addition(2.0, 3.0));
        assertEquals(-1.0, app.addition(2.0, -3.0));
        assertEquals(0.0, app.addition(0.0, 0.0));
    }

    public void testSoustraction() {
        App app = new App();
        assertEquals(2.0, app.soustraction(5.0, 3.0));
        assertEquals(5.0, app.soustraction(2.0, -3.0));
        assertEquals(0.0, app.soustraction(0.0, 0.0));
    }

    public void testMultiplication() {
        App app = new App();
        assertEquals(6.0, app.multiplication(2.0, 3.0));
        assertEquals(-6.0, app.multiplication(2.0, -3.0));
        assertEquals(0.0, app.multiplication(0.0, 3.0));
    }

    public void testDivision() {
        App app = new App();
        assertEquals(2.0, app.division(6.0, 3.0));
        assertEquals(-2.0, app.division(6.0, -3.0));
        assertEquals(0.0, app.division(0.0, 3.0));
        try {
            app.division(6.0, 0.0);
            fail("Division by zero should throw an exception");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }
}
