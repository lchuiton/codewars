package seven;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldWorkForSomeExamples() {
        assertEquals(false, Square.isSquare(-1), "negative numbers aren't square numbers");
        assertEquals(false, Square.isSquare(3), "3 isn't a square number");
        assertEquals(true, Square.isSquare(4), "4 is a square number");
        assertEquals(true, Square.isSquare(25), "25 is a square number");
        assertEquals(false, Square.isSquare(26), "26 isn't a square number");
    }

    @Test
    public void shouldWorkForRandomSquareNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 100; ++i) {
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertEquals(true, Square.isSquare(randomSq), String.format("%d is a square number", randomSq));
        }
    }
}