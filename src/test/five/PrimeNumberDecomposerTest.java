/*
package five;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@ExtendWith(ParameterResolver.class)
public class PrimeNumberDecomposerTest {

    private static PrimeNumberDecomposer worker;

    private long n;

    private Long[] factors;

    private Long[][] uniqueFactors;

    private Long[] factorProducts;


*/
/*    public PrimeNumberDecomposerTest(long n, long[] factors, long[][] uniqueFactors, long[] factorProducts) {
        this.n = n;
        this.factors = Long2long(factors);
        this.uniqueFactors = new Long[2][];
        this.uniqueFactors[0] = Long2long(uniqueFactors[0]);
        this.uniqueFactors[1] = Long2long(uniqueFactors[1]);
        this.factorProducts = Long2long(factorProducts);
    }*//*



    public static Collection<?> tests() {
        return Arrays.asList(new Object[][]{{2L, new long[]{2L}, new long[][]{new long[]{2L}, new long[]{1L}}, new long[]{2L}},
                {0L, new long[]{}, new long[][]{new long[]{}, new long[]{}}, new long[]{}},
                {1L, new long[]{1L}, new long[][]{new long[]{1L}, new long[]{1L}}, new long[]{1L}},
                {100L, new long[]{2L, 2L, 5L, 5L}, new long[][]{new long[]{2L, 5L}, new long[]{2L, 2L}}, new long[]{4L, 25L}},
                {135L, new long[]{3L, 3L, 3L, 5L}, new long[][]{new long[]{3L, 5L}, new long[]{3L, 1L}}, new long[]{27L, 5L}}});
    }

    private static Long[] Long2long(long[] data) {
        Long[] result = new Long[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i];
        }
        return result;
    }

    private static String arrayAsString(Long[] data) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                result.append(",");
            }
            result.append(data[i]);
        }
        return result.toString();
    }

    @BeforeAll
    public static void init() {
        worker = new PrimeNumberDecomposer();
    }

    @ParameterizedTest
    @MethodSource("tests")
    public void test() {
        Long[] factors = worker.getAllPrimeFactors(n);
        Long[][] uniqueFactors = worker.getUniquePrimeFactorsWithCount(n);
        Long[] factorProducts = worker.getPrimeFactorPotencies(n);
        */
/*
 * I tried assertArrayEquals, but if array length is correct and values are
 * different, the message is not printed, making it harder to debug for
 * candidates
 *//*

        assertEquals(arrayAsString(this.factors),
                arrayAsString(factors), "Factors should be " + arrayAsString(this.factors) + ", but is " + arrayAsString(factors));
        assertEquals(
                arrayAsString(this.factorProducts), arrayAsString(factorProducts), "Factors products should be " + arrayAsString(this.factorProducts) + ", but is " + arrayAsString(factorProducts));
        assertEquals(2,
                uniqueFactors.length, "getUniquePrimeFactorsWithCount(" + n + "): First dimension of returned array should be size 2, is " + uniqueFactors.length);
        assertEquals(arrayAsString(this.uniqueFactors[0]), arrayAsString(uniqueFactors[0]), "getUniquePrimeFactorsWithCount(" + n + "): Unique primes should be " + arrayAsString(this.uniqueFactors[0]) + ", but are "
                + arrayAsString(uniqueFactors[0]));
        assertEquals(arrayAsString(this.uniqueFactors[1]), arrayAsString(uniqueFactors[1]), "getUniquePrimeFactorsWithCount(" + n + "): Unique primes count should be " + arrayAsString(this.uniqueFactors[1]) + ", but are "
                + arrayAsString(this.uniqueFactors[1]));
    }
}
*/
