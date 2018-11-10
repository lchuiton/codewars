package seven;

class HighAndLow {

  private HighAndLow() {

  }

  public static String highAndLow(String numbers) {
    String[] splitedNumbers = numbers.split(" ");
    int max = Integer.valueOf(splitedNumbers[0]);
    int min = Integer.valueOf(splitedNumbers[0]);
    for (int i = 1; i < splitedNumbers.length; i++) {
      max = Math.max(max, Integer.valueOf(splitedNumbers[i]));
      min = Math.min(min, Integer.valueOf(splitedNumbers[i]));
    }
    return max + " " + min;
  }
}
