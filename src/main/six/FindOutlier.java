package six;

import java.util.ArrayList;
import java.util.List;

class FindOutlier {
    public static int find(int[] integers) {
        List<Integer> listOdd = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();

        for (int number : integers) {
            if (number % 2 != 0) {
                listEven.add(number);
            } else {
                listOdd.add(number);
            }
            if (listEven.size() > 1 && listOdd.size() > 0) {
                return listOdd.get(0);
            } else if (listOdd.size() > 1 && listEven.size() > 0) {
                return listEven.get(0);

            }
        }
        return 0;
    }
}