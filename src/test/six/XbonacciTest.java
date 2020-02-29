package six;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XbonacciTest {

  private Xbonacci variabonacci;

  @Before
  public void setUp() {
    System.out.println("Init ");
    variabonacci = new Xbonacci();
  }

  /* @AfterEach
  public void tearDown() {
      variabonacci = null;
  }*/

  @Test
  public void testEmpty() {
    assertArrayEquals(new double[] {}, new Xbonacci().tribonacci(new double[] {1, 1, 1}, 0), 0);
  }

  @Test
  public void testSimple3() {
    double[] test = new double[] {1, 1, 1};
    assertArrayEquals(test, new Xbonacci().tribonacci(new double[] {1, 1, 1}, 3), 0);
  }

  @Test
  public void testSimple4() {
    assertArrayEquals(
        new double[] {1, 1, 1, 3}, new Xbonacci().tribonacci(new double[] {1, 1, 1}, 4), 0);
  }

  @Test
  public void basicTests() {
    assertArrayEquals(
        new double[] {1, 1, 1, 3, 5, 9, 17, 31, 57, 105},
        new Xbonacci().tribonacci(new double[] {1, 1, 1}, 10),
        0);
    assertArrayEquals(
        new double[] {0, 0, 1, 1, 2, 4, 7, 13, 24, 44},
        new Xbonacci().tribonacci(new double[] {0, 0, 1}, 10),
        0);
    assertArrayEquals(
        new double[] {0, 1, 1, 2, 4, 7, 13, 24, 44, 81},
        new Xbonacci().tribonacci(new double[] {0, 1, 1}, 10),
        0);
  }

  @Test
  public void testSimpleLessThan3Iter() {
    assertArrayEquals(new double[] {15}, new Xbonacci().tribonacci(new double[] {15, 17, 7}, 1), 0);
  }
}
