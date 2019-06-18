package four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConversionTest {

    private final RomanConversion conversion = new RomanConversion();

    @Test
    public void shouldCovertUnitesToRoman() {
        assertEquals("solution(1) should equal to ", "", conversion.convert(0));
        assertEquals("solution(1) should equal to I", "I", conversion.convert(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.convert(4));
        assertEquals("solution(4) should equal to V", "V", conversion.convert(5));
        assertEquals("solution(6) should equal to VI", "VI", conversion.convert(6));
        assertEquals("solution(9) should equal to IX", "IX", conversion.convert(9));
    }

    @Test
    public void shouldCovertDizainesToRoman() {

        assertEquals("solution(10) should equal to X", "X", conversion.convert(10));
        assertEquals("solution(11) should equal to XI", "XI", conversion.convert(11));
        assertEquals("solution(31) should equal to XXXI", "XXXI", conversion.convert(31));
        assertEquals("solution(50) should equal to L", "L", conversion.convert(50));
        assertEquals("solution(92) should equal to XCII", "XCII", conversion.convert(92));
    }

    @Test
    public void shouldCovertCentainesToRoman() {

        assertEquals("solution(100) should equal to C", "C", conversion.convert(100));
        assertEquals("solution(150) should equal to CL", "CL", conversion.convert(150));
        assertEquals("solution(199) should equal to CXCIX", "CXCIX", conversion.convert(199));
        assertEquals("solution(550) should equal to DL", "DL", conversion.convert(550));
        assertEquals("solution(850) should equal to DCCCL", "DCCCL", conversion.convert(850));
        assertEquals("solution(999) should equal to CMXCIX", "CMXCIX", conversion.convert(999));
    }

    @Test
    public void shouldCovertMilliersToRoman() {

        assertEquals("solution(1000) should equal to M", "M", conversion.convert(1000));
        assertEquals("solution(1610) should equal to MDCX", "MDCX", conversion.convert(1610));
        assertEquals("solution(1986) should equal to MCMLXXXVI", "MCMLXXXVI", conversion.convert(1986));
        assertEquals("solution(2000) should equal to MM", "MM", conversion.convert(2000));
        assertEquals("solution(2016) should equal to MMXVI", "MMXVI", conversion.convert(2016));
    }
}
