package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackWardsPrimeTest {

    @Test
    public void backWardsPrime13() {
        assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrime(1, 100));
    }

    @Test
    public void backWardsPrime21() {
        assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrime(9900, 10000));
    }

}
