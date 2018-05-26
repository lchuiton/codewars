package six;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTest {

  private PigLatin p;

  @Before
  public void setUp() throws Exception {
    p = new PigLatin();

  }

  @Test
  public void testMap() {
    assertEquals("apmay", p.translate("map"));
  }

  @Test
  public void testegg() {
    assertEquals("eggway", p.translate("egg"));
  }

  @Test
  public void testspaghetti() {
    assertEquals("aghettispay", p.translate("spaghetti"));
  }

  @Test
  public void testSansVoyelle() {
    assertEquals("rtlay", p.translate("rtl"));
  }

  @Test
  public void testAvecCaractereNonAlphabetique() {
    assertEquals(null, p.translate("2rtl"));
  }
}
