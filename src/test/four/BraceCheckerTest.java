package four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BraceCheckerTest {

    private final BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("(})"));
        assertFalse(checker.isValid(")(}{]["));
    }

    @Test
    public void test1() {
        assertTrue(checker.isValid("(){}[]"));
    }

    @Test
    public void test2() {
        assertFalse(checker.isValid("[(])"));
    }

    @Test
    public void test3() {
        assertTrue(checker.isValid("([{}])"));
    }

}