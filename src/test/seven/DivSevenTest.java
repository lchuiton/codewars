package seven;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DivSevenTest {

  @Test
  public void testBase() {
    assertArrayEquals(new long[] {7, 2}, DivSeven.seven(1603));
    assertArrayEquals(new long[] {35, 1}, DivSeven.seven(371));
    assertArrayEquals(new long[] {42, 1}, DivSeven.seven(483));
  }

  @Test
  public void test1() {
    assertArrayEquals(new long[] {0, 0}, DivSeven.seven(0));
  }
}
