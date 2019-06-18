package four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();

    @Test
    public void shouldWorkWithEmptyString() {
        assertEquals(0, calc.evaluate(""), 0, "Should work with empty string");
    }

    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calc.evaluate("1 2 3"), 0, "Should parse numbers");
    }

    @Test
    public void shouldParseFloatNumbers() {
        assertEquals(3.5, calc.evaluate("1 2 3.5"), 0, "Should parse float numbers");
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calc.evaluate("1 3 +"), 0, "Should support addition");
    }

    @Test
    public void shouldSupportComplexAddition() {
        assertEquals(7, calc.evaluate("3 1 3 + +"), 0, "Should support addition");
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calc.evaluate("1 3 *"), 0, "Should support multiplication");
    }

    @Test
    public void shouldSupportSubstraction() {
        assertEquals(-2, calc.evaluate("1 3 -"), 0, "Should support substraction");
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0, "Should support division");
    }

    @Test
    public void shouldSupportFloatDivision() {
        assertEquals(2.5, calc.evaluate("5 2 /"), 0, "Should support division");
    }
}
