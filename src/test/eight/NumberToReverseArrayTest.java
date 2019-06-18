package eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumberToReverseArrayTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, NumberToReverseArray.digitize(35231));
    }
}