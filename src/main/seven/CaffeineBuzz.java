package seven;

class CaffeineBuzz {

  public static String caffeineBuzz(int n) {
    StringBuilder sb = new StringBuilder();
    if (n % 3 == 0) {
      if (n % 4 == 0) {
        sb.append("Coffee");
      } else {
        sb.append("Java");
      }
      if (n % 2 == 0) {
        sb.append("Script");
      }
    } else {

      sb.append("mocha_missing!");
    }
    return sb.toString();
  }
}
