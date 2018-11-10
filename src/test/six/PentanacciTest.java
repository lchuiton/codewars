package six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PentanacciTest {

  @Test
  public void test1() {
    System.out.println("Fixed Tests: countOddPentaFib, low values");
    long[] lstI = new long[]{45, 68, 76, 100, 121};
    long[] resultsI = new long[]{15, 23, 25, 33, 40};
    for (int i = 0; i <= 4; i++) {
      assertEquals(Pentanacci.countOddPentaFib(lstI[i]), resultsI[i]);
    }
  }
}
