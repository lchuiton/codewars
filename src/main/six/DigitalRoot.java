package six;

class DigitalRoot {

    public static int calculate(int number) {
        int result = number;
        while (result > 9) {

            char[] temp = String.valueOf(result).toCharArray();
            result = 0;
            for (char aTemp : temp) {
                result += Character.getNumericValue(aTemp);
            }

        }
        return result;
    }

}
