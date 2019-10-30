package eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayingBanjoTest {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", "Martin does not play banjo", PlayingBanjo.areYouPlayingBanjo("Martin"));
        assertEquals("Nope!", "Rikke plays banjo", PlayingBanjo.areYouPlayingBanjo("Rikke"));
    }
}
