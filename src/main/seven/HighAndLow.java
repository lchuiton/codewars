package seven;

public class HighAndLow {
  private HighAndLow() {

  }

  public static String highAndLow(String numbers) {
    String[] splitedNumbers = numbers.split(" ");
    Integer max = Integer.valueOf(splitedNumbers[0]);
    Integer min = Integer.valueOf(splitedNumbers[0]);
    for (int i = 1; i < splitedNumbers.length; i++) {
      max = Math.max(max, Integer.valueOf(splitedNumbers[i]));
      min = Math.min(min, Integer.valueOf(splitedNumbers[i]));
    }
    return max + " " + min;
  }
}
