package five;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrafficJamTest {

    @Ignore
    @Test
    public void giveway() {
        assertEquals("abcCdCeCECX", TrafficJam.trafficJam("abcdeXghi",
                new String[]{"", "", "CCCCC", "", "EEEEEEEEEE", "FFFFFF", "", "", "IIIIII"}));
    }

    @Ignore
    @Test
    public void noSideStreets() {
        assertEquals("abcdefX", TrafficJam.trafficJam("abcdefX", new String[0]));
        assertEquals("abcX", TrafficJam.trafficJam("abcXdef", new String[0]));
        assertEquals("X", TrafficJam.trafficJam("Xabcdef", new String[0]));
    }

    @Ignore
    @Test
    public void example() {
        assertEquals("abcdBeBfBgBhBiBCjCkClCmCX", TrafficJam.trafficJam("abcdefghijklmX",
                new String[]{"", "", "", "BBBBBB", "", "", "", "", "CCCCC"}));
    }

}
