package four;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BraceCheckerTest {

  private BraceChecker checker = new BraceChecker();

  @Test
  public void testValid() {
    assertEquals(true, checker.isValid("()"));
  }

  @Test
  public void testInvalid() {
    assertEquals(false, checker.isValid("[(])"));
    assertEquals(false, checker.isValid("(}"));
    assertEquals(false, checker.isValid("(})"));
    assertEquals(false, checker.isValid(")(}{]["));
  }

  @Test
  public void test1() {
    assertEquals(true, checker.isValid("(){}[]"));
  }

  @Test
  public void test2() {
    assertEquals(false, checker.isValid("[(])"));
  }

  @Test
  public void test3() {
    assertEquals(true, checker.isValid("([{}])"));
  }

}