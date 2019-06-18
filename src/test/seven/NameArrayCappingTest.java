package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NameArrayCappingTest {

    @Test
    public void downcase() {
        String[] strings = new String[]{"jo", "nelson", "jurie"};
        assertArrayEquals(new String[]{"Jo", "Nelson", "Jurie"}, NameArrayCapping.capMe(strings));
    }

    @Test
    public void testNull() {
        String[] strings = new String[]{};
        assertArrayEquals(new String[]{}, NameArrayCapping.capMe(strings));
    }

    @Test
    public void testEmpty() {
        String[] strings = new String[]{""};
        assertArrayEquals(new String[]{""}, NameArrayCapping.capMe(strings));
    }
}