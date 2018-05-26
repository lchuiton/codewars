package five;

public class HumanReadableTime {
  private static final int SECONDS_IN_HOUR = 3600;

  private static final int SECONDS_IN_MINUTES = 60;

  private HumanReadableTime() {

  }

  public static String makeReadable(int seconds) {

    int heures = seconds / SECONDS_IN_HOUR;
    int minutes = seconds % SECONDS_IN_HOUR / SECONDS_IN_MINUTES;
    int secondes = seconds % SECONDS_IN_HOUR % SECONDS_IN_MINUTES;

    return formatLength(heures) + ":" + formatLength(minutes) + ":" + formatLength(secondes);
  }

  private static String formatLength(int time) {
    return time < 10 ? "0" + time : String.valueOf(time);
  }
}
