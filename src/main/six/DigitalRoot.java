package six;

public class DigitalRoot {

  public static int calculate(int number) {
    int result = number;
    while (result > 9) {

      char[] temp = String.valueOf(result).toCharArray();
      result = 0;
      for (int i = 0; i < temp.length; i++) {
        result += Character.getNumericValue(temp[i]);
      }

    }
    return result;
  }

}
