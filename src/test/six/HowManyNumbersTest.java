package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowManyNumbersTest {

	@Test
	public void test2() {
		assertEquals(0, HowManyNumbers.selNumber(0, 1));
	}

	@Test
	public void test3() {
		assertEquals(0, HowManyNumbers.selNumber(3, 1));
	}

	@Test
	public void test4() {
		assertEquals(1, HowManyNumbers.selNumber(13, 1));
	}

	@Test
	public void test5() {
		assertEquals(1, HowManyNumbers.selNumber(15, 1));
	}

	@Test
	public void test6() {
		assertEquals(2, HowManyNumbers.selNumber(20, 2));
	}

	@Test
	public void test7() {
		assertEquals(4, HowManyNumbers.selNumber(30, 2));
	}

	@Test
	public void test8() {
		assertEquals(6, HowManyNumbers.selNumber(44, 2));
	}

	@Test
	public void test9() {
		assertEquals(12, HowManyNumbers.selNumber(50, 3));
	}

	@Test
	public void test10() {
		assertEquals(21, HowManyNumbers.selNumber(100, 3));
	}

}
