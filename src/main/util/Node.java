package util;

import java.util.LinkedList;

/**
 * Utiliser pour le cas de test du kata "LoopInspector" A FAIRE
 * 
 * @author lchuiton
 * 
 */
public class Node {

  private static LinkedList<Node> liste;

  public static Node createChain(int tailSize, int loopSize) {
    liste = new LinkedList<>();
    liste.add(new Node());
    liste.add(tailSize, new Node());
    liste.add(loopSize, new Node());
    return liste.element();
  }

  public Node getNext() {
    return liste.getFirst();
  }

}
