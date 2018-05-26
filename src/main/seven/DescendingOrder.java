package seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String numString = String.valueOf(num);
    char[] charArray = numString.toCharArray();
    List<Integer> intList = new ArrayList<>();
    for (int i = 0; i < charArray.length; i++) {
      intList.add(Integer.valueOf(String.valueOf(charArray[i])));
    }

    Collections.sort(intList, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    });

    StringBuilder sb = new StringBuilder();
    for (Integer s : intList) {
      sb.append(s);
    }

    return Integer.valueOf(sb.toString());
  }
}
