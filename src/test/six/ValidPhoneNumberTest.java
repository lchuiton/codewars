package six;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
