package seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {

  private final Sum s = new Sum();

  @Test
  public void testBase() {
    assertEquals(-1, s.getSum(0, -1));
    assertEquals(1, s.getSum(0, 1));
  }

  @Test
  public void test1() {
    assertEquals(2, s.getSum(-1, 2));
  }

}