package JUnitPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberHelperTest {
    NumberHelper numberHelper;

    @Test
    public void testcheckEvenOdd(){
        assertEquals("even", numberHelper.checkEvenOdd(124));
        assertEquals("odd", numberHelper.checkEvenOdd(121));
    }

    @Test
    public void testcheckSign(){
        assertEquals("positive", numberHelper.checkSign(124));
        assertEquals("negative", numberHelper.checkSign(-121));
        assertEquals("zero", numberHelper.checkSign(0));
    }

    @Test
    public void testisWithinRange(){
       assertTrue(numberHelper.isWithinRange(50));
       assertFalse(numberHelper.isWithinRange(150));
    }


}
