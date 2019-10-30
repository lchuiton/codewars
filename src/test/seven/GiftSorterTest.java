package seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftSorterTest {

    @Test
    public void Tests1() {
        GiftSorter gs = new GiftSorter();
        assertEquals("sort fedcba", gs.sortGiftCode("fedcba"), "abcdef");
    }

    @Test
    public void Tests2() {
        GiftSorter gs = new GiftSorter();
        assertEquals("reverse alphabet", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"), "abcdefghijklmnopqrstuvwxyz");
    }

}