package eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayingBanjoTest {
  @Test
  public void PeopleThatPlayBanjo() {
    assertEquals("Nope!", PlayingBanjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
    assertEquals("Nope!", PlayingBanjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
  }
}
