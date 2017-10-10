package Tsi.Unix;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4, calc.add(3,1));
    }

    @Test
    public void sub() throws Exception {
        assertEquals(2, calc.sub(3,1));
    }

    @Test
    public void mil() throws Exception {
        assertEquals(3, calc.mil(3,1));
    }

    @Test
    public void div() throws Exception {
        assertEquals(4, calc.div(12,3));
    }

}