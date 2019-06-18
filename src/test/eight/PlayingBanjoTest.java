package eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingBanjoTest {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", PlayingBanjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
        assertEquals("Nope!", PlayingBanjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
    }
}
