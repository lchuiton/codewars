package eight;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberToReverseArrayTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, NumberToReverseArray.digitize(35231));
    }
}