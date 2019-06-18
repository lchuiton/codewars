package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareEveryDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
    }

}