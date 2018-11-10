package seven;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class DateDays {

  private DateDays() {

  }

  public static String dateNbDays(double a0, double a, double p) {

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    Calendar depositCalendar = Calendar.getInstance();
    depositCalendar.set(Calendar.YEAR, 2016);
    depositCalendar.set(Calendar.MONTH, 0);
    depositCalendar.set(Calendar.DAY_OF_MONTH, 1);

    Integer nbDeJours = calculerNombreAnneePourAtteindreLaSommeBut(a0, a, p);
    format.format(depositCalendar.getTime());
    depositCalendar.add(Calendar.DAY_OF_MONTH, nbDeJours + 1);
    return format.format(depositCalendar.getTime());
  }

  private static Integer calculerNombreAnneePourAtteindreLaSommeBut(double sommeDepart, double sommeBut, double taux) {
    BigDecimal nom = BigDecimal.valueOf(Math.log(sommeBut / sommeDepart));
    BigDecimal denom = BigDecimal.valueOf(Math.log(1 + taux / 36000));

    BigDecimal nbJours = nom.divide(denom, 0, RoundingMode.FLOOR);

    return Integer.valueOf(nbJours.toString());
  }
}
