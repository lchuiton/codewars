package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestValueInArrayTest {

    @Test
    public void testSample() {
        assertEquals(0, SmallestValueInArray.findSmallest(new int[]{1, 2, 3}, "index"), "The smallest index");
        assertEquals(2, SmallestValueInArray.findSmallest(new int[]{7, 12, 3, 2, 27}, "value"), "The smallest value");
        assertEquals(3, SmallestValueInArray.findSmallest(new int[]{7, 12, 3, 2, 27}, "index"), "The smallest index");
    }
}