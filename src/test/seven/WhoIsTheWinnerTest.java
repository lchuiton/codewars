package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoIsTheWinnerTest {

    @Test
    public void test1() {
        assertEquals(WhoIsTheWinner.declareWinner(new WhoIsTheWinner.Fighter("Lew", 10, 2), new WhoIsTheWinner.Fighter("Harry", 5, 4), "Lew"), "Lew");
    }

    @Test
    public void test2() {
        assertEquals(WhoIsTheWinner.declareWinner(new WhoIsTheWinner.Fighter("Lew", 10, 2), new WhoIsTheWinner.Fighter("Harry", 5, 4), "Harry"), "Harry");
    }

    @Test
    public void test3() {
        assertEquals(WhoIsTheWinner.declareWinner(new WhoIsTheWinner.Fighter("Harald", 20, 5), new WhoIsTheWinner.Fighter("Harry", 5, 4), "Harry"), "Harald");
    }

    @Test
    public void test4() {
        assertEquals(WhoIsTheWinner.declareWinner(new WhoIsTheWinner.Fighter("Harald", 20, 5), new WhoIsTheWinner.Fighter("Harry", 5, 4), "Harald"), "Harald");
    }

    @Test
    public void test5() {
        assertEquals(WhoIsTheWinner.declareWinner(new WhoIsTheWinner.Fighter("Jerry", 30, 3), new WhoIsTheWinner.Fighter("Harald", 20, 5), "Jerry"), "Harald");
    }

    @Test
    public void test6() {
        assertEquals(WhoIsTheWinner.declareWinner(new WhoIsTheWinner.Fighter("Jerry", 30, 3), new WhoIsTheWinner.Fighter("Harald", 20, 5), "Harald"), "Harald");
    }
}
