package six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidPhoneNumber {

  public static boolean validPhoneNumber(String phoneNumber) {
    Pattern pattern = Pattern.compile("^[(][0-9]{3}[)]\\s[0-9]{3}-[0-9]{4}$");
    Matcher matcher = pattern.matcher(phoneNumber);
    return matcher.find();
  }
}
