package eight;

import org.junit.Assert;
import org.junit.Test;


public class BonusTimeTest {

  @Test
  public void basicTests() {
    Assert.assertEquals("\u00A3100000", BonusTime.bonusTime(10000, true));
    Assert.assertEquals("\u00A3250000", BonusTime.bonusTime(25000, true));
    Assert.assertEquals("\u00A310000", BonusTime.bonusTime(10000, false));
    Assert.assertEquals("\u00A360000", BonusTime.bonusTime(60000, false));
    Assert.assertEquals("\u00A320", BonusTime.bonusTime(2, true));
    Assert.assertEquals("\u00A378", BonusTime.bonusTime(78, false));
    Assert.assertEquals("\u00A3678900", BonusTime.bonusTime(67890, true));
  }

}