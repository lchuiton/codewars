package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPhoneNumberTest {

  @Test
  public void test0() {
    assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));

  }

  @Test
  public void test1() {
    assertEquals(false, ValidPhoneNumber.validPhoneNumber("test(123) 456-7890"));

  }

  @Test
  public void test2() {
    assertEquals(false, ValidPhoneNumber.validPhoneNumber("(123) 456-7890test"));

  }
}
