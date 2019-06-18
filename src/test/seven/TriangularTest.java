package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangularTest {

    @Test
    public void test_Two_Should_Be_Three() {
        assertEquals(3, Triangular.triangular(2));
    }

    @Test
    public void test_Four_Should_Be_Ten() {
        assertEquals(10, Triangular.triangular(4));
    }
}