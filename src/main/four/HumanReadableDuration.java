package four;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class HumanReadableDuration {

  public static String formatDuration(int seconds) {
    if (seconds == 0) {
      return "now";
    }

    int secondsInAMinute = 60;
    int secondsInAHour = secondsInAMinute * 60;
    int secondsInADay = secondsInAHour * 24;
    int secondsInAYear = secondsInADay * 365;

    List<Pair<String, Integer>> tableOfTimes = new ArrayList<>();

    int numberOfYears = seconds / secondsInAYear;
    if (numberOfYears > 0) {
      tableOfTimes.add(Pair.of("year", numberOfYears));
    }
    int remainingSecond = seconds % secondsInAYear;
    int numberOfDays = remainingSecond / secondsInADay;
    if (numberOfDays > 0) {
      tableOfTimes.add(Pair.of("day", numberOfDays));
    }
    remainingSecond = remainingSecond % secondsInADay;
    int numberOfHours = remainingSecond / secondsInAHour;
    if (numberOfHours > 0) {
      tableOfTimes.add(Pair.of("hour", numberOfHours));
    }
    remainingSecond = remainingSecond % secondsInAHour;
    int numberOfMinutes = remainingSecond / secondsInAMinute;
    if (numberOfMinutes > 0) {
      tableOfTimes.add(Pair.of("minute", numberOfMinutes));
    }
    int numberOfSeconds = seconds % secondsInAMinute;
    if (numberOfSeconds > 0) {
      tableOfTimes.add(Pair.of("second", numberOfSeconds));
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < tableOfTimes.size(); i++) {
      if (i > 0) {
        if (i < tableOfTimes.size() - 1) {
          sb.append(", ");
        } else {
          sb.append(" and ");
        }
      }
      sb.append(tableOfTimes.get(i).getRight());
      sb.append(" ");
      sb.append(tableOfTimes.get(i).getLeft());
      if (tableOfTimes.get(i).getRight() > 1) {
        sb.append("s");
      }
    }

    return sb.toString();
  }
}
