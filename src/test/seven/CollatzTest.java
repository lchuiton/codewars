package seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollatzTest {

  @Test
  public void test0() {
    assertEquals(8, Collatz.conjecture(20));
  }
}
