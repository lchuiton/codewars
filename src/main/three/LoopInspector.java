package three;

import util.Node;

import java.util.ArrayList;
import java.util.List;

public class LoopInspector {

  public int loopSize(Node node) {
    List<Node> liste = new ArrayList<>();
    liste.add(node);
    Node nodeSuivant = node.getNext();
    while (liste.indexOf(nodeSuivant) < 0) {
      liste.add(nodeSuivant);
      nodeSuivant = nodeSuivant.getNext();
    }

    return liste.size() - liste.indexOf(nodeSuivant);
  }

}