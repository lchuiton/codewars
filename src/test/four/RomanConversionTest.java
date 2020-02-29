package four;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanConversionTest {

  private final RomanConversion conversion = new RomanConversion();

  @Test
  public void shouldCovertUnitesToRoman() {
    assertEquals("solution(1) should equal to ", conversion.convert(0), "");
    assertEquals("solution(1) should equal to I", conversion.convert(1), "I");
    assertEquals("solution(4) should equal to IV", conversion.convert(4), "IV");
    assertEquals("solution(4) should equal to V", conversion.convert(5), "V");
    assertEquals("solution(6) should equal to VI", conversion.convert(6), "VI");
    assertEquals("solution(9) should equal to IX", conversion.convert(9), "IX");
  }

  @Test
  public void shouldCovertDizainesToRoman() {

    assertEquals("solution(10) should equal to X", conversion.convert(10), "X");
    assertEquals("solution(11) should equal to XI", conversion.convert(11), "XI");
    assertEquals("solution(31) should equal to XXXI", conversion.convert(31), "XXXI");
    assertEquals("solution(50) should equal to L", conversion.convert(50), "L");
    assertEquals("solution(92) should equal to XCII", conversion.convert(92), "XCII");
  }

  @Test
  public void shouldCovertCentainesToRoman() {

    assertEquals("solution(100) should equal to C", conversion.convert(100), "C");
    assertEquals("solution(150) should equal to CL", conversion.convert(150), "CL");
    assertEquals("solution(199) should equal to CXCIX", conversion.convert(199), "CXCIX");
    assertEquals("solution(550) should equal to DL", conversion.convert(550), "DL");
    assertEquals("solution(850) should equal to DCCCL", conversion.convert(850), "DCCCL");
    assertEquals("solution(999) should equal to CMXCIX", conversion.convert(999), "CMXCIX");
  }

  @Test
  public void shouldCovertMilliersToRoman() {

    assertEquals("solution(1000) should equal to M", conversion.convert(1000), "M");
    assertEquals("solution(1610) should equal to MDCX", conversion.convert(1610), "MDCX");
    assertEquals("solution(1986) should equal to MCMLXXXVI", conversion.convert(1986), "MCMLXXXVI");
    assertEquals("solution(2000) should equal to MM", conversion.convert(2000), "MM");
    assertEquals("solution(2016) should equal to MMXVI", conversion.convert(2016), "MMXVI");
  }
}
