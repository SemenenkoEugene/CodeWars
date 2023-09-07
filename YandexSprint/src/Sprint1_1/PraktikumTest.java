package Sprint1_1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PraktikumTest {

    @Test
    public void isLeapYear2000() {
        assertTrue(Praktikum.isLeapYear(2000));
    }

    @Test
    public void isLeapYear2004() {
        assertTrue(Praktikum.isLeapYear(2004));
    }

    @Test
    public void isLeapYear2001() {
        assertFalse(Praktikum.isLeapYear(2001));
    }

    @Test
    public void isLeapYear2100() {
        assertFalse(Praktikum.isLeapYear(2100));
    }
}
