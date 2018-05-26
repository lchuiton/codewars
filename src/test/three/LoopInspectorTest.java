package three;

import util.Node;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class LoopInspectorTest {

  @Ignore
  @Test
  public void loop_size_of_3() {
    Node list = Node.createChain(1, 3);
    int result = new LoopInspector().loopSize(list);
    assertEquals("Incorrect loop size", 3, result);
  }

  @Ignore
  @Test
  public void loop_size_of_29() {
    Node list = Node.createChain(21, 29);
    int result = new LoopInspector().loopSize(list);
    assertEquals("Incorrect loop size", 29, result);
  }

  @Ignore
  @Test
  public void loop_size_of_1087() {
    Node list = Node.createChain(3904, 1087);
    int result = new LoopInspector().loopSize(list);
    assertEquals("Incorrect loop size", 1087, result);
  }

  @Ignore
  @Test
  public void loop_size_of_1() {
    Node list = Node.createChain(0, 1);
    int result = new LoopInspector().loopSize(list);
    assertEquals("Incorrect loop size", 1, result);
  }

  @Ignore
  @Test
  public void long_tail_short_loop() {
    Node list = Node.createChain(8778, 23);
    int result = new LoopInspector().loopSize(list);
    assertEquals("Incorrect loop size", 23, result);
  }

  @Ignore
  @Test
  public void short_tail_long_loop() {
    Node list = Node.createChain(23, 8778);
    int result = new LoopInspector().loopSize(list);
    assertEquals("Incorrect loop size", 8778, result);
  }

  @Ignore
  @Test
  public void random_list() {
    for (int i = 0; i < 2; ++i) {
      Random random = new Random();
      int tail = random.nextInt(1000) + 9000;
      int loop = random.nextInt(1000) + 9000;
      Node list = Node.createChain(tail, loop);
      int result = new LoopInspector().loopSize(list);
      assertEquals("Incorrect loop size", loop, result);
    }
  }

}