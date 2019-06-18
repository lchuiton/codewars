package six;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
        MatcherAssert.assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}