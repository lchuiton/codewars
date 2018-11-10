package four;

import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;
import org.junit.Test;

public class MagnetsTest {

  private static void assertFuzzyEquals(double act, double exp) {
    boolean inrange = Math.abs(act - exp) <= 1e-6;
    if (!inrange) {
      DecimalFormat df = new DecimalFormat("#0.000000");
      System.out.println("At 1e-6: Expected must be " + df.format(exp) + ", but got " + df.format(act));
    }
    assertTrue(inrange);
  }

  @Test
  public void testSimple() {
    assertFuzzyEquals(Magnets.doubles(1, 1), 0.25);
    assertFuzzyEquals(Magnets.doubles(1, 2), 0.3611111111111111);
    assertFuzzyEquals(Magnets.doubles(1, 3), 0.4236111111111111);
  }

  @Test
  public void testUneLigne() {
    assertFuzzyEquals(Magnets.doubles(1, 10), 0.5580321939764581);
  }

  @Test
  public void testPlusieursLignes() {
    assertFuzzyEquals(Magnets.doubles(10, 1000), 0.6921486500921933);

  }

  @Test
  public void tests() {
    assertFuzzyEquals(Magnets.doubles(10, 10000), 0.6930471674194457);
    assertFuzzyEquals(Magnets.doubles(20, 10000), 0.6930471955575918);
    // assertFuzzyEquals(Magnets.doubles(10000, 100000), 0.7);

  }
}