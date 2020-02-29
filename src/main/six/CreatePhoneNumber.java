package six;

class CreatePhoneNumber {

  public static String createPhoneNumber(int[] numbers) {
    StringBuilder phoneNumberBuilder = new StringBuilder();

    for (int i = 0; i < numbers.length; i++) {
      if (i == 0) {
        phoneNumberBuilder.append("(");
      } else if (i == 3) {
        phoneNumberBuilder.append(") ");
      } else if (i == 6) {
        phoneNumberBuilder.append("-");
      }
      phoneNumberBuilder.append(numbers[i]);
    }
    return phoneNumberBuilder.toString();
  }
}
