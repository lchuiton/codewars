package eight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayingBanjoTest {

  @Test
  public void PeopleThatPlayBanjo() {
    assertEquals("Nope!", PlayingBanjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
    assertEquals("Nope!", PlayingBanjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
  }
}
