package four;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class UnflattenListTest {

	@Ignore
	@Test
	public void basicTests_1() {

		Object[] input = new Object[] { 4, 5, 1, 7, 1 };
		Object[] expected = new Object[] { new Object[] { 4, new Object[] { 5, 1, 7 } }, 1 };
		Assert.assertThat(UnflattenList.unflatten(input, 2), CoreMatchers.equalTo(expected));
	}

	@Ignore
	@Test
	public void basicTests_2() {

		Object[] input = new Object[] { 12, 1, 5, 3, 1, 55, 2, 3, 7, 8, 1 };
		Object[] expected = new Object[] { 12, 1, new Object[] { 5, new Object[] { 3, 1, 55 }, 2 },
				new Object[] { 3, 7, 8 }, 1 };
		Assert.assertThat(UnflattenList.unflatten(input, 3), CoreMatchers.equalTo(expected));
	}
}