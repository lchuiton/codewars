package five;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PaginationHelperTest {

    @Test
    public void testSomething() {
        PaginationHelper<Character> helper = new PaginationHelper<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(2, helper.pageCount());
        assertEquals(6, helper.itemCount());
        assertEquals(4, helper.pageItemCount(0));
        assertEquals(2, helper.pageItemCount(1));
        assertEquals(-1, helper.pageItemCount(2));

        assertEquals(1, helper.pageIndex(5));
        assertEquals(0, helper.pageIndex(2));
        assertEquals(-1, helper.pageIndex(20));
        assertEquals(-1, helper.pageIndex(-10));

    }
}