package seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfVowelsTest {

  @Test
  public void testCase1() {
    assertEquals("Nope!", 5, NumberOfVowels.getCount("abracadabra"));
  }
}
