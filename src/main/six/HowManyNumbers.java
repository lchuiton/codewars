package six;

import java.util.ArrayList;
import java.util.List;

class HowManyNumbers {

    public static int selNumber(int n, int d) {
        List<Integer> validNumbers = new ArrayList<>();
        for (int i = 10; i < n; i++) {
            String tes = String.valueOf(i);
            char[] charArray = tes.toCharArray();
            boolean isValidNumber = true;
            for (int j = 1; j < charArray.length; j++) {
                if (isValidNumber) {
                    Integer firstDigit = Integer.valueOf(String.valueOf(charArray[j - 1]));
                    Integer secondDigit = Integer.valueOf(String.valueOf(charArray[j]));
                    if (secondDigit <= firstDigit) {
                        isValidNumber = false;
                    }
                    if (secondDigit - firstDigit > d) {
                        isValidNumber = false;
                    }
                }
            }
            if (isValidNumber) {
                validNumbers.add(i);
            }
        }
        return validNumbers.size();
    }

}
