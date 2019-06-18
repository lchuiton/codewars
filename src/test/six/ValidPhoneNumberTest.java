package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPhoneNumberTest {

    @Test
    public void test0() {
        assertTrue(ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));

    }

    @Test
    public void test1() {
        assertFalse(ValidPhoneNumber.validPhoneNumber("test(123) 456-7890"));

    }

    @Test
    public void test2() {
        assertFalse(ValidPhoneNumber.validPhoneNumber("(123) 456-7890test"));

    }
}
