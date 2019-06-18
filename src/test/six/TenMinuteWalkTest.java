package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TenMinuteWalkTest {

    @Test
    public void test1() {
        assertTrue(TenMinuteWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}), "Should return true");
    }

    @Test
    public void test2() {
        assertFalse(TenMinuteWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}), "Should return false");
    }

    @Test
    public void test3() {
        assertFalse(TenMinuteWalk.isValid(new char[]{'w'}), "Should return false");
    }

    @Test
    public void test4() {
        assertFalse(TenMinuteWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}), "Should return false");
    }
}
