package poly;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathFuncTest {
    private MathFunc mathFunc;

    @Before
    public void init() {
        mathFunc = new MathFunc();
    }

    @After
    public void tearDown() {
        mathFunc = null;
    }

    @Test
    public void calls() {
        assertEquals(0, mathFunc.getCalls());

        mathFunc.factorial(1);
        assertEquals(1, mathFunc.getCalls());

        mathFunc.factorial(1);
        assertEquals(2, mathFunc.getCalls());
    }

    @Test
    public void factorial() {
        assertTrue(mathFunc.factorial(0) == 1);
        assertTrue(mathFunc.factorial(1) == 1);
        assertTrue(mathFunc.factorial(2) == 120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegative() {
        mathFunc.factorial(-1);
    }

    @Ignore
    @Test
    public void todo() {
        assertTrue(mathFunc.plus(1, 1) == 3);
    }
}