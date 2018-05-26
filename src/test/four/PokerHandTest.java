package four;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PokerHandTest {

    private PokerHand.Result loss = PokerHand.Result.LOSS;
    private PokerHand.Result win = PokerHand.Result.WIN;
    private PokerHand.Result tie = PokerHand.Result.TIE;

    @Ignore
    @Test
    public void test01() {
        Test("Highest straight flush wins", loss, "2H 3H 4H 5H 6H", "KS AS TS QS JS");
    }

    @Ignore
    @Test
    public void test02() {
        Test("Straight flush wins of 4 of a kind", win, "2H 3H 4H 5H 6H", "AS AD AC AH JD");
    }

    @Ignore
    @Test
    public void test03() {
        Test("Highest 4 of a kind wins", win, "AS AH 2H AD AC", "JS JD JC JH 3D");
    }

    @Ignore
    @Test
    public void test04() {
        Test("4 Of a kind wins of full house", loss, "2S AH 2H AS AC", "JS JD JC JH AD");
    }

    @Ignore
    @Test
    public void test05() {
        Test("Full house wins of flush", win, "2S AH 2H AS AC", "2H 3H 5H 6H 7H");
    }

    @Ignore
    @Test
    public void test06() {
        Test("Highest flush wins", win, "AS 3S 4S 8S 2S", "2H 3H 5H 6H 7H");
    }

    @Ignore
    @Test
    public void test07() {
        Test("Flush wins of straight", win, "2H 3H 5H 6H 7H", "2S 3H 4H 5S 6C");
    }

    @Ignore
    @Test
    public void test08() {
        Test("Equal straight is tie", tie, "2S 3H 4H 5S 6C", "3D 4C 5H 6H 2S");
    }

    @Ignore
    @Test
    public void test09() {
        Test("Straight wins of three of a kind", win, "2S 3H 4H 5S 6C", "AH AC 5H 6H AS");
    }

    @Ignore
    @Test
    public void test10() {
        Test("3 Of a kind wins of two pair", loss, "2S 2H 4H 5S 4C", "AH AC 5H 6H AS");
    }

    @Ignore
    @Test
    public void test11() {
        Test("2 Pair wins of pair", win, "2S 2H 4H 5S 4C", "AH AC 5H 6H 7S");
    }

    @Ignore
    @Test
    public void test12() {
        Test("Highest pair wins", loss, "6S AD 7H 4S AS", "AH AC 5H 6H 7S");
    }

    @Ignore
    @Test
    public void test13() {
        Test("Pair wins of nothing", loss, "2S AH 4H 5S KC", "AH AC 5H 6H 7S");
    }

    @Ignore
    @Test
    public void test14() {
        Test("Highest card loses", loss, "2S 3H 6H 7S 9C", "7H 3C TH 6H 9S");
    }

    @Ignore
    @Test
    public void test15() {
        Test("Highest card wins", win, "4S 5H 6H TS AC", "3S 5H 6H TS AC");
    }

    @Ignore
    @Test
    public void test16() {
        Test("Equal cards is tie", tie, "2S AH 4H 5S 6C", "AD 4C 5H 6H 2C");
    }

    private void Test(String description, PokerHand.Result expected, String playerHand, String opponentHand) {
        PokerHand player = new PokerHand(playerHand);
        PokerHand opponent = new PokerHand(opponentHand);

        Assert.assertEquals(description + ":", expected, player.compareWith(opponent));
    }

}
