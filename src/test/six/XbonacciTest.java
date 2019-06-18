package six;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class XbonacciTest {

    private Xbonacci variabonacci;

    @BeforeEach
    public void setUp() {
        variabonacci = new Xbonacci();
    }

    @AfterEach
    public void tearDown() {
        variabonacci = null;
    }

    @Test
    public void testEmpty() {
        Assertions.assertTrue(Arrays.equals(new double[]{}, variabonacci.tribonacci(new double[]{1, 1, 1}, 0)));
    }

    @Test
    public void testSimple3() {
        double[] test = new double[]{1, 1, 1};
        Assertions.assertTrue(Arrays.equals(test, variabonacci.tribonacci(new double[]{1, 1, 1}, 3)));
    }

    @Test
    public void testSimple4() {
        Assertions.assertTrue(Arrays.equals(new double[]{1, 1, 1, 3}, variabonacci.tribonacci(new double[]{1, 1, 1}, 4)));
    }

    @Test
    public void basicTests() {
        Assertions.assertTrue(Arrays.equals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, variabonacci.tribonacci(new double[]{1, 1, 1}, 10)));
        Assertions.assertTrue(Arrays.equals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, variabonacci.tribonacci(new double[]{0, 0, 1}, 10)));
        Assertions.assertTrue(Arrays.equals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, variabonacci.tribonacci(new double[]{0, 1, 1}, 10)));
    }

    @Test
    public void testSimpleLessThan3Iter() {
        Assertions.assertTrue(Arrays.equals(new double[]{15}, variabonacci.tribonacci(new double[]{15, 17, 7}, 1)));
    }

}
