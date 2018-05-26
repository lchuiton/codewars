package eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SmashWordsTest {

  @Test
  public void validate() {
    assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
  }

  @Test
  public void validateEmpty() {
    assertEquals("", SmashWords.smash(new String[] {}));
  }

  @Test
  public void validateNull() {
    assertNull(SmashWords.smash(null));
  }

  @Test
  public void validateOneWord() {
    assertEquals("Bilal", SmashWords.smash(new String[] { "Bilal" }));
  }

}
