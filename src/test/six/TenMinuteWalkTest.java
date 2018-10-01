package six;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TenMinuteWalkTest {
    @Test
    public void test1() {
        assertTrue("Should return true", TenMinuteWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @Test
    public void test2() {
        assertFalse("Should return false", TenMinuteWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    }

    @Test
    public void test3() {
        assertFalse("Should return false", TenMinuteWalk.isValid(new char[]{'w'}));
    }

    @Test
    public void test4() {
        assertFalse("Should return false", TenMinuteWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
