package seven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AreaOfACircleTest {

  @Test
  public void testKnownValues() {
    try {
      AreaOfACircle.area(0);
      fail("Radius of 0 should throw an IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      System.out.println("Will never happen");
    }
    for (int i = 0; i < 3; i++) {
      double x = 3D;
      assertEquals(28.27D, AreaOfACircle.area(x), 0.01);
    }
  }
}