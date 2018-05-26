package six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
  public static boolean validPhoneNumber(String phoneNumber) {
    Pattern pattern = Pattern.compile("^[(]{1}[0-9]{3}[)]{1}\\s[0-9]{3}-[0-9]{4}$");
    Matcher matcher = pattern.matcher(phoneNumber);
    return matcher.find();
  }
}