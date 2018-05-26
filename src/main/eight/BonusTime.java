package eight;

public class BonusTime {
	private BonusTime() {

	}

	public static String bonusTime(final int salary, final boolean bonus) {
		return bonus ? "\u00A3" + 10 * salary : "£" + salary;

	}
}
