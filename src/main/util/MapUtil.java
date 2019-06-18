package util;

import java.util.*;

public class MapUtil {

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0) {
                    return compareKeys(o1.getKey(), o2.getKey());
                } else {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            }

            private int compareKeys(K o1, K o2) {
                return o1.toString().compareTo(o2.toString());

            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}