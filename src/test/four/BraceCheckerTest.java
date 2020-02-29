package four;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
