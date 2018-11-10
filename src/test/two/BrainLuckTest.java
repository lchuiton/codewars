package two;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BrainLuckTest {

  @Test
  public void ecriture() {
    assertThat(new BrainLuck(",.").process("test"), is("t"));
  }

  @Test
  public void testEchoUntilByte255Encountered() {
    assertThat(new BrainLuck(",+[-.,+]").process("Codewars" + ((char) 255)), is("Codewars"));
  }

  @Test
  public void testEchoUntilByte0Encountered() {
    assertThat(new BrainLuck(",[.[-],]").process("Codewars" + ((char) 0)), is("Codewars"));
  }

  @Test
  public void testTwoNumbersMultiplier() {
    final char[] input = {8, 9};
    assertThat(new BrainLuck(",>,<[>[->+>+<<]>>[-<<+>>]<<<-]>>.").process(String.valueOf(input[0]) + String.valueOf(input[1])),
        is(String.valueOf((char) (input[0] * input[1]))));
  }

  @Test
  public void testHelloWorld() {
    assertThat(new BrainLuck("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.").process(""),
        is(String.valueOf("Hello World!")));
  }

  @Test
  public void testFibonacci() {
    assertThat(
        new BrainLuck(
            "+++++++++++>+>>>>++++++++++++++++++++++++++++++++++++++++++++>++++++++++++++++++++++++++++++++<<<<<<[>[>>>>>>+>+<<<<<<<-]>>>>>>>[<<<<<<<+>>>>>>>-]<[>++++++++++[-<-[>>+>+<<<-]>>>[<<<+>>>-]+<[>[-]<[-]]>[<<[>>>+<<<-]>>[-]]<<]>>>[>>+>+<<<-]>>>[<<<+>>>-]+<[>[-]<[-]]>[<<+>>[-]]<<<<<<<]>>>>>[++++++++++++++++++++++++++++++++++++++++++++++++.[-]]++++++++++<[->-<]>++++++++++++++++++++++++++++++++++++++++++++++++.[-]<<<<<<<<<<<<[>>>+>+<<<<-]>>>>[<<<<+>>>>-]<-[>>.>.<<<[-]]<<[>>+>+<<<-]>>>[<<<+>>>-]<<[<+>-]>[<+>-]<<<-]")
            .process(""), is(String.valueOf("1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89")));
  }

}