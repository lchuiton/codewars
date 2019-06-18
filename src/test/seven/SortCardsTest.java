package seven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortCardsTest {

    private SortCards sortCards;

    @BeforeEach
    public void setUp() {
        sortCards = new SortCards();
    }

    @AfterEach
    public void tearDown() {
        sortCards = null;
    }

    @Test
    public void basicTests() {
        // / Example test case
        Assertions.assertArrayEquals(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"},
                sortCards.sortCards(new String[]{"3", "9", "A", "5", "T", "8", "2", "4", "Q", "7", "J", "6", "K"}));
        Assertions.assertArrayEquals(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"},
                sortCards.sortCards(new String[]{"Q", "2", "8", "6", "J", "K", "3", "9", "5", "A", "4", "7", "T"}));
        Assertions.assertArrayEquals(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"},
                sortCards.sortCards(new String[]{"5", "4", "T", "Q", "K", "J", "6", "9", "3", "2", "7", "A", "8"}));
    }

}
