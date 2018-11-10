package seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareEveryDigitTest {

  @Test
  public void test() {
    assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
  }

}