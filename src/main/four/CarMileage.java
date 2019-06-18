package four;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {

        if (isAnInterestingMileage(number, awesomePhrases)) {
            return 2;
        } else if (isAnInterestingMileage(number + 1, awesomePhrases) || isAnInterestingMileage(number + 2, awesomePhrases)) {
            return 1;
        }
        return 0;

    }

    private static Boolean isAnInterestingMileage(int number, int[] awesomePhrases) {
        if (number < 100) {
            return FALSE;
        }

        char[] decomposedNumberInChar = String.valueOf(number).toCharArray();
        int[] decomposedNumber = new int[decomposedNumberInChar.length];
        for (int i = 0; i < decomposedNumberInChar.length; i++) {
            decomposedNumber[i] = Character.getNumericValue(decomposedNumberInChar[i]);
        }

        if (isFullOfZeros(decomposedNumber)) {
            return TRUE;
        }

        if (isAwesome(number, awesomePhrases)) {
            return TRUE;
        }

        if (allDigitsAreEquals(decomposedNumber)) {
            return TRUE;
        }
        if (isSequentialIncrementing(decomposedNumber)) {
            return TRUE;
        }
        if (isSequentialDecrementing(decomposedNumber)) {
            return TRUE;
        }
        if (isPalindrome(decomposedNumber)) {
            return TRUE;
        }

        return FALSE;

    }

    private static boolean isPalindrome(int[] decomposedNumber) {
        for (int i = 0; i < decomposedNumber.length / 2; i++) {
            if (decomposedNumber[i] != decomposedNumber[decomposedNumber.length - (i + 1)]) {
                return FALSE;
            }
        }
        return TRUE;
    }

    private static boolean isSequentialIncrementing(int[] decomposedNumber) {
        for (int i = 1; i < decomposedNumber.length; i++) {
            if (decomposedNumber[i - 1] != (decomposedNumber[i] + 9) % 10) {
                return FALSE;
            }
        }
        return TRUE;
    }

    private static boolean isSequentialDecrementing(int[] decomposedNumber) {
        for (int i = 1; i < decomposedNumber.length; i++) {
            if (decomposedNumber[i - 1] != decomposedNumber[i] + 1) {
                return FALSE;
            }
        }
        return TRUE;
    }

    private static Boolean allDigitsAreEquals(int[] decomposedNumber) {
        for (int i = 1; i < decomposedNumber.length; i++) {
            if (decomposedNumber[i - 1] != decomposedNumber[i]) {
                return FALSE;
            }
        }
        return TRUE;
    }

    private static boolean isAwesome(int number, int[] awesomePhrases) {
        List<Integer> awesomePhrasesList = new ArrayList<>();
        for (int awesomePhrase : awesomePhrases) {
            awesomePhrasesList.add(awesomePhrase);
        }

        if (awesomePhrasesList.contains(number)) {
            return TRUE;
        }
        return FALSE;
    }

    private static Boolean isFullOfZeros(int[] decomposedNumber) {
        for (int i = 1; i < decomposedNumber.length; i++) {
            if (decomposedNumber[i] != 0) {
                return FALSE;
            }
        }

        return TRUE;
    }
}
