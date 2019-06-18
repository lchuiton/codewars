package seven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class DescendingOrder {

    public static int sortDesc(int num) {
        String numString = String.valueOf(num);
        char[] charArray = numString.toCharArray();
        List<Integer> intList = new ArrayList<>();
        for (char aCharArray : charArray) {
            intList.add(Integer.valueOf(String.valueOf(aCharArray)));
        }

        intList.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Integer s : intList) {
            sb.append(s);
        }

        return Integer.valueOf(sb.toString());
    }
}
