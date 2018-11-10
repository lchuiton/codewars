package seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfVowelsTest {

  @Test
  public void testCase1() {
    assertEquals("Nope!", 5, NumberOfVowels.getCount("abracadabra"));
  }
}
