package eight;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NumberToReverseArrayTest {

  @Test
  public void tests() {
    assertArrayEquals(new int[]{1, 3, 2, 5, 3}, NumberToReverseArray.digitize(35231));
  }
}