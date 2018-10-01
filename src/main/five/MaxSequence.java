package five;

import java.util.ArrayList;
import java.util.List;

class MaxSequence {

    public static int sequence(int[] arr) {
        List<Integer> liste = new ArrayList<>();
        for (int anArr : arr) {
            liste.add(anArr);

        }

        int maxSumSubsequence = 0;
        for (int i = 0; i < liste.size(); i++) {
            for (int j = i; j < liste.size(); j++) {
                List<Integer> subsequence = liste.subList(i, j + 1);

                maxSumSubsequence = Math.max(maxSumSubsequence, calcSumSubsequence(subsequence));
            }
        }
        return maxSumSubsequence;
    }

    private static int calcSumSubsequence(List<Integer> subsequence) {
        Integer somme = 0;
        for (Integer i : subsequence) {
            somme += i;
        }
        return somme;
    }
}
