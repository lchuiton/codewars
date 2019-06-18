package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PascalTrianglesTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{1}}, PascalsTriangle.pascal(1), "Depth 1 should return [ [1] ]");
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1},
                {1, 4, 6, 4, 1}}, PascalsTriangle.pascal(5), "Depth 5 should return [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]");
    }
}